package gui;

import java.awt.event.*;
import javax.swing.*;
import tools.Fonctions;

public class ListeLocation extends JPanel{
	
	protected static JButton modifier;

	public ListeLocation() {
		fenetreListeLocation();
	}
	
	public void fenetreListeLocation() {
		setLayout(null);
		
		// modify button action
		modifier = Fonctions.bouttonPersonnalisable(modifier, "Modifier");
		modifier.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ajouter la sauvegarde dans la base de donnée
				if (e.getSource() == modifier)
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
		
		add(MainWindow.quitter);
		add(MainWindow.annuler);
		add(modifier);
		add(Fonctions.titre(MainWindow.titre, "LISTE DES LOCATIONS"));
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.nomEmploye));
		
	}

}
