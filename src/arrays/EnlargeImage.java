package arrays;

public class EnlargeImage {
	
	
	int[][] matrix = new int [2][3];
	
	
	int[][]magnify(int[][]array, int factor) {
		int factor1 = 2;
		int newWidth = array[0].length * factor1;
		int newLength = array[0].length * factor1;
		int[][] newMatrix = new int[newLength][newWidth];
		
		int value = 1;
		for(int i = 0; i < newWidth; i++) {
			for(int j = 0; j < newLength; j++) {
				newMatrix[i][j] = value;
				value++;
			}
		}
		return newMatrix;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
	}
}
