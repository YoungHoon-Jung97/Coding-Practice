package ¿Ã¹Ù¸¥°ýÈ£;

import java.util.Stack;

public class StackSolution {

	public boolean  stackSolution(String s){
		
		Stack<Character> stack = new Stack<Character>();
		
		for (Character character : s.toCharArray()) {
			
			if(character== '(') {
				stack.push(character);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		
		return stack.isEmpty();
	}
}
