package jeu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;

public abstract class Case extends JButton {

	private Plateau p;
	public int x, y;

	public Case() {
		setFocusable(false);
		ajouterListeners();
	}

	public ArrayList<Case> listeVoisins() {
		ArrayList<Case> result = new ArrayList<>();

		Case[][] contenuPlateau = p.getContenu();

		for (int x = -1; x < 2; x++) {
			for (int y = -1; y < 2; y++) {
				if (!(x == 0 && y == 0)) {
					try {
						result.add(contenuPlateau[this.x + x][this.y + y]);
					} catch (Exception e) {

					}
				}
			}
		}
		return result;
	}

	public ArrayList<Case> listeAdjacents() {
		ArrayList<Case> result = new ArrayList<>();

		Case[][] contenuPlateau = p.getContenu();

		try {
			result.add(contenuPlateau[this.x][this.y - 1]);
		} catch (Exception e) {
		}
		try {
			result.add(contenuPlateau[this.x][this.y + 1]);
		} catch (Exception e) {
		}
		try {
			result.add(contenuPlateau[this.x - 1][this.y]);
		} catch (Exception e) {
		}
		try {
			result.add(contenuPlateau[this.x + 1][this.y]);
		} catch (Exception e) {
		}
		return result;
	}

	public HashMap<String, Integer> compterListe(ArrayList<Case> liste) {
		HashMap<String, Integer> result = new HashMap<>();

		int nbPlaine = 0;
		int nbMer = 0;
		int nbMontagne = 0;
		int nbDesert = 0;

		for (Case c : liste) {
			if (c instanceof Plaine)
				nbPlaine++;
			else if (c instanceof Mer)
				nbMer++;
			else if (c instanceof Montagne)
				nbMontagne++;
			else if (c instanceof Desert)
				nbDesert++;
		}

		result.put("Plaine", nbPlaine);
		result.put("Mer", nbMer);
		result.put("Montagne", nbMontagne);
		result.put("Desert", nbDesert);

		return result;

	}

	public String maxListe(ArrayList<Case> liste) {
		HashMap<String, Integer> map = compterListe(liste);

		int p = map.get("Plaine");
		int me = map.get("Mer");
		int mo = map.get("Montagne");
		int d = map.get("Desert");

		if (p >= me && p >= mo && p >= d)
			return "Plaine";
		else if (me > p && me > mo && me > d)
			return "Mer";
		else if (mo > p && mo > me && mo > d)
			return "Montagne";
		else
			return "Desert";
	}

	public void localiser(Plateau p, int x, int y) {
		this.p = p;
		this.x = x;
		this.y = y;
	}

	public void ajouterListeners() {
		addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});
	}
	
}
