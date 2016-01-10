package joueur;

import java.util.ArrayList;
import java.util.Random;

import jeu.Plateau;

public class Joueur {

	private Random r = new Random();

	private Plateau p;

	private ArrayList<String> nomVillesDispo = new ArrayList<>();

	private ArrayList<String> listeVilles = new ArrayList<>();
	private ArrayList<Unite> listeUnites = new ArrayList<>();

	public Joueur(Plateau p) {
		this.p = p;
		nomVillesDispo.add("Paris");
		nomVillesDispo.add("Marseille");
		nomVillesDispo.add("Lyon");
		nomVillesDispo.add("Toulouse");

		ajouterUnite(new Colon(this, p.getTerrainAleatoire()));
	}

	public void ajouterUnite(Unite u) {
		listeUnites.add(u);
	}

	public Colon getColon() {
		for (Unite u : listeUnites) {
			if (u instanceof Colon)
				return (Colon) u;
		}
		return null;
	}

	public String nomVilleAleatoire() {
		String result = nomVillesDispo.get(r.nextInt(nomVillesDispo.size()));
		nomVillesDispo.remove(result);
		return result;
	}

	public void supprimerUnite(Unite u) {
		listeUnites.remove(u);
	}

	public Plateau getPlateau() {
		return p;
	}

}
