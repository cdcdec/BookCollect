package com.cdc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cdc.dao.DynastyDao;
import com.cdc.model.Dynasty;
import com.cdc.model.ValueObject;

public class DynastyDaoImpl extends BaseDaoImpl implements DynastyDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Dynasty> findDynastys() {
		StringBuffer sql = new StringBuffer("select * from dynasty ");
		return (List<Dynasty>) getDatas(sql.toString(), new ArrayList<ValueObject>(), Dynasty.class);
		
	}

}
