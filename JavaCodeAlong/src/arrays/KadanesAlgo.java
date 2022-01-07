package arrays;

public class KadanesAlgo {

	public static void main(String[] args) {
		int arr[] = {1,-3,1,2,4,-5};
		int n = arr.length;
		System.out.println(longestSumSubArr(arr,n));
	}

	private static int longestSumSubArr(int[] arr, int n) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for(int i =0;i<n;i++) {
			currSum = currSum+arr[i];
			if(maxSum<currSum) {
				maxSum=currSum;
			}
			if(currSum<0) {
				currSum = 0;
			}
		}
		return maxSum;
	}

}
