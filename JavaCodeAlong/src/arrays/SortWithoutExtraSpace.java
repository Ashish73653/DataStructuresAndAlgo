package arrays;

import java.util.Arrays;

public class SortWithoutExtraSpace {

	public static void main(String[] args) {
		int arr1[] = {1,3};
		int arr2[] = {2,5,11};
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>=arr2[0]) {
				int temp = 0;
				temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
			}
			Arrays.sort(arr2);
		}
		Arrays.sort(arr1);
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
		}
		System.out.println();
		for(int k=0;k<arr2.length;k++) {
			System.out.print(arr2[k]+" ");
		}

	}

}
