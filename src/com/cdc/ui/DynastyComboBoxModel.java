package com.cdc.ui;

import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import com.cdc.model.Dynasty;

public class DynastyComboBoxModel extends AbstractListModel implements ComboBoxModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1083834891282124533L;

	private List<Dynasty> lists;
	
	private String item=null;
	
	 public DynastyComboBoxModel(List<Dynasty> lists) {
		// TODO Auto-generated constructor stub
		 this.lists=lists;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return lists.size();
	}

	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		return lists.get(index).getDynasty_name();
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO Auto-generated method stub
		
		item=(String) anItem;
		
		
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		
		return item;
	}

}
