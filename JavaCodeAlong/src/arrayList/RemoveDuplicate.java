package arrayList;

import java.util.*;
import java.util.Arrays;


public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList(Arrays.asList(1,2,3,3,2,4,5));
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(arr);
//		ArrayList<Integer> res = new ArrayList(lhs);
//		System.out.println(res);
		int n = arr.size();
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int temp = arr.get(i);
			if(res.get(temp)==0) {
				int value = res.get(temp);
				value += 1;
				res.set(temp, value);
				System.out.print(temp+" ");
			}
		}

	}

}
