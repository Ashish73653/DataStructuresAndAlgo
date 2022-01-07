/*
 * 			|					|					|
 * 			|					|					|
 * 			|					|					|
 *			| 					|					|
 * 		---------------------------------------------------
 * 			A					B					C
 * 		Source				Helper				Destination
 * 
 * there r n disks in tower A and we have to take all those and place at c tower in same
 *  order which is larger at bottom and small at top
 *  
 *   Rules: 
 *   1> Only one disk transferred in one step
 *   2> Smaller disk are always kept on larger disks
 * 
 * */




package recursion;

public class TowerOfHanoi {
	public static void towerOfHanoi(int n,String src,String helper,String dest) {
		if(n==1) {
			System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
			return;
		}
		towerOfHanoi(n-1,src,dest,helper);
		System.out.println("transfer disk "+ n +" from "+src+" to "+dest);
		towerOfHanoi(n-1,helper,src,dest);
	}

	public static void main(String[] args) {
		int n = 2;
		towerOfHanoi(n,"S","H","D");

	}

}
