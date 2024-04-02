package problems.isValid;

import java.util.Stack;

public class isValidOtherClass {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>(); 
		for (char c : s.toCharArray()) { 
			if (c == '(') 
				stack.push(')');
			else if (c == '{') 
				stack.push('}'); 
			else if (c == '[') 
				stack.push(']'); 
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		isValidOtherClass is = new isValidOtherClass();

//		System.out.println(is.isValid("()")); // true
//		System.out.println(is.isValid("()[]{}"));// true
		System.out.println(is.isValid("{[]}"));// true
//
//		System.out.println(is.isValid("(]")); // false
//		System.out.println(is.isValid("(){}}{"));// false
//		System.out.println(is.isValid("({{{{}}}))"));// false

	}
}
