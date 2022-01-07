package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElement {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(32);
		arr.add(12);
		arr.add(1);
		arr.add(12);
//		List<Integer> li =arr.stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(li);
		
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i).equals(arr.get(j))){
	                arr.remove(j);
	                j--;
	            }
			}
		}
		System.out.println(arr);

	}

}
