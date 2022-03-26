package CodeforcePratice;

import java.util.Scanner;

public class IntegerMoves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int square = (num1*num1)+(num2*num2);
			double op = Math.sqrt(square);
			System.out.println((int)Math.round(op/10));
		}
	}
}
