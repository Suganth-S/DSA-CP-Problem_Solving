package Leetcode.Easy.arrays;

import java.util.Arrays;

public class DistanceValueBetweenTwoArrays {

	public static void main(String[] args) {
		int arr1[] = new int[] {2,1,100,3};
		int arr2[]= new int[] {-5,-2,10,-3,7};
		int d = 2;
		int diff = 0;
        Arrays.sort(arr2);//-2,-3,-5,7,10
        int max=0;
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                diff= Math.abs(arr1[i] - arr2[j]);
                if(diff <= d)
                {
                	max = Math.max(max, diff);
                    System.out.println(max);
                }
            }
        }
        System.out.println("-1");
        }

}
