package arrayList;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(12);
		al.add(25);
		al.add(18);
		al.add(21);
		al.add(4);
		al.add(5);
		
//		1,2,12,25,18,21,4,5
//		t = 25
		
		
//		Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)>al.get(j)) {
					int temp = 0;
					temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j,temp);
				}
			}
		}
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
