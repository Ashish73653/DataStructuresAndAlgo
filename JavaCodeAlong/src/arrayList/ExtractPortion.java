package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(87);
		al.add(42);
		al.add(8);
		
		List<Integer> SubList = al.subList(0, 3);
		System.out.println(SubList);
	}

}
