package ma.education.tp2.statickeyword;

public class Etudiant {
	
	long id;
	String nom;
	static int nbEtudiants;
	
	public Etudiant(long id, String nom, int nb) {
		
		this.id = id;
		this.nom = nom;
		nbEtudiants=nb;
	}
	
	/*
	 * Question 3
	 * A- oui 
	 * B- oui
	 * C- oui parceque il n est pas static
	 * */
	
	

}
