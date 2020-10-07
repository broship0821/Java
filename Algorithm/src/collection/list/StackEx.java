package collection.list;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		String expression = "((3+5)*8-2)";
		
		System.out.println("expression: " + expression);
		
		try {
			for(int i=0;i<expression.length();i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch);
				} else if(ch==')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호 일치");
			} else {
				System.out.println("괄호 불일치");
			}
			
		} catch (EmptyStackException e) {
			System.out.println("괄호 불일치2");
		}

	}

}
