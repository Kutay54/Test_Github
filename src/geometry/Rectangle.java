package geometry;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	public Rectangle(double x, double y, double length, double width) {
		this.setX(x);
		this.setY(y);
		this.length = length;
		this.width = width;
	}
	

	/**
	 * Calculates the circumference of the rectangle
	 */
	public double circumference() {
		return((2 * this.length) *(2 * this.width));
	}

	/**
	 * Calculates the area of the rectangle
	 */
	public double area() {
		return (this.length * this.width);
	}
		 
}
