package ma.education.tp.abstarctkeyword2;

public abstract class FormeGeometrique {
	double surface;
	
	public abstract double calculerSurface();
	
	public void afficherSurface() {
		System.out.println(this.surface);
		}

}
