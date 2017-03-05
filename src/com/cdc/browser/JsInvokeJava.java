package com.cdc.browser;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserFunction;

public class JsInvokeJava {
	
	private static JWebBrowser webBrowser;
	private static JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NativeInterface.open();
		   UIUtils.setPreferredLookAndFeel();
		    SwingUtilities.invokeLater(new Runnable() {
		      public void run() {
		        frame = new JFrame("DJ Native Swing Test");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		        frame.getContentPane().add(createJPanel("http://localhost:8080/test/JsInvokeJava.html"), BorderLayout.CENTER);
		        frame.setSize(800, 600);
		        frame.setLocationByPlatform(false);
		        frame.setVisible(true);
		      }
		    });
		    
		    NativeInterface.runEventPump();

	}
	
	private static JPanel createJPanel(String htmlPath){
		JPanel  jpPanel=new JPanel(new BorderLayout());
		webBrowser = new JWebBrowser();
		webBrowser.navigate(htmlPath);
		webBrowser.setMenuBarVisible(false);
		//地址览等信息不显示
		webBrowser.setBarsVisible(true);   
		//不显示底部的加载信息状态:如完成等
	    webBrowser.setStatusBarVisible(false);
		jpPanel.add(webBrowser, BorderLayout.CENTER);
	
		jpPanel.add(createBottomJPanel(), BorderLayout.SOUTH);
		
		webBrowser.registerFunction(new WebBrowserFunction("invokeJavaNoError"){

			@Override
			public Object invoke(JWebBrowser arg0, Object... arg1) {
				// TODO Auto-generated method stub
				StringBuilder sb = new StringBuilder();
				String ss=(String) arg1[0];
				JOptionPane.showMessageDialog(null, ""+ss,"来自js的页面信息",JOptionPane.INFORMATION_MESSAGE);
				
				return sb.toString();
			}
			
		});
		return jpPanel;
	}
	
	private static JPanel createBottomJPanel(){
		JPanel  jpPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton jButton=new JButton("获取java的数据,传递给js,并执行js函数");
		JTextField jTextField=new JTextField("20170305",8);
		jpPanel.setToolTipText("kkk");
		jpPanel.add(jTextField);
		jpPanel.add(jButton);
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str=jTextField.getText();
				webBrowser.executeJavascript("callBackDate("+str+")");
			}
		});
		return jpPanel;
	}
}
