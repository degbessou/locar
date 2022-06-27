package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import tools.Functions;

public class Dashboard extends JPanel{
	
	public static JFrame frame;
	public static JLabel copyright; // for locar text
	public static JPanel dash;
	public static JButton quitter;
	
	public Dashboard () {
		display ();
	}
	
	public void display() {
		setLayout(null);
		add(Functions.signature(copyright));
		add(Functions.dashboardPanel(dash));
		add(Functions.boutton(quitter, "Quitter"));
		
		quitter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainWindow.main(null);
			}
		});
	}
	
	

}
 