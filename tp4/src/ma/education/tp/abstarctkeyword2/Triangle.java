package ma.education.tp.abstarctkeyword2;

public class Triangle extends FormeGeoTypeA {

	double hauteur,base;
	public double calculerSurface() {
		double s =(base*hauteur)/2;
		return s;
	}
	
}
