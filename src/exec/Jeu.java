package exec;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import jeu.Plateau;
import joueur.Joueur;
import ui.Interface;

@SuppressWarnings("serial")
public class Jeu extends JFrame {

	private Plateau p = new Plateau();
	private Interface ui = new Interface();

	private Joueur j1 = new Joueur(p);
	private Joueur j2 = new Joueur(p);

	private int tour = 1;

	public Jeu() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ajouterListeners();

		setContentPane(p);

		pack();
		setVisible(true);
	}

	public void ajouterListeners() {

		addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();

				if (key == KeyEvent.VK_ESCAPE) {
					System.exit(1);
				}

				if (key == KeyEvent.VK_F1) {
					nouvellePartie();
					p.generationAleatoire();
					p.revalidate();
				}

				if (key == KeyEvent.VK_F2) {
					nouvellePartie();
					p.generationSemiAleatoire();
					p.revalidate();
				}

				if (key == KeyEvent.VK_1) {
					j1.getColon().fonderVille();
				}
			}

		});
	}

	public void nouvellePartie() {
		j1 = new Joueur(p);
		j2 = new Joueur(p);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Jeu();
			}
		});
	}

}
