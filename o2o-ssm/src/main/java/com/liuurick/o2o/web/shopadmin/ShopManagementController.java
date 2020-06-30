package com.liuurick.o2o.web.shopadmin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liuurick.o2o.dto.ShopExecution;
import com.liuurick.o2o.entity.PersonInfo;
import com.liuurick.o2o.entity.Shop;
import com.liuurick.o2o.enums.ShopStateEnum;
import com.liuurick.o2o.service.ShopService;
import com.liuurick.o2o.util.HttpServletRequestUtil;
import com.liuurick.o2o.util.ImageUtil;
import com.liuurick.o2o.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liubin on 2020/6/29
 */
@Controller
@RequestMapping("/shopadmin")
public class ShopManagementController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/registershop",method = RequestMethod.POST)
    @ResponseBody
    private Map<String,Object> registerShop(HttpServletRequest request){
        Map<String,Object> modleMap = new HashMap<String, Object>();
        //1.接受并转化相应的参数，包括店铺信息及图片信息
        String shopStr = HttpServletRequestUtil.getString(request,"shopStr");
        ObjectMapper mapper = new ObjectMapper();

        Shop shop = null;
        try {
            shop = mapper.readValue(shopStr,Shop.class);
        }catch (Exception e){
            modleMap.put("success",false);
            modleMap.put("errMsg",e.getMessage());
            return modleMap;
        }
        CommonsMultipartFile shopImg = null;
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        if (commonsMultipartResolver.isMultipart(request)){
            MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
            shopImg = (CommonsMultipartFile)multipartHttpServletRequest.getFile("shopImg");
        }else {
            modleMap.put("success",false);
            modleMap.put("errMsg","上传图片不能为空");
            return modleMap;
        }
        //2.注册店铺
        if (shop != null && shopImg != null){
            PersonInfo owner = new PersonInfo();
            owner.setUserId(1L);
            shop.setOwner(owner);
            File shopImgFile = new File(PathUtil.getImgBasePath()+ ImageUtil.getRandomFileName());
            try {
                shopImgFile.createNewFile();
            } catch (IOException e) {
                modleMap.put("success",false);
                modleMap.put("errMsg",e.getMessage());
                return modleMap;
            }
            try {
                inputStreamToFile(shopImg.getInputStream(),shopImgFile);
            } catch (IOException e) {
                modleMap.put("success",false);
                modleMap.put("errMsg",e.getMessage());
                return modleMap;
            }
            ShopExecution se = shopService.addShop(shop,shopImgFile);
            if (se.getState() == ShopStateEnum.CHECK.getState()){
                modleMap.put("success",true);
            }else {
                modleMap.put("success",false);
                modleMap.put("errMsg",se.getStateInfo());
            }
            return modleMap;
        }else {
            modleMap.put("success",false);
            modleMap.put("errMsg","请输入店铺信息");
            return modleMap;
        }
        //3.返回结果

    }

    private static void inputStreamToFile(InputStream ins, File file) throws IOException {
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[1024];
            while ((bytesRead = ins.read(buffer))!= -1){
                os.write(buffer,0,bytesRead);
            }
        }catch (Exception e){
            throw new RuntimeException("调用inputStreamTOFile产生异常"+e.getMessage());
        }finally {
            try {
                if (os!=null){
                    os.close();
                }
                if (ins!=null){
                    ins.close();
                }
            }catch (IOException e){
                throw new RuntimeException("inputStreamTOFile关闭产生异常"+e.getMessage());
            }
        }
    }
}
