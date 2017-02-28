package com.cdc.dao;

import java.util.List;

import com.cdc.model.Author;

public interface AuthorDao {
	/**
	 * 查找所有的作者
	 * @return
	 */
	List<Author> findAuthor();
	
	
	/**
	 * 保存新作者
	 * @param author
	 */
	void save(Author author);
	
	/**
	 * 根据作者名查找作者
	 * @param authorName
	 * @return
	 */
	Author findByName(String authorName);
	
	/**
	 * 根据id修改作者
	 * @param user
	 */
	void deleteById(String id);
	/**
	 * 根据名字修改作者
	 * @param user
	 */
	void deleteByName(String authorName);
	
	/**
	 * 返回用户数
	 * @return
	 */
	int getAuthorCount();
	
	/**
	 * 根据作者模糊查找作者
	 * @param authorName
	 * @return
	 */
	List<Author> query(String realName);
	
	/**
	 * 根据ID查找作者
	 * @param id
	 * @return
	 */
	Author findById(String id);
	/**
	 * 根据dynasty查找作者
	 * @param id
	 * @return
	 */
	Author findByDynasty(String dynasty);

}
