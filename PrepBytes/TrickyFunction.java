package PrepBytes;

import java.util.Scanner;

public class TrickyFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int val=0;
		while(cases-- > 0)
		{
			int n = sc.nextInt();
			while(n!=0)
			{
				if(n%2==0)
				{
					n/=2;
				}
				else {
					val++;
					n=n-1;
				}
			}
			System.out.println(val);
		}
	}

}
