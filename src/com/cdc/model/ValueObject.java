package com.cdc.model;
/**
 * 各个数据库对象的父类
 * @author cdc
 *
 */
public class ValueObject {
	//ID字段,对应数据库中的ID列
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
