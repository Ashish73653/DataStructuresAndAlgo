package arrays;

import java.util.Arrays;

public class KthSmallest {

	public static void main(String[] args) {
		int arr[] = {1,5,2,3,4};
		int n = arr.length;
		int k = 3;
		Arrays.sort(arr);
		System.out.println("Kth smallest element is: "+arr[k-1]);
	}

}
