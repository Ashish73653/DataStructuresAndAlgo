package strings;

public class RomanToInteger {
	public static int getValue(char ch) {
		int ans = 0;
		switch(ch) {
		case 'I': ans = 1; break;
		case 'V': ans = 5; break;
		case 'X': ans = 10; break;
		case 'L': ans = 50; break;
		case 'C': ans = 100; break;
		case 'D': ans = 500; break;
		case 'M': ans = 1000; break;
		default : ans = -1; break;
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "XLIII";
		int result = 0;
		for(int i=0;i<str.length();i++) {
			int s1 = getValue(str.charAt(i));
			if(i+1<str.length()) {
				int s2 = getValue(str.charAt(i+1));
				if(s1>=s2) {
					result += s1;
				}else {
					result += s2-s1;
					i++;
				}
			}else {
				result += s1;
			}
		}
		System.out.println(result);
	}

}
