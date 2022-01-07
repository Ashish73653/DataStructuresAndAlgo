package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Searching {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(12);
		al.add(25);
		al.add(18);
		al.add(21);
		
		Iterator<Integer> itr = al.iterator();
		int i = 0;
		while(itr.hasNext()) {
			i++;
			if(itr.next()==25) {
				System.out.println("Element found at position: "+i);
				break;
			}
		}

	}

}
