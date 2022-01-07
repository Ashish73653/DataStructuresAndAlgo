package StringBuffer;

public class StringBufferFunc {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(14);
		sb.append("Welcome to java programming");
		int n = sb.length();
		System.out.println("The length is: "+n);
		int capacity = sb.capacity();
		System.out.println("The capacity is: "+capacity);
		sb.delete(0, 8);
		System.out.println("String after deleting some characters: "+sb);
		sb.replace(0, 2,"The" );
		System.out.println(sb);
		sb.reverse();
		System.out.println("Reverse of string sb is: "+sb);

	}

}
