package com.DSA;

import java.util.HashMap;

public class FourElements 
{
	
	class pair{
		int first, second;
		pair(int f, int s){
			first = f;
			second = s;
		}
	};
	
	static boolean fourCheck(int[] a) {
		HashMap<Integer, pair> map = new HashMap<Integer, pair>();
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = a[i]+a[j];
                if (!map.containsKey(sum))
                    map.put(sum,new pair(i,j));
  
                else // Else (Sum already present in hash)
                {
                    // Find previous pair
                    pair p = map.get(sum);
  
                    // Since array elements are distinct, we don't
                    // need to check if any element is common among pairs
                    System.out.println("("+a[p.first]+", "+a[p.second]+
                                      ") and ("+a[i]+", "+a[j]+")");
                    return true;
                }
			}
		}
		return false;
	}
	public static void main() {
		int a[] = {3, 4, 7, 1, 2, 9, 8};

		fourCheck(a);
		}


}
