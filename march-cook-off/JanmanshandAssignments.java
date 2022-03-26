import java.util.Scanner;

public class JanmanshandAssignments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0)
		{
			int X = sc.nextInt();
			System.out.println((X+3>10) ? "No":"Yes");
		}

	}

}
