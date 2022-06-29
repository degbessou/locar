package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import tools.Fonctions;

public class Location extends JPanel{

	public Location() {
		fenetreLocation();
	}
	
	public void fenetreLocation() {
		setLayout(null);

		// location creation button
		JButton btnCreerLocation = new JButton("<html><font color= white>CRÉER UNE LOCATION</font></html>");
		btnCreerLocation.setBounds(140, 132, 420, 60);
		btnCreerLocation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20)); // font n height
		btnCreerLocation.setBackground(new java.awt.Color(0, 0, 0));
		btnCreerLocation.setBorder(null);
		
		// location list button
		JButton btnListeLocation = new JButton("<html><font color= white>CONSULTER LA LISTE DES LOCATIONS</font></html>");
		btnListeLocation.setBounds(140, 262, 420, 60);
		btnListeLocation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20)); // font n height
		btnListeLocation.setBackground(new java.awt.Color(0, 0, 0));
		btnListeLocation.setBorder(null);
		
		// location creation button action
		btnListeLocation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnListeLocation)
					MainWindow.listeLocation = new ListeLocation();
				MainWindow.ouvrePanel(MainWindow.listeLocation);
			}
		});
		
		// location creation button action
		btnCreerLocation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCreerLocation)
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
		
		add(btnListeLocation);
		add(btnCreerLocation);
		add(MainWindow.quitter);
		add(MainWindow.annuler);
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.nomEmploye));
		
	}

}
