package arrayList;

import java.util.ArrayList;

public class AddTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        
        ArrayList<String> res = new ArrayList<>();
        res.addAll(c1);
        res.addAll(c2);
        System.out.println(res);

	}

}
