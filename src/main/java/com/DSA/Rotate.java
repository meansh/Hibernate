package com.DSA;

import java.util.Collections;

public class Rotate {
	
	//Make rows -> columns and then reverse
	public static void rotateMatrix(int a[][], int row_size, int col_size) {
		for(int i=0; i<row_size; i++) {
			for(int j=i+1; j<col_size; j++) {
				int temp = 0;
				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}

			int start = 0, end = col_size -1;
			
			for(i=0; i<=row_size; i++) {
				
				
				while(start < end) {
					int temp = a[i][start];
					a[i][start] = a[i][end];
					a[i][end] = temp;
					
					start++; end--;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int row_size = a.length;
		int col_size = a[0].length;
		rotateMatrix(a, row_size, col_size);
		
		  for(int i=0; i<row_size; i++) 
		  	{
			  for(int j=0; j<col_size; j++) 
			  {
				  System.out.print(a[i][j] + " "); 
			 }
			  System.out.println(); }
		 
			
	}

}
