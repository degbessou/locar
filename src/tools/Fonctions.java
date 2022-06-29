package tools;

import java.awt.*;
import javax.swing.*;
import gui.MainWindow;

public class Fonctions {
	
	public static JFrame frame;
	
	// signature text
	public static JLabel signature (JLabel sign) {
		sign = new JLabel("LOCAR : location de véhicules pour particulier");
		sign.setBounds(15, 415, 336, 17); // dimension
		sign.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height
		return sign;
	}
	
	// dashboard panel
	public static JPanel tableaudebordPanel (JPanel dash) {
		dash = new JPanel();
		dash.setBounds(10, 40, 685, 370);
		dash.setBackground(new java.awt.Color(217, 217, 217));
		dash.setBorder(BorderFactory.createLineBorder(Color.black, 2)); // border
		return dash;
	}
	
	public static JButton bouttonQuitter (JButton btn) {
		// login button
		btn = new JButton("<html><font color= white>Quitter</font></html>");
		btn.setBounds(621, 15, 52, 17);
		btn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10)); // font n height
		btn.setBackground(new java.awt.Color(39, 170, 243));
		btn.setBorder(null);
		return btn;		
	}
	
	public static JLabel labelNomEmploye (JLabel label) {
		// login button
		label = new JLabel("<html><font color= #396CF0>nomEmploye</font></html>"); // faire un get pour obtenir le nom de l'employé connecté
		label.setBounds(45, 15, 100, 17); // dimension
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12)); // font n height
		return label;
	}
	
	public static JButton bouttonAnnuler (JButton btn) {
		btn = new JButton("<html><font color = white>Annuler</font></html>");
		btn.setBounds(590, 370, 95, 30);
		btn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btn.setBackground(new java.awt.Color(39, 170, 243));
		btn.setBorder(null);
		return btn;
	}
	
	public static JButton bouttonPersonnalisable (JButton btn, String nom) {
		btn = new JButton("<html><font color = white>"+nom+"</font></html>");
		btn.setBounds(475, 370, 95, 30);
		btn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15)); // font n height
		btn.setBackground(new java.awt.Color(39, 170, 243));
		btn.setBorder(null);
		return btn;
	}
	
	public static JLabel titre (JLabel titre, String text) {
		// title
		titre = new JLabel(text);
		titre.setBounds(208, 55, 315, 23); // dimension
		titre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25)); // font n height
		return titre;
	}
//	public static JButton boutton (JButton btn) {
//		// login button
//		btn = new JButton("<html><font color= white>Quitter</font></html>");
//		btn.setBounds(621, 15, 52, 17);
//		btn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10)); // font n height
//		btn.setBackground(new java.awt.Color(39, 170, 243));
//		btn.setBorder(null);
//		return btn;
//		
//	}


}
