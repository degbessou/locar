package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import tools.Functions;

public class InscriptionClient extends JPanel{
	

	public static JLabel copyright; // for locar text
	public static JPanel dash;
	public static TableauDeBord tableauDeBord;

	public InscriptionClient() {
		fenetreInscriptionClient();
	}
	
	public void fenetreInscriptionClient() {
		setLayout(null);
		
		// title
		JLabel titre = new JLabel("INSCRIPTION DU CLIENT");
		titre.setBounds(208, 55, 315, 23); // dimension
		titre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25)); // font n height
		
		// name
		JLabel nom = new JLabel("NOM");
		nom.setBounds(20, 120, 50, 15); // dimension
		nom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		
		// user name case
		JTextField userName = new JTextField();
		userName.setBounds(210, 107, 300, 35);
		userName.setBackground(Color.WHITE);
		userName.setBorder(null);
		
		// cancel button
		JButton btnAnnuler = new JButton("<html><font color = white>Annuler</font></html>");
		btnAnnuler.setBounds(590, 370, 95, 30);
		btnAnnuler.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btnAnnuler.setBackground(new java.awt.Color(39, 170, 243));
		btnAnnuler.setBorder(null);
		
		// cancel button action
		btnAnnuler.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAnnuler)
					tableauDeBord = new TableauDeBord ();
					MainWindow.ouvrePanel(tableauDeBord);
			}
		});
		
		add(nom);
		add(btnAnnuler);
		add(titre);
		add(Functions.signature(copyright));
		add(Functions.dashboardPanel(dash));
		

		
	}

}
