package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import tools.Functions;

public class TableauDeBord extends JPanel{
	
	public static JFrame frame;
	public static JLabel copyright; // for locar text
	public static JPanel dash;
	public static Accueil accueil;
	public static TableauDeBord tableauDeBord;
	public static InscriptionClient inscription;
	public static JButton quitter;
	
	public TableauDeBord () {
		fenetreTableauDeBord ();
	}
	
	public void fenetreTableauDeBord() {
		setLayout(null);
		
		// subscription button
		JButton btnInscription = new JButton("<html><font color= white>Inscrire un client</font></html>");
		btnInscription.setBounds(254, 78, 212, 50);
		btnInscription.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnInscription.setBackground(new java.awt.Color(0, 0, 0));
		btnInscription.setBorder(null);
		
		//location button
		JButton btnLocation = new JButton("<html><font color= white>Location</font></html>");
		btnLocation.setBounds(254, 203, 212, 50);
		btnLocation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnLocation.setBackground(new java.awt.Color(0, 0, 0));
		btnLocation.setBorder(null);
		
		// catalog button
		JButton btnCatalogue = new JButton("<html><font color= white>Catalogue</font></html>");
		btnCatalogue.setBounds(254, 328, 212, 50);
		btnCatalogue.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnCatalogue.setBackground(new java.awt.Color(0, 0, 0));
		btnCatalogue.setBorder(null);
		
		//
		
		btnInscription.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnInscription)
				inscription = new InscriptionClient ();
				MainWindow.ouvrePanel(inscription);		
		}
	});
		
		
		
		quitter = Functions.boutton(quitter, "Quitter");
		quitter.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == quitter)
				accueil = new Accueil ();
				MainWindow.ouvrePanel(accueil);
			}
		});
		
		
		
		add(btnCatalogue);
		add(btnLocation);
		add(btnInscription);
		add(Functions.signature(copyright));
		add(Functions.dashboardPanel(dash));
		add(quitter);
		
//		add(Functions.boutton(quitter));
	}
	
	

}
 