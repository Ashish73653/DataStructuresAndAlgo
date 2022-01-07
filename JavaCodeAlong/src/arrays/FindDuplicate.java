package arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int nums[] = {1,2,1,4,3,3};
		int n = nums.length;
        int arr[] = new int[n];
        
        int res = 0;
        for(int i=0;i<n;i++){
            int temp = nums[i];
            arr[temp]++;
            if(arr[temp]>1){
            	res=temp;
                System.out.print(res+" ");
            }
            
        }

	}

}
