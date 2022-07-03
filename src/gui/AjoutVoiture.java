package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import tools.Fonctions;

public class AjoutVoiture extends JPanel{

	public AjoutVoiture() {
		fenetreAjoutVoiture();
	}
	
	public void fenetreAjoutVoiture() {
		setLayout(null);
		
		// select a category
		JLabel categorie = new JLabel("CATEGORIE");
		categorie.setBounds(20, 145, 250, 15); // dimension
		categorie.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// select a brand
		JLabel marque = new JLabel("MARQUE");
		marque.setBounds(20, 185, 250, 15); // dimension
		marque.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// select a MODEL
		JLabel modele = new JLabel("MODELE");
		modele.setBounds(20, 225, 250, 15); // dimension
		modele.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// select a year
		JLabel annee = new JLabel("ANNÉE");
		annee.setBounds(20, 265, 250, 15); // dimension
		annee.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height
		
		
		// registration
		JLabel immatriculation = new JLabel("IMMATRICULATION");
		immatriculation.setBounds(385, 145, 250, 15); // dimension
		immatriculation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// buying date
		JLabel dateAchat = new JLabel("DATE D'ACHAT");
		dateAchat.setBounds(385, 185, 250, 15); // dimension
		dateAchat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// color
		JLabel couleur = new JLabel("COULEUR");
		couleur.setBounds(385, 225, 250, 15); // dimension
		couleur.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// kilometer
		JLabel kilometrage = new JLabel("KILOMETRAGE");
		kilometrage.setBounds(385, 265, 250, 15); // dimension
		kilometrage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height
		
		// save button action
		MainWindow.enregistrer = Fonctions.bouttonPersonnalisable(MainWindow.enregistrer, "Enregistrer");
		MainWindow.enregistrer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ajouter la sauvegarde dans la base de donnée
				if (e.getSource() == MainWindow.enregistrer)
					MainWindow.catalogue = new Catalogue();
				MainWindow.ouvrePanel(MainWindow.catalogue);
			}
		});
		
		// cancel button action
		MainWindow.annuler = Fonctions.bouttonAnnuler(MainWindow.annuler);
		MainWindow.annuler.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == MainWindow.annuler)
					MainWindow.catalogue = new Catalogue();
				MainWindow.ouvrePanel(MainWindow.catalogue);
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
		
		add(kilometrage);
		add(couleur);
		add(dateAchat);
		add(immatriculation);
		add(annee);
		add(modele);
		add(marque);
		add(categorie);
		
		add(MainWindow.quitter);
		add(MainWindow.annuler);
		add(MainWindow.enregistrer);
		add(Fonctions.titre(MainWindow.titre, "AJOUT D'UNE VOITURE"));
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.identifiantEmploye));
	}

}
