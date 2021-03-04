package com.liuurick.o2o.dto;

import java.util.List;

import com.liuurick.o2o.entity.PersonInfo;
import com.liuurick.o2o.enums.PersonInfoStateEnum;
import lombok.Data;

/**
 * 封装执行后结果
 */
@Data
public class PersonInfoExecution {

	// 结果状态
	private int state;

	// 状态标识
	private String stateInfo;

	// 店铺数量
	private int count;

	// 操作的personInfo（增删改店铺的时候用）
	private PersonInfo personInfo;

	// 获取的personInfo列表(查询店铺列表的时候用)
	private List<PersonInfo> personInfoList;

	public PersonInfoExecution() {
	}

	// 失败的构造器
	public PersonInfoExecution(PersonInfoStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// 成功的构造器
	public PersonInfoExecution(PersonInfoStateEnum stateEnum, PersonInfo personInfo) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.personInfo = personInfo;
	}

	// 成功的构造器
	public PersonInfoExecution(PersonInfoStateEnum stateEnum, List<PersonInfo> personInfoList) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.personInfoList = personInfoList;
	}

}