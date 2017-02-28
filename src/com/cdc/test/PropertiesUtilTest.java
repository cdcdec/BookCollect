package com.cdc.test;


import com.cdc.jdbc.PropertiesUtil;

public class PropertiesUtilTest {
	//获得驱动
	private static String DRIVER = PropertiesUtil.JDBC_DRIVER;
	public static void main(String[] args){
		
		System.out.println("JDBC_DRIVER="+DRIVER);

	}

}
