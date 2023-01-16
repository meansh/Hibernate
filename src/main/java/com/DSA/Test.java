package com.DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sorting implements Comparator<Integer>{
		public int compare(Integer i1, Integer i2) {
			return (i1<i2)?-1:(i1>i2)?1:0;
			/*
			 * if(i1<i2) return -1; else if(i1>i2) return 1; else return 0;
			 */
		}
	}

	public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(5);
		l.add(8);
		l.add(40);
		Collections.sort(l, new Sorting());
		System.out.println(l);
	}
	
}
