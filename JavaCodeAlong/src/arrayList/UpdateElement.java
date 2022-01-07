package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UpdateElement {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(5);
		
//		for iteration
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After updation : ");
		
		al.set(2, 3);
		al.set(3,4);
		Iterator<Integer> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
