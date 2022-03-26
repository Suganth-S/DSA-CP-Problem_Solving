import java.util.Scanner;

public class JanmanshandGames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0)
		{
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			if(((X%2== 0)&&(Y%2==0)) || ((X%2!=0)&&(Y%2!=0)))
			{
				System.out.println("Janmansh");
			}else {
				System.out.println("Jay");
			}
		}

	}

}
