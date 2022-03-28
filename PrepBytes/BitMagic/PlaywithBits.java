package PrepBytes.BitMagic;

import java.util.Arrays;
import java.util.Scanner;

public class PlaywithBits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int l = sc.nextInt();
	int r = sc.nextInt();
	int total=0;
	for(int i=l; i<=r;i++)
	{
		int n=i;
		int count0=0;
		while(n>0)
		{
			if((n&1) == 0)
			{
				count0++;
			}
			n=n>>1;
		}
		if(count0==1)
			total++;
	}
	System.out.println(total);
	}
}

//Naive solution

//import java.util.*;
//import java.io.*;
//
//public class Main {
//  public static void main(String args[]) throws IOException  {
//	Scanner sc = new Scanner(System.in);
//	int l = sc.nextInt();
//	int r = sc.nextInt();
//	int total=0;
//	for(int i=l; i<=r;i++)
//	{
//		String str= bitConversion(i);
//		int len = str.length();
//		char arr[]= str.toCharArray();
//		int count0 = 0;
//		Arrays.sort(arr);
//		for(int j=0; j<len;j++)
//		{
//			if(arr[j]=='0')
//			{
//				count0++;
//				if(count0>1)
//				{
//					count0=0;
//					break;
//				}
//			}
//			if((j==len-1) && arr[j]!='0' && count0==1)
//				total++;
//		}
//	}
//	System.out.println(total);
//}
//
//	private static String bitConversion(int n) {
//		String str="";
//		while(n>0)
//		{
//			int rem = n%2;
//			str = Integer.toString(rem)+str;
//			n=n/2;
//		}
//		return str;
//	}
//}