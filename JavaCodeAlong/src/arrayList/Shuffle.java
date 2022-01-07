package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(87);
		
		Collections.shuffle(al);
		System.out.println(al);
	}

}
