package gfg.BitMagic;

import java.util.Scanner;

public class TotalSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int num=n,i=1;
		while(n>0) {
			count = count+(n&1);
			n=n>>1;
			if(n==0)
			{
				n=num-i;
				i++;
			}
		}
		System.out.println(count);
	}

}
