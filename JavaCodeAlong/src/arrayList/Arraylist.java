package arrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
//		ArrayList ald = new ArrayList();
		ArrayList<String> al = new ArrayList<>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("black");
//		System.out.println(al);
		
//		for iteration
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String x: al) {
			System.out.println(x);
		}

	}

}
