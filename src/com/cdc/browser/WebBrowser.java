package com.cdc.browser;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class WebBrowser {
	
	private static JWebBrowser webBrowser;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NativeInterface.open();
		   UIUtils.setPreferredLookAndFeel();
		    SwingUtilities.invokeLater(new Runnable() {
		      public void run() {
		        JFrame frame = new JFrame("DJ Native Swing Test");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		        frame.getContentPane().add(createJPanel("http://localhost:8080/test/index.html"), BorderLayout.CENTER);
		        frame.setSize(800, 600);
		        frame.setLocationByPlatform(false);
		        frame.setVisible(true);
		        //执行js函数
		        webBrowser.executeJavascript("alert(\"123456\")");
		      }
		    });
		    
		    NativeInterface.runEventPump();
		    
		    
	}
	/**
	 * http://localhost:8080/test/index.html
	 * @param htmlPath
	 * @return
	 */
	private static JPanel createJPanel(String htmlPath){
		JPanel  jpPanel=new JPanel(new BorderLayout());
		webBrowser = new JWebBrowser();
		webBrowser.navigate(htmlPath);
		webBrowser.setMenuBarVisible(false);
		//地址览等信息不显示
		webBrowser.setBarsVisible(false);   
		//不显示底部的加载信息状态:如完成等
	    webBrowser.setStatusBarVisible(false);
		jpPanel.add(webBrowser, BorderLayout.CENTER);
		return jpPanel;
	}

}
