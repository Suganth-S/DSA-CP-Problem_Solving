package Leetcode.Easy.arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		int nums[] = new int[] {1,2,3,4};
		 int result[]= new int[nums.length];
		 int n = nums.length;
		 /**
		  * Consider above array as ex:
		  * 
		  * when i=0;
		  * 	result[0]=1;
		  * 	tmp=1;
		  * 
		  * i=1;
		  * 	result[1]=1
		  * 	tmp=2;
		  * 
		  * i=2;
		  * 	result[2]=2;
		  * 	tmp=6;
		  * 
		  * i=3;
		  * 	result[3] = 6;
		  * 	tmp = 24;
		  * 
		  * Therefore result = {1,2,6,24};
		  */
		 for(int i=0,tmp=1; i<n; i++)
		 {
			 result[i] = tmp;
			 tmp*=nums[i];
		 }
		 
		 /** 
		  * when i=3;
		  * 	result[3]=6*1=6;
		  * 	tmp=4;
		  * 
		  * i=1;
		  * 	result[2]=2*4=8;
		  * 	tmp=12;
		  * 
		  * i=2;
		  * 	result[1]=12*1;
		  * 	tmp=24;
		  * 
		  * i=3;
		  * 	result[0] = 24*1;
		  * 	tmp = 24;
		  * 
		  * Therefore result = {24,12,8,6};
		  */
		 
		 for(int i=n-1,tmp=1; i>0; i--)
		 {
			 result[i]*=tmp;
			 tmp*=nums[i];
		 }
	}
}
