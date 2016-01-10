package joueur;

public abstract class Unite {

	public Unite(Joueur j) {
		j.ajouterUnite(this);
	}

}
