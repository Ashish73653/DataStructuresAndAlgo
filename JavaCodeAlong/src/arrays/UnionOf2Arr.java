package arrays;

import java.util.HashSet;

public class UnionOf2Arr {

	public static void main(String[] args) {
//		a[] = 1,2,3,4,5
//		b[] = 1,2,3
//		output is 5 as 1,2,3,4,5, are union of these two array
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3};
		int n = a.length;
		int m = b.length;
		System.out.println("Union is: "+union(a,b,n,m));

	}

	private static int union(int[] a, int[] b, int n, int m) {
		HashSet<Integer> set=new HashSet<Integer>();
        
        int arr[] = new int[n+m];
        for(int i=0;i<n;i++){
            arr[i] = a[i];
        }
        for(int i=0;i<m;i++){
            arr[n+i] = b[i];
        }
        int g = arr.length;
        for(int j=0;j<g;j++){
            set.add(arr[j]);
        }
        int res = set.size();
        return res;	
		
	}

}
