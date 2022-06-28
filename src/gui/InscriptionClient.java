package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import tools.Fonctions;

public class InscriptionClient extends JPanel{

	public InscriptionClient() {
		fenetreInscriptionClient();
	}
	
	public void fenetreInscriptionClient() {
		setLayout(null);
		
		// name
		JLabel nom = new JLabel("NOM");
		nom.setBounds(20, 105, 250, 15); // dimension
		nom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// first name
		JLabel prenom = new JLabel("PRENOM");
		prenom.setBounds(20, 145, 250, 15); // dimension
		prenom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// address
		JLabel adresse = new JLabel("ADRESSE");
		adresse.setBounds(20, 185, 250, 15); // dimension
		adresse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// email
		JLabel email = new JLabel("EMAIL");
		email.setBounds(20, 225, 250, 15); // dimension
		email.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// birth date
		JLabel dateNaissance = new JLabel("DATE DE NAISSANCE");
		dateNaissance.setBounds(20, 265, 250, 15); // dimension
		dateNaissance.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// cellular number
		JLabel numeroTel = new JLabel("NUMÉRO DE TÉLÉPHONE");
		numeroTel.setBounds(20, 305, 250, 15); // dimension
		numeroTel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// age
		JLabel age = new JLabel("AGE");
		age.setBounds(470, 265, 100, 15); // dimension
		age.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// name case
		JTextField nomField = new JTextField();
		nomField.setBounds(265, 100, 150, 25);
		nomField.setBackground(Color.WHITE);
		nomField.setBorder(null);
		
		// first name case
		JTextField prenomField = new JTextField();
		prenomField.setBounds(265, 140, 150, 25);
		prenomField.setBackground(Color.WHITE);
		prenomField.setBorder(null);
		
		// address case
		JTextField adresseField = new JTextField();
		adresseField.setBounds(265, 180, 150, 25);
		adresseField.setBackground(Color.WHITE);
		adresseField.setBorder(null);
		
		// email case
		JTextField emailField = new JTextField();
		emailField.setBounds(265, 220, 150, 25);
		emailField.setBackground(Color.WHITE);
		emailField.setBorder(null);
		
		// birth date case
		JTextField dateNaissanceField = new JTextField();
		dateNaissanceField.setBounds(265, 260, 150, 25);
		dateNaissanceField.setBackground(Color.WHITE);
		dateNaissanceField.setBorder(null);
		
		// cellular number case
		JTextField numeroTelField = new JTextField();
		numeroTelField.setBounds(265, 300, 150, 25);
		numeroTelField.setBackground(Color.WHITE);
		numeroTelField.setBorder(null);
		
		// age case
		JTextField ageField = new JTextField();
		ageField.setBounds(535, 260, 150, 25);
		ageField.setBackground(null);
		ageField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
		// save button action
		MainWindow.enregistrer = Fonctions.bouttonEnregistrer(MainWindow.enregistrer);
		MainWindow.enregistrer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ajouter la sauvegarde dans la base de donnée
				if (e.getSource() == MainWindow.enregistrer)
					MainWindow.tableauDeBord = new TableauDeBord ();
					MainWindow.ouvrePanel(MainWindow.tableauDeBord);
			}
		});
		
		// cancel button action
		MainWindow.annuler = Fonctions.bouttonAnnuler(MainWindow.annuler);
		MainWindow.annuler.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == MainWindow.annuler)
					MainWindow.tableauDeBord = new TableauDeBord ();
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
		
		add(nom);
		add(prenom);
		add(adresse);
		add(email);
		add(dateNaissance);
		add(numeroTel);
		add(age);
		add(ageField);
		add(nomField);
		add(numeroTelField);
		add(dateNaissanceField);
		add(emailField);
		add(adresseField);
		add(prenomField);
		add(MainWindow.enregistrer);
		add(MainWindow.annuler);
		add(MainWindow.quitter);
		add(Fonctions.titre(MainWindow.titre, "INSCRIPTION DU CLIENT"));
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.nomEmploye));
		

		
	}

}
