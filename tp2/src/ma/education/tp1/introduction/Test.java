package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args) {

//		Salle o1 = new Salle();
		Salle o2 = new Salle("Salle Informatique");
		Salle o3 = new Salle(1,"Salle des cours");

		
//		System.out.println("id : "+o1.id+" nom : "+o1.nom);
		System.out.println("id : "+o2.id+" nom : "+o2.nom);
		System.out.println("id : "+o3.id+" nom : "+o3.nom);

	}

}
