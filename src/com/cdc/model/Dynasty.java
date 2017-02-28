package com.cdc.model;
/**
 * 朝代
 * @author cdc
 *
 */
public class Dynasty extends ValueObject {
	private String dynasty_name;

	public String getDynasty_name() {
		return dynasty_name;
	}

	public void setDynasty_name(String dynasty_name) {
		this.dynasty_name = dynasty_name;
	}
	

}
