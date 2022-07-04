package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		
		// registration
		JTextField immatriculationField = new JTextField(); // check jdatePicker
		immatriculationField.setBounds(555, 140, 130, 20);
		immatriculationField.setBackground(Color.WHITE);
		immatriculationField.setBorder(null);

		// buying date
		JTextField dateAchatField = new JTextField();
		dateAchatField.setBounds(555, 180, 130, 20);
		dateAchatField.setBackground(Color.WHITE);
		dateAchatField.setBorder(null);

		// color
		JTextField couleurField = new JTextField();
		couleurField.setBounds(555, 220, 130, 20);
		couleurField.setBackground(Color.WHITE);
		couleurField.setBorder(null);

		// kilometer
		JTextField kilometrageField = new JTextField();
		kilometrageField.setBounds(555, 260, 130, 20);
		kilometrageField.setBackground(Color.WHITE);
		kilometrageField.setBorder(null);
		
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
		add(kilometrageField);
		add(couleurField);
		add(dateAchatField);
		add(immatriculationField);
		add(anneeField);
		add(modelBox);
		add(brandBox);
		add(categorieBox);
		add(MainWindow.quitter);
		add(MainWindow.annuler);
		add(MainWindow.enregistrer);
		add(Fonctions.titre(MainWindow.titre, "AJOUT D'UNE VOITURE"));
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.identifiantEmploye));
		add(Fonctions.labelNomClient(MainWindow.identifiantClient));
	}

}
