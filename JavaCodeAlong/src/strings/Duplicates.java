package strings;

public class Duplicates {

	public static void main(String[] args) {
		String str = "hello ! How are you";
		final int NoOfChars = 256;
		int count[] = new int[NoOfChars];
		int n = str.length();
		for(int i=0;i<n;i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<NoOfChars;i++) {
			if(count[i]>1 && (char)i != ' ') {
				System.out.println((char)i+" is repeated "+count[i]+" number of times.");
			}
		}

	}

}
