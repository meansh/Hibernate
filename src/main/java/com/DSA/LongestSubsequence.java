package com.DSA;

import java.util.Arrays;

public class LongestSubsequence {
	
	private static void longestSubsequence(int[] a) {
		int len = a.length;
		Arrays.sort(a);
		int count = 0;
		int min = a[0];
		int max = a[len-1];
		int k = 0;
		for(; min<max; min++) {
			if(a[k++] == min) {
				count++;
			}
			else{
				break;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int a[] = new int[]{100, 200, 1, 3, 2, 4};
		longestSubsequence(a);
	}


}
