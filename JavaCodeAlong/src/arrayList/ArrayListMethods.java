package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
//		1. Add elements in Arraylist
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(13);
		list.add(41);
		System.out.println(list);
		
//		2. Add elements while declaring arraylist
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(arr);
		
//		3. Add all elements of one to other 
		arr.addAll(list);
		System.out.println(arr);
		
//		4. clear
		list.clear();
		System.out.println(list);
		
//		5. contains
		System.out.println(arr.contains(13));
		
//		6. IndexOf or lastIndexOf
		System.out.println(arr.indexOf(2));
		System.out.println(arr.lastIndexOf(1));
		
//		6. clone();
		ArrayList<String> st4 = new ArrayList<String>(Arrays.asList("Chetan","Karan","Asish"));
	
		ArrayList<String> cl= (ArrayList<String>)st4.clone();
		System.out.println(cl);
		System.out.println(st4);
		
//		7. removeIf
		ArrayList<Integer> in1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));		
		in1.removeIf(in12 -> in12 % 2==0);
		System.out.println(in1);
		
//		8. retainAll();
		ArrayList<String> st5 = new ArrayList<String>(Arrays.asList("Chetan","Karan","Asish","Karan","Chetan","Karan"));
		st5.retainAll(Collections.singleton("Karan"));
		System.out.println(st5);
		
//		9. Arraylist toArray();
		ArrayList<String> st6 = new ArrayList<String>(Arrays.asList("Chetan","Karan","Asish","Karan","Chetan","Karan"));
		Object arr1[]=st6.toArray();
		System.out.println(Arrays.toString(arr1));

	}

}
