package Leetcode.sorting;

import java.util.Arrays;

public class SumOfFour {

	public static void main(String[] args) {
		int num = 4009;
		int len = String.valueOf(num).length();
        int arr1[] = new int[len];
        int num1=0;
        int num2=0;
        for(int i=0; i<len;i++)
        {
                arr1[i] = num%10;
                num=num/10;
        }
        Arrays.sort(arr1);
        if(arr1[0]!=0)
        {
           num1 = arr1[0]*10+arr1[2]; 
        }else{
            num1 = arr1[0]+arr1[2];
        }
        if(arr1[1]!=0)
        {
           num2 = arr1[1]*10+arr1[3]; 
        }else{
            num2 = arr1[1]+arr1[3];
        }
        
        System.out.println(num1+num2);
	}

}
