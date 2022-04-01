package PrepBytes.Fundamentals;

import java.util.Scanner;

public class ChanceGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while (cases-- > 0) {
			int p = sc.nextInt();
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int min = Math.min(s1, s2);
			int max = Math.max(s1, s2);
			int op = 0;
			if ((max - min) >= 2 && (max <= p || max > p)) {
				if (max <= p) {
					System.out.println(p - max);
				} else if (max > p) {
					System.out.println("0");
				}
			} else {
				while ((max - min) <= 2 && (max <= p || max > p)) {
					op++;
					max++;
				}
				System.out.println(op - 1);
			}
		}
	}

}
