package com.cdc.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AuthorPanel extends BaseJpanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3338745807623178309L;
	
	private JPanel jPanel=new JPanel();

	@Override
	public void readData() {
		// TODO Auto-generated method stub

	}
	
	
	public AuthorPanel(){
		this.add(addPanel(jPanel));
	}
	
	private JPanel addPanel(JPanel jPanel){
		BoxLayout boxLayout=new BoxLayout(jPanel, BoxLayout.X_AXIS);
		jPanel.setLayout(boxLayout);
		JTextField  jTextField=new JTextField(10);
		JButton jButton=new JButton("查询");
		jPanel.add(jTextField);
		jPanel.add(jButton);
		return jPanel;
	}
	
	
	public static void main(String[] args) {
		JFrame  jFrame=new JFrame("ddd");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AuthorPanel  authorPanel=new AuthorPanel();
		jFrame.add(authorPanel, BorderLayout.PAGE_START);
		jFrame.setSize(new Dimension(480, 320));
		//jFrame.pack();
		jFrame.setVisible(true);
	}
	
	
	
	

}
