package strings;

public class ReverseWordsInStr {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
//		Answer: much.very.program.this.like.i
		
		String arr[] = str.split("\\.");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			if(i!=0)System.out.print(".");
		}

	}

}
