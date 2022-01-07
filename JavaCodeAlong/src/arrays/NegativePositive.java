package arrays;

public class NegativePositive {

	public static void main(String[] args) {
		int arr[] = {-1,3,-5,3,5,-9};
		int n = arr.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				int temp = 0;
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
				j++;
			}
		}
		for(int j1=0;j1<n;j1++) {
			System.out.print(arr[j1]+" ");
		}

	}

}
