package arrayList;

import java.util.ArrayList;

public class EnsureCapacity {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(3);
		al.add(2);
		al.add(5);
		al.add(1);
		System.out.println(al.size());
		al.ensureCapacity(6);
		al.add(2);
		al.add(5);
		al.add(1);
		System.out.println(al.size());

	}

}
