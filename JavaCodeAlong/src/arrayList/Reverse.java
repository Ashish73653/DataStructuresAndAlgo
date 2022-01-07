package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(87);
		
//		for(int i=al.size()-1;i>=0;i--) {
//			System.out.println(al.get(i));
//		}
		
		Collections.reverse(al);
		System.out.println(al);

	}

}
