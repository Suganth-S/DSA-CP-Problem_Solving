package Leetcode.Easy.BitManupilation;

public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = new int []{1};
		int n = nums.length;
        int xor = nums[0];
        
        if(n==0)
        {
            System.out.println("0"); 
        }
        
        if(n==1)
        {
        	System.out.println(nums[0]);
        }
        
        for(int i=1; i<nums.length; i++)
        {
            xor=xor^nums[i];   
        }
        System.out.println(xor);
	}
}
