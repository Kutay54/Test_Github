package geometry;

public class Rectangle extends Shape {

	public double length;
	public double width;
	
	public Rectangle(double x, double y, double length, double width) {
		this.setX(x);
		this.setY(y);
		this.length = length;
		this.width = width;
	}
	

	/**
	 * Calculates the circumference of the rectangle
	 */
	@Override
	public double circumference() {
		return((2 * this.length) *(2 * this.width));
	}

	/**
	 * Calculates the area of the rectangle
	 */
	@Override
	public double area() {
		return (this.length * this.width);
	}
		 
}
