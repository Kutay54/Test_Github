package geometry;

public class Triangle extends Shape{

	private double a;
	private double b;
	private double c;
	private double height;
	
	public Triangle (double x, double y, double a, double b, double c, double height) {
		this.setX(x);
		this.setY(y);
		this.a = a;
		this.b = b;
		this.c = c;
		this.height = height;
	}
	/**
	 * Searches the base
	 * @return
	 */
	double base() {
		double max = this.a;
		if(this.b > this.c) {
			if(this.b > max) {
				max = this.b;
			}
		}
		if (this.c > this.b) {
			if(this.c > max) {
				max = this.b;
			}
		}
		return max;
	}
	
	/**
	 * Calculates the circumference of the triangle
	 */
	public double calculateCircumference() {
		return (this.a + this.b + this.c);
	}

	/**
	 * Calculates the area of the triangle
	 */
	public double calculateArea() {
		return ((0.5 * this.a) * this.height);
	}

}
