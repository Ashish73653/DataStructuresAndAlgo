package strings;

public class ClosestString {

	public static void main(String[] args) {
		
		/*
		 * Input:
			S = { "the", "quick", "brown", "fox", 
			     "quick"}
			word1 = "the"
			word2 = "fox"
			Output: 3
		 * 
		 * */
		String arr[] = { "the", "quick", "brown", "fox", 
			     "quick"};
		String word1 = "the";
		String word2 = "fox";
		int a=0,b=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==word1) a=i;
			else if(arr[i]==word2) b=i;
		}
		
		System.out.println(b-a);

	}

}
