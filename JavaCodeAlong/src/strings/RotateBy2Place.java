package strings;

public class RotateBy2Place {

	public static void main(String[] args) {
		String a = "amazon";
		String b = "onamaz";
		int n1 = a.length();
		int n2 = b.length();
		String Clockwise = "";
		String antiClockwise = "";
		if(n1==n2) {
			antiClockwise += a.substring(n1-2, n1) + a.substring(0, n1-2) ;
			Clockwise += a.substring(2)+a.substring(0, 2);
			if(b.equals(Clockwise) || b.equals(antiClockwise)) System.out.println("True");
			else System.out.println("False");
		}
		

	}

}
