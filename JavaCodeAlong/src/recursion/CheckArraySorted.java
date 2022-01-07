package recursion;

public class CheckArraySorted {
	
	public static boolean checkSorted(int arr[],int index) {
		if(index == arr.length-1) {
			return true;
		}
		if(arr[index]<arr[index+1]) {
			return checkSorted(arr,index+1);
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,8};
		int index = 0;
		
		System.out.println("Array is sorted: "+checkSorted(arr,index));

	}

}
