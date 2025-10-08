package javaswing.js;
import javax.swing.*;
import java.awt.*;
public class GUIDemo {
	public static void main (String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(300,150);
		mainFrame.setTitle("The First GUI");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,2,10,10));
		
		
		JLabel userLabel = new JLabel("User Name");
		JTextField userField = new JTextField();
		
		JLabel pwdLabel = new JLabel("Password");
		JPasswordField pwdField = new JPasswordField();
		
		JButton loginBtn = new JButton("Login");
		
		mainPanel.add(userLabel);
		mainPanel.add(userField);
		mainPanel.add(pwdLabel);
		mainPanel.add(pwdField);
		mainPanel.add(new JLabel(""));
		mainPanel.add(loginBtn);
		
		mainFrame.add(mainPanel);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}

}
