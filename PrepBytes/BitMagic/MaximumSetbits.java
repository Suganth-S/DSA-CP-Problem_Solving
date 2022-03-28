package PrepBytes.BitMagic;

import java.util.Scanner;

//public class MaximumSetbits {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int cases = sc.nextInt();
//		while(cases-- > 0)
//		{
//			int l = sc.nextInt();
//			int r = sc.nextInt();
//			int i=1;
//			int pow = 1;
//			while(pow<=r)
//			{
//				i++;
//				pow=(int) Math.pow(2, i);
//			}
//			System.out.println((int) (Math.pow(2, i-1))-1);
//		}
//	}
//}


/**
 * Naive Solution
 * Passed 3 out of 7 cases
 * 
 */
  public class MaximumSetbits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0)
		{
		int l = sc.nextInt();
		int r = sc.nextInt();
		int max=0;
		int total=0;
		for(int i=l; i<=r;i++)
		{
			int n=i;
			int count1=0;
			while(n>0)
			{
				if((n&1) == 1)
				{
					count1++;
				}
				n=n>>1;
			}
			if(count1>total)
			{
				max=i;
				total=count1;
			}
		}
		System.out.println(max);
		}
		}
}
