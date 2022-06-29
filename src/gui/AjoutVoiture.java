package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import tools.Fonctions;

public class AjoutVoiture extends JPanel{

	public AjoutVoiture() {
		fenetreAjoutVoiture();
	}
	
	public void fenetreAjoutVoiture() {
		setLayout(null);
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
		
		add(MainWindow.quitter);
		add(MainWindow.annuler);
		add(MainWindow.enregistrer);
		add(Fonctions.titre(MainWindow.titre, "AJOUT D'UNE VOITURE"));
		add(Fonctions.signature(MainWindow.copyright));
		add(Fonctions.tableaudebordPanel(MainWindow.dash));
		add(Fonctions.labelNomEmploye(MainWindow.identifiantEmploye));
	}

}
