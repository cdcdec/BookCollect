package com.cdc.browser;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserCommandEvent;
/**
 * 从html界面传递信息到java程序
 * @author aaron
 *
 */
public class JsOrHrefSendCommandToJava {
	
	private static JWebBrowser webBrowser;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NativeInterface.open();
		   UIUtils.setPreferredLookAndFeel();
		    SwingUtilities.invokeLater(new Runnable() {
		      public void run() {
		        JFrame frame = new JFrame("js调用java方法");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		        frame.getContentPane().add(createJPanel("http://localhost:8080/test/Command.html"), BorderLayout.CENTER);
		        frame.setSize(800, 600);
		        frame.setLocationByPlatform(false);
		        frame.setVisible(true);
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
		//地址览等信息显示
		webBrowser.setBarsVisible(true);   
		//不显示底部的加载信息状态:如完成等
	    webBrowser.setStatusBarVisible(false);
		jpPanel.add(webBrowser, BorderLayout.CENTER);
		webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
		      @Override
		      public void commandReceived(WebBrowserCommandEvent e) {
		        String command = e.getCommand();
		        System.out.println("command="+command);
		        if("qaq".equals(command)) {
		          if(JOptionPane.showConfirmDialog(webBrowser, "Do you want to store \"" + "\" in a database?\n(Not for real of course!)", "Data received from the web browser", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		            // Data should be used here
		          }
		        }else{
		        	JOptionPane.showMessageDialog(webBrowser, command, "来自js的数据", JOptionPane.INFORMATION_MESSAGE);
		        }
		      }
		    });
		return jpPanel;
	}

}
