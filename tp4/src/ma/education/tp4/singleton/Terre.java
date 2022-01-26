package ma.education.tp4.singleton;

public class Terre {
private static Terre ins;	
 double distanceToSoleil,surface;

private Terre(double distanceToSoleil, double surface) {
	
	this.distanceToSoleil = distanceToSoleil;
	this.surface = surface;
}

public static Terre getIns(double distanceToSoleil, double surface) {
	if (ins==null) {
		ins=new Terre(distanceToSoleil, surface);
		return ins;
	}else
	return ins;
}

public double getSurface() {
	return surface;
}

public void setSurface(double surface) {
	this.surface = surface;
}

public double getDistanceToSoleil() {
	return distanceToSoleil;
}

 
 
 

}
