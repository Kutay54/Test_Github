package arrays;

import java.util.List;

public class FilteringComments {
	
	
	public static void reduceToComments(List<String>lines) {
			  lines.subList(0, 3).clear();
			  if (lines.isEmpty()) {
			    return;
			  }
			  String comment = lines.get(0);
			  
			  lines.remove(0);

			  System.out.println(comment);
			}


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
