package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import tools.Fonctions;

public class TableauDeBord extends JPanel{
	
	public static JFrame frame;
	
	public TableauDeBord () {
		fenetreTableauDeBord ();
	}
	
	public void fenetreTableauDeBord() {
		setLayout(null);
		
		// subscription button
		JButton btnInscription = new JButton("<html><font color= white>INSCRIRE UN CLIENT</font></html>");
		btnInscription.setBounds(254, 78, 212, 50);
		btnInscription.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnInscription.setBackground(new java.awt.Color(0, 0, 0));
		btnInscription.setBorder(null);
		
		//location button
		JButton btnLocation = new JButton("<html><font color= white>LOCATION</font></html>");
		btnLocation.setBounds(254, 203, 212, 50);
		btnLocation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnLocation.setBackground(new java.awt.Color(0, 0, 0));
		btnLocation.setBorder(null);
		
		// catalog button
		JButton btnCatalogue = new JButton("<html><font color= white>CATALOGUE</font></html>");
		btnCatalogue.setBounds(254, 328, 212, 50);
		btnCatalogue.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnCatalogue.setBackground(new java.awt.Color(0, 0, 0));
		btnCatalogue.setBorder(null);
		
		// subscribe button action
		btnInscription.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnInscription)
				MainWindow.inscription = new InscriptionClient ();
				MainWindow.ouvrePanel(MainWindow.inscription);		
		}
	});
		
		// location button action
		btnLocation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnLocation)
					MainWindow.location = new Location();
				MainWindow.ouvrePanel(MainWindow.location);
			}
		});
		
		// logout button action
		MainWindow.quitter = Fonctions.bouttonQuitter(MainWindow.quitter);
		MainWindow.quitter.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == MainWindow.quitter)
				MainWindow.accueil = new Accueil ();
				MainWindow.ouvrePanel(MainWindow.accueil);
			}
		});
		
		
		add(btnCatalogue);
		add(btnLocation);
		add(btnInscription);
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.nomEmploye));
		add(MainWindow.quitter);
	}
	
	

}
 