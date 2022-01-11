package stack;

import java.util.Stack;

public class ReverseStack {
	
	public Stack<Integer> reverse(Stack<Integer> s) {
		Stack<Integer> res = new Stack<>();
		while(!s.isEmpty()) {
			int top = s.pop();
			res.push(top);
		}
		return res;
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		ReverseStack rs = new ReverseStack();
//		Stack<Integer> stack = rs.reverse(st);
//		while(!stack.isEmpty()) {
//			System.out.println(stack.peek());
//			stack.pop();
//		}
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
	}
}
