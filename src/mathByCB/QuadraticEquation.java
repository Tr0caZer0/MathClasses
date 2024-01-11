package mathByCB;

public class QuadraticEquation {

	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c){
		
		if(a >= 0) {
			 this.a = a;
			 this.b = b;
			 this.c = c;
		}
		
	}// End QuadraticEquations constructor
	
	public double[] getRoots() {
		
		double rootXZero = Integer.MAX_VALUE;
		double rootXOne = Integer.MAX_VALUE;
		double[] roots = new double[2];
		
		while(rootXZero == Integer.MAX_VALUE && rootXOne == Integer.MAX_VALUE) {
			
			double firstValuea = a*2;
			double discriminant = Math.pow(b, 2) + ((4*a)*c);
			
			rootXZero = (-b + (Math.sqrt(discriminant)))/firstValuea;
			rootXOne = (-b - (Math.sqrt(discriminant)))/firstValuea;
			
			if(discriminant > 0) {
				roots[0] = rootXZero;
				roots[1] = rootXOne;
			} else if(discriminant == 0) {
				roots[0] = -b/firstValuea;
				roots[1] = roots[0];
			}
			
		}// End while loop
		
		return roots;
		
	}// End getRoots method
	
	public void setValues(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}// End setValues method
	
}// End QuadraticEquation class.
