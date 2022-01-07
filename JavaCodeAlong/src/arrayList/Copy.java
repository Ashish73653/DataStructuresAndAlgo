package arrayList;

import java.util.ArrayList;

public class Copy {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(4);
		al1.add(5);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(87);
		al2.add(23);
		
		for(int i=0;i<al1.size();i++) {
			al2.set(i, al1.get(i));
		}
		System.out.println(al2);
	}

}
