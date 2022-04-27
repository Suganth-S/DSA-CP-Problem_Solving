package Leetcode.Easy.arrays;

public class BuildArrayFromPermutation {

	public static void main(String[] args) {
		int nums[]= new int[] {5,0,1,2,3,4};
		int mask = 1023;
		int op=0;
		for(int i = 0; i < nums.length; i++)
		{
			op = nums[nums[i]] & mask;
			nums[i] |= (op) << 10;
		}
		for(int i = 0; i < nums.length; i++)
			nums[i] = nums[i] >> 10;
		System.out.println(nums);
	}

}
