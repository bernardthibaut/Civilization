package ui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import exec.Jeu;

public class Interface extends JPanel {

	private JLabel labelTour = new JLabel("Tour: 1");

	public Interface() {
		setLayout(null);

		labelTour.setFont(new Font("Arial", 1, 50));
		labelTour.setBounds(1650, 0, 275, 100);

		add(labelTour);

	}

}
