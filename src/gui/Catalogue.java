package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tools.Fonctions;

public class Catalogue extends JPanel{
	
	protected static JButton choisir;

	public Catalogue() {
		fenetreCatalogue();
	}
	
	public void fenetreCatalogue() {
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
		
		// category box
		JComboBox categorieBox = new JComboBox();
		categorieBox.setBounds(140, 140, 130, 20);
		categorieBox.setBackground(Color.WHITE);
		categorieBox.setBorder(null);

		// brand box
		JComboBox brandBox = new JComboBox();
		brandBox.setBounds(140, 180, 130, 20);
		brandBox.setBackground(Color.WHITE);
		brandBox.setBorder(null);

		// model box
		JComboBox modelBox = new JComboBox();
		modelBox.setBounds(140, 220, 130, 20);
		modelBox.setBackground(Color.WHITE);
		modelBox.setBorder(null);

		// year field
		JTextField anneeField = new JTextField();
		anneeField.setBounds(140, 260, 130, 20);
		anneeField.setBackground(Color.WHITE);
		anneeField.setBorder(null);
		
		// car list field
		JTextField listeVoitureField = new JTextField();
		listeVoitureField.setBounds(290, 90, 390, 270);
		listeVoitureField.setBackground(Color.WHITE);
		listeVoitureField.setBorder(null);
		
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
		
		add(anneeField);
		add(modelBox);
		add(brandBox);
		add(categorieBox);
		add(annee);
		add(modele);
		add(marque);
		add(categorie);
		add(listeVoitureField);
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
