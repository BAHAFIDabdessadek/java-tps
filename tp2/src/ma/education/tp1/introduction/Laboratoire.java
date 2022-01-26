package ma.education.tp1.introduction;

public class Laboratoire extends Salle {

//	Le super constructeur implicite Salle() n'est pas défini pour le constructeur par défaut. Doit définir un explicite
//	  constructeur
	String type;
	public Laboratoire(long id , String nom,String type)
	{
		super(id,nom);
		this.type=type;
	}
}
