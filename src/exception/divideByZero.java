package exception;

public class divideByZero {

	
	public static double divide(double x, double y) {
		if(y == 0) {
			throw new ArithmeticException("Divison durch 0");
		}else {
			
		
		return x/y;
	}
	}
	
		public static void main(String[] args) {
			double x = 7;
			double y = 6;
			try {
				double result = divide(x,y);
				System.out.println("Ergebnis:" + result);
			}catch (ArithmeticException e) {
				System.err.println("Division durch 0 nicht möglich");
				
			}
			

	}

}
