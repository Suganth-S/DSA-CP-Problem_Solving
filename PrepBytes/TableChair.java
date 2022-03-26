package PrepBytes;

import java.util.Scanner;

public class TableChair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0)
		{
			long n = sc.nextLong();
			long one = sc.nextLong();
			long two = sc.nextLong();
			long three = sc.nextLong();
			n%=4;
			if(n==0)
			{
				System.out.println("0");
			}else {
				if(n==1)
				{
					System.out.println(Math.min(three, Math.min(two+one, one+one+one)));
				}
				if(n==2)
				{
					System.out.println(Math.min(two, Math.min(one+one, three*2)));
				}
				if(n==3)
				{
					System.out.println(Math.min(one, Math.min(two+three, three*3)));
				}
			}
		}
	}

}
