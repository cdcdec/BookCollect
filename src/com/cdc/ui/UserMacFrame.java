package com.cdc.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserMacFrame {
	
	private String [] items=new String[]{"用户名","mac","识别码","终端编码"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserMacFrame();

	}
	
	public UserMacFrame(){
		JFrame  jFrame=new JFrame("查询用户");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(640, 320);
		jFrame.setContentPane(createRootPanel());
		jFrame.setVisible(true);
	}
	/**
	 * 创建根面板
	 * @return
	 */
	private JPanel createRootPanel(){
		JPanel panelContainer = new JPanel();
		panelContainer.setLayout(new BorderLayout());
		panelContainer.add(createTopPanel(),BorderLayout.NORTH);
		
		return panelContainer;
	}
	/**
	 * 创建顶部面板
	 * @return
	 */
	private JPanel createTopPanel(){
		GridBagConstraints c = new GridBagConstraints();
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		Box  box1=Box.createHorizontalBox();
		c.weightx = 0.3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		buttonPanel.add(box1,c);
		JTextField  jTextField=new JTextField(10);
		jTextField.setPreferredSize(new Dimension(10, 27));
		c.weightx = 0.15;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		buttonPanel.add(jTextField,c);
		Box  box2=Box.createHorizontalBox();
		c.weightx = 0.02;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		buttonPanel.add(box2,c);
		JComboBox<String> jComboBox=new JComboBox<String>(items);
		jComboBox.setPreferredSize(new Dimension(10, 27));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.25;
		c.gridx = 3;
		c.gridy = 0;
		buttonPanel.add(jComboBox,c);
		Box  box3=Box.createHorizontalBox();
		c.weightx = 0.02;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 0;
		buttonPanel.add(box3,c);
		JButton actionButton = new JButton("查询");
		actionButton.setPreferredSize(new Dimension(10, 27));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.13;
		c.gridx = 5;
		c.gridy = 0;
		buttonPanel.add(actionButton,c);
		Box  box4=Box.createHorizontalBox();
		c.weightx = 0.4;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 0;
		buttonPanel.add(box4,c);
		bottomPanel.add(Box.createVerticalStrut(10));
		bottomPanel.add(buttonPanel);
		bottomPanel.add(Box.createVerticalStrut(10));
		return bottomPanel;
	}
	
	
	private JPanel createBottomPanel(){
		GridBagConstraints c = new GridBagConstraints();
		JPanel bottomPanel = new JPanel();
		
		return bottomPanel;
		
	}

}
