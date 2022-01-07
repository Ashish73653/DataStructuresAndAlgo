package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class InsertElementAtFirst {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("black");
		al.add(0, "First color");
		al.add(3, "specified place");
		
//		for iteration
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
