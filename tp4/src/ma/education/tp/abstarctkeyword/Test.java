package ma.education.tp.abstarctkeyword;


public class Test {

	public static void main(String[] args) {

		FormeGeometrique f3 = new Triangle();
		FormeGeometrique f4 = new FormeGeometrique() {
		
			@Override 
		// Classe fille Annonyme
		public double calculerSurface() {
		return 22;
		}
		};
		
		
   System.out.println(f3.calculerSurface());
   System.out.println(f3.calculerSurface());
   System.out.println(f4.calculerSurface());
   
	}

}
