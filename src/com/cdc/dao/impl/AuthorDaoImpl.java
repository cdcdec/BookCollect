package com.cdc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cdc.dao.AuthorDao;
import com.cdc.model.Author;
import com.cdc.model.ValueObject;

public class AuthorDaoImpl extends BaseDaoImpl implements AuthorDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Author> findAuthor() {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer("select * from author ");
		return  (List<Author>) getDatas(sql.toString(), new ArrayList<ValueObject>(), Author.class);
	}

	@Override
	public void save(Author author) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public Author findByName(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByName(String authorName) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAuthorCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Author> query(String realName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author findByDynasty(String dynasty) {
		// TODO Auto-generated method stub
		return null;
	}

}
