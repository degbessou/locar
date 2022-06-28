package gui;

import java.awt.*;
import javax.swing.*;

public class MainWindow {
	
	public static JFrame frame;
	public static Login login;
	public static JLabel copyright; // for locar text
	public static Accueil accueil;
	
	public MainWindow () {
		
	}
	
	public static void ouvrePanel (JPanel myPanel) {
		frame.setContentPane(myPanel);
		frame.repaint();
		frame.revalidate();
	}
//	
//	public static void retourMenu() {
//		JPanel monMenu = new Accueil();
//		frame.setContentPane(monMenu);
//		frame.repaint();
//		frame.revalidate();
//	}
	


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
