package rekursion;

public class BinomialCoefficient {

	public static int calculateBinomalCoeffizient(int n, int k) {
		if ( k == 0 || k == n) {
			return 1;
		} else {
			return calculateBinomalCoeffizient(n - 1, k - 1) 
					+ calculateBinomalCoeffizient(n-1, k);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateBinomalCoeffizient(4, 2));
		
	}

}
