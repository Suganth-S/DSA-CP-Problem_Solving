package Leetcode.Easy.arrays;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[] = new int [] {1,2,3,1};
		 byte[] mark = new byte[150000];
		    for (int i : nums) {
		        int j = i/8;
		        int k = i%8;
		        int check = 1<<k;
		        if ((mark[j] & check) != 0) {
		            System.out.println("true");
		        }
		        mark[j]|=check;
		    }
		    System.out.println("false");
		    
//		int n = nums.length;
//        Arrays.sort(nums);
//        
//        for(int i=1; i<n; i++)
//        {
//            if(nums[i]==nums[i-1])
//            {
//                System.out.println("true");
//            }
//            else {
//                System.out.println("false");
//            }
//        }
	}

}
