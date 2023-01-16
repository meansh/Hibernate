package com.DSA;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	private static int withoutRepeatingChar(String str) {
		if(str.length() == 0)
			return 0;
		
		int maxans = 0;
		Set <Character> set = new HashSet<Character>();
		int left = 0;
		for(int right=0; right<str.length(); right++) {
			if(set.contains(str.charAt(right))) {
				while(left < right && set.contains(str.charAt(right))) {
					set.remove(str.charAt(left));
					left++;
				}
			}
			set.add(str.charAt(right));
			maxans = Math.max(maxans, right-left+1);
		}
		
		return maxans;
	}
	public static void main(String[] args) {
		String str = "abcabc";
		System.out.println(withoutRepeatingChar(str));
	}

	
}
