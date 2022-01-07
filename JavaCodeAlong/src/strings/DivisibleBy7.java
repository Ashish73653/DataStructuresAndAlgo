package strings;

public class DivisibleBy7 {

	public static void main(String[] args) {
		String str = "8955795758";
		long num = Long.parseLong(str);
		if(num%7==0) System.out.println("It's divisible by 7.");
		else System.out.println("It's not divisible.");

	}

}
