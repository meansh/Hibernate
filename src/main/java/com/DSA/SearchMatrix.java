package com.DSA;

public class SearchMatrix {
	
	private static boolean search(int[][] a, int target) {
		int row = a.length; int col = a[0].length;
		int low = 0, high = (row*col)-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(a[mid/col][mid % col] == target)
				return true;
			if(a[mid/col][mid%col] < target)
				low = mid+1;
			else
				high = mid-1;
		}
	    return false;
				
	}
	public static void main(String[] args) {
		int [][]a = new int[][]{
			{1, 3, 5, 7}, 
			{10, 11, 16, 20}, 
			{23, 30, 34, 60}
			};			
			int target = 23;
			System.out.println(search(a, target));
		
	}

	

}
