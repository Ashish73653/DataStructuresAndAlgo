package stack;
import java.util.*;
public class NextSmallerElement {

	public static void main(String[] args) {
		int arr[] = {3,10,5,1,15,10,7,6};
		nextSmaller(arr);

	}

	private static void nextSmaller(int[] arr) {
		int res[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!st.isEmpty() && st.peek()>=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				res[i]=-1;
			}else {
				res[i]=st.peek();
			}
			st.push(arr[i]);
		}
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}

}
