package stack;

import java.util.ArrayList;

public class StackromArrayList {

	static class stackAL{
		ArrayList<Integer> al = new ArrayList<Integer>();
		public boolean isEmpty() {
			return al.size()==0;
		}
		public void push(int data) {
			al.add(data);
		}
		public int pop() {
			int top = al.get(al.size()-1);
			al.remove(al.size()-1);
			return top;
		}
		public int peek() {
			if(al.isEmpty()) {
				return -1;
			}
			return al.get(al.size()-1);
		}
	}
	public static void main(String[] args) {
		StackromArrayList.stackAL s = new StackromArrayList.stackAL();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}
