package mathByCB;

import java.util.Scanner;

public class MainMath {
	public static Scanner userInput = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		//test();
		
		//calcSphereVolume();
		
		//calcQuadraticEquation();
		
		//calcRectangleAreaOrCircumference();
		calcMontlyRate();
		
	}// End main Method
	
	public static void calcMontlyRate() {
		
		SavingsAccount saving1 = new SavingsAccount(0.00,0.00);
		SavingsAccount saving2 = new SavingsAccount(0.00,0.00);
		
		saving1.changeRate(2000, 0.01);
		saving2.changeRate(3000, 0.01);
		
		double monthlyRate1 = saving1.calculateMontlyInterest() - 2000;
		double monthlyRate2 = saving2.calculateMontlyInterest() - 3000;
		
		System.out.printf("%s%n%s%n%s%n%s%n","For Savings account 1: ","The total new balance is: " + saving1.calculateMontlyInterest(), "Next montly rate is: " + monthlyRate1, "");
		System.out.printf("%s%n%s%n%s%n","For Savings account 2: ","The total new balance is: " + saving2.calculateMontlyInterest(), "Next montly rate is: " + monthlyRate2);
		
		
		
	}// End calcMonthlyRate method
	
	public static void calcRectangleAreaOrCircumference() {
		
		Rectangle isRectangle = new Rectangle(0.0, 0.0);
		
		System.out.println("Enter the length of the Rectangle between 0-20: ");
		
		double length = userInput.nextDouble();
		
		System.out.println("Enter the width of the Rectangle between 0-20: ");
		
		double width = userInput.nextDouble();
		
		userInput.close();
		
		isRectangle.setLengthAndWidth(length, width);
		
		System.out.printf("%s%n%s%n","The area of the Rectangle is: " + isRectangle.getRectangleArea() + "cm", "The circumference of the Rectangle is: " + isRectangle.getRectangleCircumference() + "cm");
		
		
		
	}// End static method calcRectangleAreaOrCircumference
	
	public static void calcQuadraticEquation() {
		
		System.out.print("To get the roots for the quadratic equation 'ax^2 + bx + c = 0' enter the values of a, b and c seperated with one space");
		
		String values = userInput.nextLine();
		
		String[] valueList = values.split(" ");
		double[] newValueList = new double[valueList.length];
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		QuadraticEquation isRoots = new QuadraticEquation(a, b, c);
		
		for(int i = 0; i < valueList.length; i++) {
			
		 newValueList[i] = Double.parseDouble(valueList[i]);
			
		}// End for-loop
		
		a = newValueList[0];
		b = newValueList[1];
		c = newValueList[2];
		
		
		isRoots.setValues(a, b, c);
		
		for(double theRoots : isRoots.getRoots()) {
			
			System.out.println(theRoots);
		}
		
	}// End calcQuadraticEquation method
	
	
	public static void calcSphereVolume() {
		
		Sphere isVolume = new Sphere(0.0);
		
		System.out.print("Enter the radius of the sphere: ");
		double radiusOfSphere = userInput.nextDouble();
		
		userInput.close();
		
		isVolume.setRadius(radiusOfSphere);
		
		System.out.print(Math.round(isVolume.getSphere() * 100.0)/100.0 + " is the volume of the sphere");
		
	}// End calcSphereVolume
	
	// Why not set the methods as static in the Pythagoras class?
	public static void test() {
		
		// Then I don't have to do this. 
		Pythagoras isHypotenuse = new Pythagoras(0.0, 0.0);
		
		System.out.println("Enter the length of catheter a: ");
		
		double catheterAInput = userInput.nextDouble();
		
		System.out.println("Enter the length of catheter b: ");
		
		double catheterBInput = userInput.nextDouble();
		
		userInput.close();
		
		isHypotenuse.setCatheter(catheterAInput, catheterBInput);
		
		double test = isHypotenuse.getHypotenuse();
		
		System.out.println("The length of the hypotenuse is: " + Math.round(test * 100.0)/100.0 );
		
		
	}

}// End MainMath class
