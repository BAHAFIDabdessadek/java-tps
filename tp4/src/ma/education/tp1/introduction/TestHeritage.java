package ma.education.tp1.introduction;

public class TestHeritage {

	public static void main(String[] args) {

		Salle s1=new SalleCours(1, "Salle 1", (byte) 20);
		SalleCours s2= new SalleCours(2, "Salle 2", (byte) 20);
		SalleCours s3= (SalleCours) s1;
		SalleCours s4=  s2;
		
		Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
		SalleCours s6= new SalleCours(2, "Salle 2", (byte) 20);
		/*SalleCours s7=  (SalleCours) s5;
		 * erreur sse cast est impossible
		 * */
		SalleCours s8= s6;		
	}

}
