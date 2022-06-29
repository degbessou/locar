package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import tools.Fonctions;

public class Catalogue extends JPanel{
	
	protected static JButton choisir;

	public Catalogue() {
		fenetreCatalogue();
	}
	
	public void fenetreCatalogue() {
		setLayout(null);
		
		// delete a car from the catalog
		JButton btnSupprimer = new JButton("<html><font color = white>Supprimer</font></html>"); // implémenters action bouton supprimer dans catalogue
		btnSupprimer.setBounds(360, 370, 95, 30);
		btnSupprimer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnSupprimer.setBackground(new java.awt.Color(39, 170, 243));
		btnSupprimer.setBorder(null);
		
		// add a car to the catalog
		JButton btnAjouter = new JButton("<html><font color = white>Ajouter</font></html>"); 
		btnAjouter.setBounds(245, 370, 95, 30);
		btnAjouter.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnAjouter.setBackground(new java.awt.Color(39, 170, 243));
		btnAjouter.setBorder(null);
		
		btnAjouter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAjouter)
					MainWindow.ajoutVoiture = new AjoutVoiture();
				MainWindow.ouvrePanel(MainWindow.ajoutVoiture);
			}
		});
		
		// choice button action
		choisir = Fonctions.bouttonPersonnalisable(choisir, "Choisir");
		choisir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ajouter la sauvegarde dans la base de donnée
				if (e.getSource() == choisir)
					MainWindow.creerLocation = new CreerLocation();
				MainWindow.ouvrePanel(MainWindow.creerLocation);
			}
		});

		// cancel button action
		MainWindow.annuler = Fonctions.bouttonAnnuler(MainWindow.annuler);
		MainWindow.annuler.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == MainWindow.annuler)
					MainWindow.tableauDeBord = new TableauDeBord();
				MainWindow.ouvrePanel(MainWindow.tableauDeBord);
			}
		});

		// logout button action
		MainWindow.quitter = Fonctions.bouttonQuitter(MainWindow.quitter);
		MainWindow.quitter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == MainWindow.quitter)
					MainWindow.accueil = new Accueil();
				MainWindow.ouvrePanel(MainWindow.accueil);
			}
		});
		
		add(btnAjouter);
		add(btnSupprimer);
		add(choisir);
		add(MainWindow.quitter);
		add(MainWindow.annuler);
		add(Fonctions.titre(MainWindow.titre, "LISTE DES VOITURES"));
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.identifiantEmploye));
		add(Fonctions.labelNomClient(MainWindow.identifiantClient));
	}

}
