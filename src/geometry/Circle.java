package geometry;

public class Circle extends Shape{

	private double radius;
	private final double pi = 3.14;
	
	public Circle (double x, double y, double radius) {
		this.setX(x);
		this.setY(y);
		this.radius = radius;
	}
	
	
	/**
	 * Calculates the circumference of the circle
	 */

	public double calculateCircumference() {
		return ((2 * this.radius) * this.pi);
	}

	/**
	 * Calculates the area of the circle
	 */
	public double calculateArea() {
		return (this.pi * (this.radius * this.radius));
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pi=" + pi + "]";
	}

}
