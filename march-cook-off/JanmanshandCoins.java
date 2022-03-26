import java.util.Scanner;

public class JanmanshandCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0)
		{
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			System.out.println(X*10+Y*5);
		}

	}

}
