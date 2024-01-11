package mathByCB;


public class Sphere {
	
	private double radius; 
	
	// When a new object is created an initial parameter is passed which in turn will set, in this case the radius, the variable for this instance. 
	public Sphere(double radius) {
		
		if(radius > 0) {
			this.radius = radius;
		} // End If-statement
		
	}// End Sphere 
	
	public double getSphere() {
		
		double calcSphereVolume = Integer.MAX_VALUE;
		
		while(calcSphereVolume == Integer.MAX_VALUE) {
			
			double radiusPowByThree = Math.pow(radius, 3);
			double timesNumerator = (Math.PI*radiusPowByThree)*4;
			calcSphereVolume = timesNumerator/3;
			
		}
		
		return calcSphereVolume;
	}
	
	// Allows us to change the already set instance variable
	public void setRadius(double radius) {
		
		this.radius = radius;
	}

}// End Sphere class
