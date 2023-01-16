package com.DSA;

import java.util.Arrays;

public class TwoSum {
	
	private static void binarySearch(int[] a, int low, int high, int x) {
		Arrays.sort(a);
		while(low <= high) {
			int mid = (low+high)/2;
			if(a[mid] == x) {
				System.out.println("Yes");
				return;
			}
			else if(a[mid] < x)
				low = mid+1;
			else
				high = mid-1;
		}
		System.out.print("No");
	}
	
	public static void main(String[] args) {
		int a[] = new int[] {8, 7, 4, 11, 15};
		int target = 15;
		int x = target - a[0] ;
		binarySearch(a, 0, a.length-1, x);
	}


}
