package com.cdc.model;
/**
 * 作者
 * @author cdc
 *
 */
public class Author extends ValueObject{
	private String author_name;
	/**
	 * 朝代id
	 * 关联dynasty的id
	 */
	private String dynasty_id;
	private String author_birthday;
	private String author_desc;
	
	public String getDynasty_id() {
		return dynasty_id;
	}
	public void setDynasty_id(String dynasty_id) {
		this.dynasty_id = dynasty_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getAuthor_birthday() {
		return author_birthday;
	}
	public void setAuthor_birthday(String author_birthday) {
		this.author_birthday = author_birthday;
	}
	public String getAuthor_desc() {
		return author_desc;
	}
	public void setAuthor_desc(String author_desc) {
		this.author_desc = author_desc;
	}
	
	

}
