package com.DSA;


public class MooreVoting {
	
	private static int findCandidate(int[] arr, int n) {
		int maj_index = 0, count = 1;
		for(int i = 1; i < n; i++) {
			if(arr[maj_index] == arr[i]) 
					count++;
			else
					count--;
			if(count == 0) {
				maj_index = i;
				count = 1;
			}
		}
		return arr[maj_index];
	}
	

	private static boolean isMajority(int[] arr, int n, int cand) {
		int count = 0;
		for(int i=0; i<n; i++) 
			if(arr[i] == cand)
				count++;
			
		if(count > n/2)
				return true;
		
		return false;
	}
	
	private static void printMajority(int[] arr, int n) {
		int cand = findCandidate(arr, n);
		if(isMajority(arr, n, cand))
			System.out.println(cand);
		else
			System.out.println("No majority element.");
				
		
	}


	public static void main(String[] arg) {
		int n = 7;
		int []arr = new int[]{2, 2, 1, 1, 1, 2, 2};
		printMajority(arr, n);
	}


}
