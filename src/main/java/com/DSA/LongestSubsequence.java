package com.DSA;

import java.util.Arrays;

public class LongestSubsequence {
	
	private static void longestSubsequenceWithZero(int[] a) {
		int max = 0;
		for(int i=0; i<a.length; i++) {
			int sum = 0;
			for(int j=i; j<a.length; j++) {
				sum += a[j];		
				if(sum == 0)
					max = Math.max(max, j-i+1);
			}
		}
		System.out.print(max);
	}
	
	public static void main(String[] args) {
		int a[] = new int[]{9, -3, 3, -1, 6, -5};
		longestSubsequenceWithZero(a);
	}

	
	


}
