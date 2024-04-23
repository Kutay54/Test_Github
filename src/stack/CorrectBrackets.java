package stack;

import java.util.LinkedList;
import java.util.Stack;

public class CorrectBrackets {

	public static boolean isCorrectBracket(String input) {
		LinkedList<Character> stack = new LinkedList<>();
		
		for(char c : input.toCharArray()) {
			if( c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}else if (c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
			}	
			char last = stack.peek();
			if((c == ')' && last!= '(') ||
				( c == '}' && last!= '{')||
				( c == ']' && last!= '['))	{
				return false;
				}
			stack.pop();
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		System.out.println(isCorrectBracket("()"));
	}
}

