package Leetcode.Easy.BitManupilation;

public class MissingNumber {

	public static void main(String[] args) {
		int nums[] = new int []{3,0,1};
		int n = nums.length;
        int sum=0;
        int xor=0;
        int data=0;
        
        for(int i=0; i<=n; i++)
        {
            sum+=i;
        }
        
        for(int i=0; i<n;i++)
        {
            xor +=nums[i];
        }
        System.out.println(Math.abs(sum-xor));
	}
}
