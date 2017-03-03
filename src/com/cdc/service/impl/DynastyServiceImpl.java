package com.cdc.service.impl;

import java.util.List;

import com.cdc.dao.impl.DynastyDaoImpl;
import com.cdc.model.Dynasty;
import com.cdc.service.DynastyService;

public class DynastyServiceImpl implements DynastyService {
	
	
	private DynastyDaoImpl  dynastyDaoImpl;
	
	public DynastyServiceImpl(DynastyDaoImpl  dynastyDaoImpl){
		this.dynastyDaoImpl=dynastyDaoImpl;
	}

	@Override
	public List<Dynasty> getDynastys() {
		// TODO Auto-generated method stub
		List<Dynasty> lists=this.dynastyDaoImpl.findDynastys();
		return lists;
	}

}
