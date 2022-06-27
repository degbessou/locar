package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainWindow {
	
	public static JFrame frame;
	public static Login login;
	
	public static void openPanel (JPanel myPanel) {
		frame.setContentPane(myPanel);
		frame.repaint();
		frame.revalidate();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// principal frame
		frame = new JFrame();
		frame.setSize(new Dimension(720, 480));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setBackground(new java.awt.Color(246, 245, 245));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// LOCAR text
		JLabel copyright = new JLabel("LOCAR : location de véhicules pour particulier");
		copyright.setBounds(15, 415, 336, 17); // dimension
		copyright.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height
		
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
		
		// setting up login action
		login = new Login ();
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnLogin)
					//mainWindow.frame.setVisible(true);
					mainWindow.openPanel(login);
					//login.start();		
			}
		});
		
		frame.add(btnLogin);
		frame.add(welcome);
        frame.add(accueil);
		frame.add(copyright); 
		frame.setVisible(true);

	}

}
