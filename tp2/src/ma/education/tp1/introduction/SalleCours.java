package ma.education.tp1.introduction;

public class SalleCours extends Salle {
	
	
	byte nombre_de_place ;
	
	
	public SalleCours(long id , String nom,byte nombre_de_place){
	
		super(id,nom);
		this.nombre_de_place=nombre_de_place;
	}
}
