package geometry;

import java.util.ArrayList;

public class Group {
	ArrayList<Shape> shapes = new ArrayList<>();

	
	/**
	 * Adds a new shape
	 * @param shape
	 */
		void addShape(Shape shape) {
			shapes.add(shape);
		}
		
	/**
	 * Removes a shape
	 * @param shape
	 */
		void removeShape(Shape shape) {
			shapes.remove(shape);
		}
	
	/**
	 * Calculates the circumference of the added body
	 * @return
	 */
		double calculateTotalCircumference() {
			double totalCircumference = 0;
			for(Shape shape : shapes) {
				totalCircumference += shape.calculateCircumference();
			}
			return totalCircumference;
		}
		
		/**
		 * Calculates the area of the added body
		 * @return
		 */
		double calculateTotalArea() {
			double totalArea = 0;
			for (Shape shape : shapes) {
				totalArea += shape.calculateArea();
			}
			return totalArea;
		}
		
		/**
		 * Finds the largest shape
		 * @return
		 */
		Shape findLargestShape() {
			if(shapes.isEmpty()) {
				return null;
			}
			Shape largestShape = shapes.get(0);
			for (Shape shape : shapes) {
				if (shape.calculateArea() > largestShape.calculateArea()) {
					largestShape = shape;
				}
			}
			return largestShape;
		}
		
		void printAllShapes() {
			for (Shape shape : shapes) {
				System.out.println(shape.getClass().getSimpleName() + " at position (" + shape.x + ", " + shape.y + ")");
				
			}
		}
		
}