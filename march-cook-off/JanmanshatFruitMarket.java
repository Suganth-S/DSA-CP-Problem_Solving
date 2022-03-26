import java.util.Scanner;

public class JanmanshatFruitMarket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0)
		{
			int X = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int min1=0;
			int min2=0;
			int greater = 0;
			//greater ele
			if(A>=B && A>=C)
			{
				greater = A;
			}else if(B>=A && B>=C)
			{
				greater = B;
			}else {
				greater = C;
			}
			//finding first min ele
			if(A<=B && A<=C)
			{
				min1 = A;
			}else if(B<=A && B<=C)
			{
				min1 = B;
			}else {
				min1 = C;
			}
			//finding second min ele
			if(A!=greater && A!=min1)
			{
				min2 = A;
			}else if(B!=greater && B!=min1)
			{
				min2 = B;
			}else if(C!=greater && C!=min1) {
				min2 = C;
			}
			//output
			//if A==B==C
			if(A==B && B==C && C==A)
			{
				System.out.println(X*A);
			}else {
				if(min2==0)
				{
					if(A==min1)
					{
						min2=A;
					}else if(B==min1)
					{
						min2=B;
					}else if(C==min1) {
						min2=C;
					}
				}
				System.out.println((min1*(X-1))+min2);
			}
		}
	}
}
