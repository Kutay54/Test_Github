package arrays;

import java.lang.reflect.Array;

public class Aufgabe1 {

	
	int[] dailyGains = {1000,2000,500,9000,9010};
			
		public int count5PercentJumps(int[]gains){
			
			int jumps = 0;
			for(int i = 0; i < gains.length; i++) {
				if((gains[i] - gains[1])  > (gains[i - 1] * 0.05)) {
					jumps++;
				}
			}
			return 0;
		}
	}

