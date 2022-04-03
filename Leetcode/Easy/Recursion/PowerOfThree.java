package Leetcode.Easy.Recursion;

import java.util.Scanner;

public class PowerOfThree {
	 public boolean isPowerOfThree(int n) {
	        if (n == 1) {
	            return true;
	        }
	        if ((n == 0) || (n % 3 != 0)) {
	            return false;
	        }
	        return isPowerOfThree(n/3);
	    }
}

/** Maths solutn
 * 
 * class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        double x = Math.log10(n)/Math.log10(3);
        return (x % 1 == 0) ? true : false;
    }
}
 */