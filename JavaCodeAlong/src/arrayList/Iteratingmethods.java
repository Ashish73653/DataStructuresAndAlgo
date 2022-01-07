package arrayList;
import java.util.*;
public class Iteratingmethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("Ashish");
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("black");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
