package com.DSA;

public class LongestPalindrome {
	
	private static String longestPal(String s) {
		int l, h;
		int start = 0, end = 1;
		for (int i = 1; i < s.length(); i++) {

			// Even substring
			l = i - 1;
			h = i;

			while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
				if (h - l + 1 > end) {
					start = l;
					end = h - l + 1;
				}
				l--;
				h++;
			}

			// Odd substring
			l = i - 1;
			h = i + 1;

			while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
				if (h - l + 1 > end) {
					start = l;
					end = h - l + 1;
				}
				l--;
				h++;
			}

		}
		return printString(s, start, start+end-1);
	}
	
	
	private static String printString(String s, int start, int end) {
		String str = "";
		for(int i=start; i<=end; i++)
			str+=s.charAt(i);
		//System.out.print(str);
		return str;
		
	}


	public static void main(String[] args) {
		String s = "aaaabbaa";
		System.out.print(longestPal(s));
		
	}

	
}
