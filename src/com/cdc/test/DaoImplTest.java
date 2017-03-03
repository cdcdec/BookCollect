package com.cdc.test;

import java.util.List;

import com.cdc.dao.impl.DynastyDaoImpl;
import com.cdc.model.Dynasty;

public class DaoImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynastyDaoImpl  dynastyDaoImpl=new DynastyDaoImpl();
		List<Dynasty>  lists=dynastyDaoImpl.findDynastys();
		for(Dynasty  dy :lists){
			System.out.println(dy.getDynasty_name()+",id="+dy.getId());
		}

	}

}
