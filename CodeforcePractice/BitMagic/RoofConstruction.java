package CodeforcePratice.BitMagic;

import java.util.Scanner;

public class RoofConstruction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- >0)
		{
			int n = sc.nextInt();
			int a = 1;
			while (a * 2 < n)
				a *= 2;
			for (int i = 1; i < a; i++)
				System.out.print(i + " ");
			System.out.print(0 + " ");
			for (int i = a; i < n; i++)
				System.out.print(i + " ");
		}
	}

}
	