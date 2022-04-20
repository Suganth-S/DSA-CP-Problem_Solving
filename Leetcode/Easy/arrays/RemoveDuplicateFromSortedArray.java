package Leetcode.Easy.arrays;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int nums[] = new int[] {0,0,1,1,1,2,2,3,3};
		int i = nums.length>0 ? 1:0;
		for(int n:nums)
		{
			if(n > nums[i-1])
			{
				nums[i++] = n;
			}
		}
		System.out.println(i);
	}
}

/**
 * Using 2 pointers.
 *
 * Time Complexity: O(N)
 *
 * Space Complexity: O(1)
 *
 * N = Length of input array.
 */

/*
 * class Solution 
 * {
 *  public int removeDuplicates(int[] nums) 
 *  {
 *   if (nums == null)
 * 		{
 * 			 throw new IllegalArgumentException("Input is invalid"); 
 * 		}
 * 
 * int len = nums.length; 
 * if (len <= 1) 
 * {
 *   return len; 
 * }
 * 
 * int insertPos = 0;
 * for (int i = 1; i < len; i++) 
 * {
 *  if (nums[i] != nums[insertPos]) 
 *  {
 *   nums[++insertPos] = nums[i]; 
 *  }
 * }
 * 
 * 	return insertPos + 1;
 * 	}
 * }
 */