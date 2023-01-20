package com.DSA;

import java.util.HashMap;

public class TUF {
	private static int hashing(int[] a) {
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int maxi = 0;
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			
			if(sum == 0) {
				maxi = i+1;
			}
			else {
				if(mp.get(sum) != null) {
					maxi = Math.max(maxi, i-mp.get(sum));
				}
				else
					mp.put(sum, i);
			}
		}
		return maxi;
	}
	public static void main(String[] args) {
		int a[] = {15, -2, 2, -8, 1, 7, 10, 23};
		System.out.print(hashing(a));
	}


}
