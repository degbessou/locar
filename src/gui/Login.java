package gui;

import java.awt.*;
import javax.swing.*;

public class Login extends JPanel{
	
	public static JFrame frame;
	public Login () {
		start();
	}
	public void start() {
		setLayout(null);
		
		JPanel login = new JPanel();
		login.setBounds(370, 130, 700, 700);
		login.setBackground(new java.awt.Color(217, 217, 217));
		
		JLabel userNameLbl = new JLabel("NOM D'UTILISATEUR");
		userNameLbl.setBounds(400, 165, 312, 35); // dimension
		userNameLbl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25)); // font n height
		
		JTextField userName = new JTextField();
		userName.setBounds(420, 215, 600, 82);
		userName.setBackground(Color.WHITE);
		
		add(userNameLbl);
		add(userName);
		add(login);
		
	}

}
