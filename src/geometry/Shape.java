package geometry;

public abstract class Shape {

		public double y;
		public double x;
		public abstract double circumference();
		public abstract double area();
		
		
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public int calculateArea() {
			// TODO Auto-generated method stub
			return 0;
		}
		public double calculateCircumference() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
}