package stack;
import java.util.*;
public class PreviousSmallerElement {

	public static void main(String[] args) {
		int arr[] = {4,10,5,8,20,15,3,12};
		previousSmallest(arr);
		
	}

	private static void previousSmallest(int[] arr) {
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && st.peek()>=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				System.out.println(-1);
			}else {
				System.out.println(st.peek());
			}
			st.push(arr[i]);
		}
	}

}
