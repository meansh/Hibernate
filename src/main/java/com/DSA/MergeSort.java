package com.DSA;

public class MergeSort {
	
	private static void merge(int[] a, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int f = left;
		int temp[] = new int[100000];
		
		while(i<=mid && j<=right) {
			if(a[i] < a[j]) {
				temp[f] = a[i];
				i++;
			}
			else {
				temp[f] = a[j];
				j++;
			}
			f++;
		}
		
		if(i > mid) {
			while(j <= right) {
				temp[f] = a[j];
				f++;
				j++;
			}
		}
		
		else {
			while(i <= mid) {
				temp[f] = a[i];
				f++;
				i++;
			}
		}
		for(f=left; f<=right; f++)
			a[f] = temp[f];
	}
	
	private static void mergeSort(int[] a, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			mergeSort(a, left, mid);
			mergeSort(a, mid+1, right);
			merge(a, left, mid, right);
		}
		
	}
	


	public static void main(String[] args) {
		int a[] = new int[] {9, 4, 7, 6, 3, 1, 5};
		mergeSort(a, 0, a.length-1);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}


}
