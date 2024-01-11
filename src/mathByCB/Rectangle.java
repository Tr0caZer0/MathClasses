package mathByCB;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		
		if(length <= 0 && width <= 0) {
			
			this.length = 1;
			this.length = 1;
			
		}// End for-loop
		
	}// End constructor Rectangle
	
	public double  getRectangleCircumference() {
		
		double lengthTimesTwo = length *2;
		double widthTimesTwo = width *2;
		
		double circumference = lengthTimesTwo + widthTimesTwo;
		
		double roundedCircumference =  Math.round(circumference * 100.0)/100.0;
		
		return roundedCircumference;
	}// end getRectangleCircumference query method
	
	public double getRectangleArea() {
			
		double rectangleArea = length * width;
		double roundedArea =  Math.round(rectangleArea* 100.0)/100.0;
		
		return roundedArea;
		}// end getRectangleArea query method
	
	public void setLengthAndWidth(double length, double width) {
		
		if((length <= 0 || length > 20)) {
			
			throw new IllegalArgumentException("Width must be grather than 0 and less or equal to 20");
			
		}
		
		if(width <= 0 || width > 20) {
			
			throw new IllegalArgumentException("Width must be grather than 0 and less or equal to 20");
			
		}
		
		this.length = length;
		this.width = width;
		
	}

}
