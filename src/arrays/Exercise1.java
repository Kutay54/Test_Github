package arrays;

import java.lang.reflect.Array;

public class Exercise1 {

	
	int[] dailyGains = {1000,2000,500,9000,9010};
			
		public int count5PercentJumps(int[]gains){
			int jumps = 0;
			for(int i = 0; i < gains.length; i++) {
				if((gains[i] - gains[1])  > (gains[i - 1] * 1.05)) {
					jumps++;
				}
			}
			if(gains == null || gains.length < 2) {
				return -1;
			}
			return 0;
		}
	}

