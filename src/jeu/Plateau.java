package jeu;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JPanel;

import ui.Interface;

@SuppressWarnings("serial")
public class Plateau extends JPanel {

	final int TAILLEX = 20;
	final int TAILLEY = 11;
	private Random r = new Random();

	private Case[][] contenu = new Case[TAILLEX][TAILLEY];

	public Plateau() {
		generationSemiAleatoire();
	}

	public Case caseAleatoire() {
		int aleatoire = r.nextInt(4);
		switch (aleatoire) {
		case 0:
			return new Plaine();
		case 1:
			return new Mer();
		case 2:
			return new Montagne();
		case 3:
			return new Desert();
		}
		System.out.println("Problème durant la génération de case :       aleatoire = " + aleatoire);
		return null;
	}

	public Case caseSemiAleatoire(int x, int y) {
		int aleatoire = r.nextInt(4);
		Case c = contenu[x][y];

		if (aleatoire < 2) {
			return caseAleatoire();
		} else {
			String max = c.maxListe(c.listeAdjacents());
			switch (max) {
			case "Plaine":
				return new Plaine();
			case "Mer":
				return new Mer();
			case "Montagne":
				return new Montagne();
			case "Desert":
				return new Desert();
			}
		}

		return caseAleatoire();
	}

	public void generationAleatoire() {
		removeAll();

		setLayout(new GridLayout(TAILLEY, TAILLEX));

		for (int y = 0; y < TAILLEY; y++) {
			for (int x = 0; x < TAILLEX; x++) {

				if (y == 0 || x == 0 || y == TAILLEY - 1 || x == TAILLEX - 1)
					contenu[x][y] = new Mer();
				else
					contenu[x][y] = new Vide();
				contenu[x][y].localiser(this, x, y);
			}
		}

		for (int y = 0; y < TAILLEY; y++) {
			for (int x = 0; x < TAILLEX; x++) {
				if (y == 0 || x == 0 || y == TAILLEY - 1 || x == TAILLEX - 1)
					contenu[x][y] = new Mer();
				else
					contenu[x][y] = caseAleatoire();
				contenu[x][y].localiser(this, x, y);
				add(contenu[x][y]);
			}
		}
	}

	public void generationSemiAleatoire() {
		removeAll();

		setLayout(new GridLayout(TAILLEY, TAILLEX));

		for (int y = 0; y < TAILLEY; y++) {
			for (int x = 0; x < TAILLEX; x++) {

				if (y == 0 || x == 0 || y == TAILLEY - 1 || x == TAILLEX - 1)
					contenu[x][y] = new Mer();
				else
					contenu[x][y] = new Vide();
				contenu[x][y].localiser(this, x, y);
			}
		}

		for (int y = 0; y < TAILLEY; y++) {
			for (int x = 0; x < TAILLEX; x++) {
				if (y == 0 || x == 0 || y == TAILLEY - 1 || x == TAILLEX - 1)
					contenu[x][y] = new Mer();
				else
					contenu[x][y] = caseSemiAleatoire(x, y);
				contenu[x][y].localiser(this, x, y);
				add(contenu[x][y]);
			}
		}
	}

	public Case[][] getContenu() {
		return contenu;
	}
	
	public void setCase(int x, int y, Case c){
		contenu[x][y] = c;
	}

	public Case getTerrainAleatoire() {
		Case result = new Mer();

		while (!(result instanceof Plaine || result instanceof Desert)) {
			int x = r.nextInt(TAILLEX);
			int y = r.nextInt(TAILLEY);

			result = contenu[x][y];
		}

		return result;
	}

}
