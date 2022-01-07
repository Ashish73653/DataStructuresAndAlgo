package recursion;


public class FirstAndLastOccurence {
	static int first = -1;
	static int last = -1;
	public static void occurence(String str,int first,int last,char ch,int index) {
		if(index==str.length()-1) {
			System.out.println(first + " and "+ last);
			return;
		}
		
		if(str.charAt(index)==ch) {
			if(first==-1) {
				first = index;
			}else {
				last = index;
			}
		}
		
		occurence(str,first,last,ch,index+1);
	}

	public static void main(String[] args) {
		String str = "aaygsujasas";
		char ch = 'a';
		int index = 0;
		occurence(str,first,last,ch,index);

	}

}
