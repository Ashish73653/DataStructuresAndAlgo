package strings;

public class Reverse {

	public static void main(String[] args) {
		/* Why strings are immutable ?
		 * String is Immutable in Java because String
		 * objects are cached in String pool. 
		 * Since cached String literals are shared between
		 * multiple clients there is always a risk, 
		 * where one client's action would affect all
		 * another client */
		
		String str = "Hello Ashish!";
		int n = str.length();
		
		System.out.println("Method 1");
//		Method 1
		char arr[] = new char[n];
		for(int i=n-1;i>=0;i--) {
			arr[n-i-1] = str.charAt(i);
		}
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]);
		}
		
		
		System.out.println();
		System.out.println("Method 2");
//		Method 2
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.print(sbr);
		
		System.out.println();
		System.out.println("Method 3");
//		Method 3
		char arr1[] = str.toCharArray();
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr1[i]);
		}
		
		

		System.out.println();
		System.out.println("Method 4");
//		Method 4
		char s[] = str.toCharArray();
        int j=n-1;
        int i=0;
            while(i!=j && i<j){
                char temp = '\0';
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                j--;
                i++;
            }
            for(int k=0;k<n;k++) {
    			System.out.print(s[k]);
    		}
	}

}
