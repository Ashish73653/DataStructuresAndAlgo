package arrays;

public class RainwaterTrappingProb {
	
	public static void main(String[] args) {
		int arr[] = {7,4,0,9};
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int leftNo = arr[0];
		int rightNo = arr[n-1];
		for(int i=0;i<n;i++) {
			if(arr[i]<leftNo) {
				left[i] = leftNo;
			}else {
				leftNo = arr[i];
				left[i] = leftNo;
			}
		}
		for(int i=n-1;i>=0;i--) {
			if(arr[i]<rightNo) {
				right[i] = rightNo;
			}else {
				rightNo = arr[i];
				right[i] = rightNo;
			}
		}
		int totalWater = 0;
		for(int i=0;i<n;i++) {
		 totalWater = totalWater + (Math.min(left[i], right[i])-arr[i]);
		}
		System.out.println("Totalwater is: "+totalWater);
		
	}

}
