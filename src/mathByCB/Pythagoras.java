package mathByCB;

public class Pythagoras {
	
	private double catheter1;
	private double catheter2;
	
	// Method sets the catheter 
	public Pythagoras(double catheter1, double catheter2) {
			
		
		if(catheter1 > 0 | catheter2 > 0){
			this.catheter1 = catheter1;
			this.catheter2 = catheter2; 
		} // End of if - statement
				
			}// End setCatheter method
		
	// Method calculates the hypotenuse	
	public double getHypotenuse() {
		
		double  calcHypotenuse = Integer.MAX_VALUE;
		
		while(calcHypotenuse == Integer.MAX_VALUE) {
			
			double catheter1By2 = (double)	Math.pow(catheter1, 2);
			double catheter2By2 = (double)	Math.pow(catheter2, 2);
			
			calcHypotenuse = Math.sqrt(catheter2By2 + catheter1By2);
			
		}
		return calcHypotenuse;
		
	
	}//End hypotenuse method
	
	// Method sets the catheter 
			public void setCatheter(double catheter1, double catheter2) {
				
				// Store values
				this.catheter1 = catheter1;
				this.catheter2 = catheter2; 
				
			}// End setCatheter method


}
