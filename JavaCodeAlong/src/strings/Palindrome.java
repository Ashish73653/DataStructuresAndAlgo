package strings;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String str = "abba";
		int n = str.length();
		char arr[] = new char[n];
		for(int i=n-1;i>=0;i--) {
			arr[n-i-1] = str.charAt(i);
		}
		StringBuffer sbr = new StringBuffer();
		sbr.append(arr);
		String s = sbr.toString();
		
		if(str.equals(s)) System.out.println("It's a palindrome");
		else System.out.println("Not a palindrome");
		

	}

}
