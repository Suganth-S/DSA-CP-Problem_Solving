package marchstarter2;

import java.util.Scanner;

public class BalancedReversals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while (cases-- > 0) {
			int N = sc.nextInt();
			String A = sc.next();
			char[] arr = A.toCharArray();
			StringBuilder sb = new StringBuilder();
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i] == '0') {
					count++;
				}
			}
			for (int i = 0; i < count; i++) {
				sb.append("0");
			}
			for (int i = count; i < N; i++) {
				sb.append("1");
			}
			System.out.println(sb);
			
			// or
			
			/**
			 * int N = sc.nextInt();
			String A = sc.next();
			char[] arr = A.toCharArray();
			Arrays.sort(arr);
			System.out.println(arr);
			 */
		}

	}

}
