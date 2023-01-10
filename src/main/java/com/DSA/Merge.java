package com.DSA;

import java.util.Arrays;

public class Merge {
	
	private static void merge_extra(int n, int[] arr1, int m, int[] arr2) {
		int i, k;
		for(i=0; i<n; i++) {
			if(arr1[i] > arr2[0]) {
				int temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
			}
			int first = arr2[0];
			
			for(k=1; k<m && arr2[k] < first; k++) 
				arr2[k-1] = arr2[k];
			
			arr2[k-1] = first;
	
		}
	}
	public static void main(String[] args) {
		int n=4, m=5;
		int arr1[] = new int[]{1, 3, 5, 7};
		int arr2[] = new int[]{0, 2, 6, 8, 9};
		merge_extra(n, arr1, m, arr2);
		
		for(int i=0; i<n;  i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		for(int i=0; i<m; i++)
			System.out.print(arr2[i] + " ");
		
	}

	
}
