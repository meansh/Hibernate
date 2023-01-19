package com.DSA;

public class LongestCommonPrefix {
	
	
	private static String commonPrefixUtil(String str1, String str2) {
		String res = "";
		for(int i=0, j=0; i<=str1.length()-1 && j<=str2.length()-1; i++, j++) {
			if(str1.charAt(i) != str2.charAt(j)) {
				break;
			}
			res += str1.charAt(i);
		}
		return res;
	}

	
	private static String commonPrefix(String[] ar, int low, int high) {
		if(high == low)
				return ar[low];
		if(low < high) {
			int  mid = (low+high)/2;
			
			String str1 = commonPrefix(ar, low, mid);
			String str2 = commonPrefix(ar, mid+1, high);
			
			return commonPrefixUtil(str1, str2);
		}
		return null;
	}

	public static void main(String[] args) {
		String[] ar = {"geeksforgeeks", "geeks",
	            "geek", "geezer"};
		System.out.print(commonPrefix(ar, 0, ar.length-1));                    
		
	}


}
