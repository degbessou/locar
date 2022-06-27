package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import tools.Functions;

public class Login extends JPanel{
	
	public static JFrame frame;
	public static JLabel copyright; // for locar text
	public static Dashboard dashboard;
	
	public Login () {
		start();
	}
	public void start() {
		setLayout(null);
		
		// login panel
		JPanel login = new JPanel();
		login.setBounds(185, 65, 350, 300);
		login.setBackground(new java.awt.Color(217, 217, 217));
		
		// user name text
		JLabel userNameLbl = new JLabel("NOM D'UTILISATEUR");
		userNameLbl.setBounds(200, 82, 156, 17); // dimension
		userNameLbl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// user name case
		JTextField userName = new JTextField();
		userName.setBounds(210, 107, 300, 35);
		userName.setBackground(Color.WHITE);
		userName.setBorder(null);
		
		// user password text
		JLabel userPswLbl = new JLabel("MOT DE PASSE");
		userPswLbl.setBounds(200, 187, 120, 17); // dimension
		userPswLbl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// user password case
		JTextField userPsw = new JTextField();
		userPsw.setBounds(210, 212, 300, 35);
		userPsw.setBackground(Color.WHITE);
		userPsw.setBorder(null);
		
		// user password forgot text
		JLabel pswForgot = new JLabel("Mot de passe oublié ?");
		pswForgot.setBounds(405, 257, 110, 11); // dimension
		pswForgot.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10)); // font n height
		pswForgot.setForeground(new java.awt.Color(57, 108, 240));
		
		// login button
		JButton btnLogin = new JButton("<html><font color = white> Se connecter </font></html>");
		btnLogin.setBounds(200, 300, 150, 35);
		btnLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnLogin.setBackground(new java.awt.Color(39, 170, 243));
		btnLogin.setBorder(null);
		
		// login action
		dashboard = new Dashboard ();
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnLogin)
					MainWindow.openPanel(dashboard);
			}
		});
		
		add(Functions.signature(copyright));
		add(btnLogin);
		add(pswForgot);
		add(userPswLbl);
		add(userPsw);
		add(userNameLbl);
		add(userName);
		add(login);
		
	}

}
