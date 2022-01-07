package strings;

public class EncryptString2 {

	public static void main(String[] args) {
		String str = "aaaaaaaaaaa";
		int count = 0;
		String res = "";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
		}

	}

}
