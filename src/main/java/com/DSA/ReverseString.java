package com.DSA;

import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		String s = "I like this program very much";
		Stack<String> st = new Stack<String>();
		String str = ""; 
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				st.push(str);
				str = "";
			}
			str += s.charAt(i);
		}
		st.push(str);
		 String ans="";
		    while(st.size()!=1)
		    {
		        ans+=st.peek()+ " ";   
		        st.pop();
		    }
		    
		    ans+=st.peek();
		    System.out.print(ans.replaceAll("\\s", " "));
		/*
		 * st.push(str); while(st.size() != 0) { if(st.size() == 1) {
		 * System.out.print(" "); } System.out.print(st.pop()); }
		 */
			
	}
}
