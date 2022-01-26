package ma.education.tp4.singleton;

public class TestSingleton {
	
	public static void  main(String[] args) {
		
		Terre t1= Terre.getIns(1000, 2000);
		Terre t2= Terre.getIns(4000, 5000);
		
		System.out.println("la distance :"+t1.distanceToSoleil+"  "
				+ "la Surface :"+ t1.surface);
	
		System.out.println("la distance :"+t2.distanceToSoleil+"  "
				+ "la Surface :"+ t2.surface);
	}

}
