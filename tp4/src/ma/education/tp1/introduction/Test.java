package ma.education.tp1.introduction;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salle o1 = new Salle();
		Salle o2 = new Salle("Salle informatique");
		Salle o3 = new Salle(2,"Salle de cours");
		
		System.out.println("Objet o1 : "+o1.id+"  "+ o1.nom);
		System.out.println("Objet o2 : "+o2.id+"  "+ o2.nom);
		System.out.println("Objet o3 : "+o3.id+"  "+ o3.nom);
	}

}
