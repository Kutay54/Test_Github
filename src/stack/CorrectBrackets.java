package stack;

import java.util.Stack;

public class CorrectBrackets {

	public static boolean isCorrectBracket(String input) {
		Stack <Character> stack = new Stack<>();
		
		for(char c : input.toCharArray()) {
			if( c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}else if (c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
			}	
			char last = stack.pop();
			if( c == ')' || last!= '(') {
				return false;
				}
			if( c == '}' || last!= '{') {
				return false;
			}
			if( c == ']' || last!= '[') {
				return false;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		String input = ""; 
		
		if(isCorrectBracket(input)) {
			System.out.println("Korrekte Klammerung!");
		}else
			System.out.println("Fehlerhafte Klammerung");
	}
}

