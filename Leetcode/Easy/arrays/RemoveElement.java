package Leetcode.Easy.arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int nums[] = new int[] {0,1,2,2,3,0,4,2};
		int target= 2;
		int pos = 0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]!=target)
			{
				nums[pos++] = nums[i];
			}
		}
		System.out.println(pos);
	}
}
