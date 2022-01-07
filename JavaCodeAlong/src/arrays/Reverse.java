package arrays;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		ReverseArr(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] ReverseArr(int[] arr, int n) {
		int temp = 0;
		int start = 0;
		int end = n-1;
		
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		
		return arr;
		
		
	}

}
