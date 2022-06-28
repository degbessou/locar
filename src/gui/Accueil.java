package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import tools.Functions;

public class Accueil extends JPanel {
	
	public static JFrame frame;
	public static Login login;
	public static JLabel copyright; // for locar text
	
	public Accueil () {
		fenetreAccueil ();
	}
	
	public void fenetreAccueil() {
		setLayout(null);
		
		// welcome panel 
        JPanel accueil = new JPanel();
        accueil.setBounds(100, 75, 500, 200);
        accueil.setBackground(new java.awt.Color(217, 217, 217));
        accueil.setBorder(BorderFactory.createLineBorder(Color.black, 2)); // border
        
		// welcome text
		JLabel welcome = new JLabel("<html>Bienvenue sur LOCAR <br/> Veuillez vous connecter", SwingConstants.CENTER);
		welcome.setBounds(183, 135, 350, 75); // dimension
		welcome.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25)); // font n height
		
		// login button
		JButton btnLogin = new JButton("<html><font color = white> Connectez-vous </font></html>");
		btnLogin.setBounds(260, 285, 200, 50);
		btnLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20)); // font n height
		btnLogin.setBackground(new java.awt.Color(39, 170, 243));
		btnLogin.setBorder(null);
		
		// login action
		login = new Login ();
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnLogin)
					//mainWindow.frame.setVisible(true);
					MainWindow.ouvrePanel(login);
					//login.start();		
			}
		});
		
		add(btnLogin);
		add(welcome);
        add(accueil);
        add(Functions.signature(copyright));
	}

}
