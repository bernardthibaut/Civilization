package joueur;

import java.awt.Color;

import jeu.Case;
import jeu.Ville;

public class Colon extends Unite {

	private Joueur j;
	private Case c;

	public Colon(Joueur j, Case c) {
		super(j);
		this.j = j;
		this.c = c;

		c.setBackground(Color.pink);
	}

	public void fonderVille() {
		Case nouvelleVille = new Ville();
		j.getPlateau().setCase(c.x, c.y, nouvelleVille);
		j.supprimerUnite(this);
	}

}
