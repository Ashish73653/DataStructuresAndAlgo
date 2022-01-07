package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = {1,1,2};
		int n = arr.length;
		int res[] = new int[n];
		
		for(int i=0;i<n;i++) {
			int temp = arr[i];
			if(res[temp]==0) {
				res[temp]++;
				System.out.print(temp+" ");
			}
		}

	}

}
