package Leetcode.Easy.arrays;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int op=0;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid]>target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			op=mid;
		}
		if(nums[op]>target)
		{
			return op;
		}else {
		return op+1;
		}
	}
}


/**
 *  Note :  int mid = (low+high)/2;
			If low and high are very big, the program will dead from stack overflow.
			It could be avoided by:
			int mid = low + (high - low) / 2;
 */
*/