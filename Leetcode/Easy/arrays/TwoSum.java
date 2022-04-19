package Leetcode.Easy.arrays;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = new int [] {3,3};
		int target = 6;
		int arr[] = new int[2];
        int n = nums.length;
        int i=0, low=1;
        for(i=0; i<n-1;)
        {
           if((nums[i]+nums[low])==target)
           {
        	   arr[0] = i;
        	   arr[1] = low;
        	   break;
           }
           if(low<n-1)
           {
        	   low=low+1;
           }
           else if(low==n-1)
           {
        	  i++;
        	  low=i+1;
           }
        }
        System.out.println(arr[0]+" "+arr[1]);
	}

}
