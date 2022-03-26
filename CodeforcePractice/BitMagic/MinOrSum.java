package CodeforcePratice.BitMagic;

import java.util.Scanner;

public class MinOrSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int sum=0;
		while(cases-- > 0)
		{
			int N = sc.nextInt();
			while(N-- >0)
			{
				sum|=sc.nextInt();
			}
			System.out.println(sum);
			sum=0;
		}
	}

}
