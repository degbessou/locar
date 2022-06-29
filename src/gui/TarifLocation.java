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

public class TarifLocation extends JPanel{

	public TarifLocation() {
		fenetreTarifLocation();
	}
	
	public void fenetreTarifLocation() {
		setLayout(null);

		// base price
		JLabel tarifBase = new JLabel("TARIF DE BASE");
		tarifBase.setBounds(20, 145, 250, 15); // dimension
		tarifBase.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// assurance price
		JLabel tarifAssurance = new JLabel("TARIF ASSURANCE");
		tarifAssurance.setBounds(20, 185, 250, 15); // dimension
		tarifAssurance.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// extra kilometer price
		JLabel tarifKilSupp = new JLabel("TARIF KILOMETRAGE SUPP");
		tarifKilSupp.setBounds(20, 225, 250, 15); // dimension
		tarifKilSupp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height

		// total HT
		JLabel totalHT = new JLabel("TOTAL HT");
		totalHT.setBounds(400, 185, 250, 15); // dimension
		totalHT.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height
		
		// total TTC
		JLabel totalTTC = new JLabel("TOTAL TTC");
		totalTTC.setBounds(400, 225, 250, 15); // dimension
		totalTTC.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height
		
		// base price field
		JTextField tarifBaseField = new JTextField();
		tarifBaseField.setBounds(225, 140, 130, 20);
		tarifBaseField.setBackground(Color.WHITE);
		tarifBaseField.setBorder(null);

		// assurance price field
		JTextField tarifAssuranceField = new JTextField(); 
		tarifAssuranceField.setBounds(225, 180, 130, 20);
		tarifAssuranceField.setBackground(Color.WHITE);
		tarifAssuranceField.setBorder(null);

		// extra kilometer price field
		JTextField tarifKilSuppField = new JTextField();
		tarifKilSuppField.setBounds(225, 220, 130, 20);
		tarifKilSuppField.setBackground(Color.WHITE);
		tarifKilSuppField.setBorder(null);
		
		// total HT field
		JTextField totalHTField = new JTextField(); 
		totalHTField.setBounds(555, 180, 130, 20);
		totalHTField.setBackground(Color.WHITE);
		totalHTField.setBorder(null);
		
		// total TTC field
		JTextField totalTTCField = new JTextField(); 
		totalTTCField.setBounds(555, 220, 130, 20);
		totalTTCField.setBackground(Color.WHITE);
		totalTTCField.setBorder(null);
		
		JButton btnPayer = new JButton("<html><font color = white>Payer</font></html>"); // créer action bouton payer
		btnPayer.setBounds(360, 370, 95, 30);
		btnPayer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnPayer.setBackground(new java.awt.Color(39, 170, 243));
		btnPayer.setBorder(null);

		// save button action
		MainWindow.enregistrer = Fonctions.bouttonPersonnalisable(MainWindow.enregistrer, "Enregistrer");
		MainWindow.enregistrer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ajouter la sauvegarde dans la base de donnée
				if (e.getSource() == MainWindow.enregistrer)
					MainWindow.location = new Location();
				MainWindow.ouvrePanel(MainWindow.location);
			}
		});

		// cancel button action
		MainWindow.annuler = Fonctions.bouttonAnnuler(MainWindow.annuler);
		MainWindow.annuler.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == MainWindow.annuler)
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
					MainWindow.accueil = new Accueil();
				MainWindow.ouvrePanel(MainWindow.accueil);
			}
		});

		add(tarifBase);
		add(tarifAssurance);
		add(tarifKilSupp);
		add(totalHT);
		add(totalTTC);
		add(tarifBaseField);
		add(tarifAssuranceField);
		add(tarifKilSuppField);
		add(totalTTCField);
		add(totalHTField);
		add(btnPayer);
		add(MainWindow.enregistrer);
		add(Fonctions.labelNomClient(MainWindow.identifiantClient));
		add(MainWindow.quitter);
		add(MainWindow.annuler);
		add(Fonctions.titre(MainWindow.titre, "LOCATION - TARIFS"));
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.identifiantEmploye));
	}

}
