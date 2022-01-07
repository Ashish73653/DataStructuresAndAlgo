package arrays;

public class CyclicallyRotateArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int k = 6;
		int res[] = rotate(arr,k);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}

	private static int[] rotate(int[] arr, int k) {
		int x = arr[arr.length-1];
	       for (int i = arr.length-1; i > 0; i--)
	          arr[i] = arr[i-1];
	       arr[0] = x;
		
		return arr;
	}

}
