package gui;

import java.awt.*;
import javax.swing.*;

public class MainWindow {
	
	public static JFrame frame;
	protected static Login login;
	protected static JLabel copyright; // for locar text
	protected static Accueil accueil;
	protected static TableauDeBord tableauDeBord;
	protected static JPanel dash;
	protected static InscriptionClient inscription;
	protected static JButton quitter;
	protected static JLabel nomEmploye;
	protected static JButton annuler;
	protected static JButton enregistrer;
	
	public MainWindow () {
		
	}
	
	public static void ouvrePanel (JPanel myPanel) {
		frame.setContentPane(myPanel);
		frame.repaint();
		frame.revalidate();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// principal frame
		frame = new JFrame();
		frame.setSize(new Dimension(720, 480));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setBackground(new java.awt.Color(246, 245, 245));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		accueil = new Accueil ();
		MainWindow.ouvrePanel(accueil);

	}

}
