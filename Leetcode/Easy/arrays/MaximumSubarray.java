package Leetcode.Easy.arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int n = nums.length;
		int sum=0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++)
		{
			sum+=nums[i];
			max = Math.max(max, sum);
			
			if(sum<0)
				sum=0;
		}
		System.out.println(max);
	}
}
