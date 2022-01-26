package tp3ma.education.tp2.statickeyword;

public class Etudiant {
	public long id ;
	public String nom;
	static long nbEtudiants;
	
	/*
	 * 3 -
	 * 3-1 oui
	 * 3-2 oui
	 * 3-3	non
	 */
	public Etudiant(long id,String nom ,long nbEtudiants) {
		this.id=id;
		this.nom = nom ;
		nbEtudiants +=nbEtudiants;
		
	}
	

}
