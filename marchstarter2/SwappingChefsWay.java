package marchstarter2;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingChefsWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while (cases-- > 0) {
			int N = sc.nextInt();
			String S = sc.next();
			char arr[] = S.toCharArray();
			String temp = S;
			Arrays.sort(arr);
			char tempArr[] = S.toCharArray();
			int flag=0;
			
			for(int i=0; i<N; i++)
			{
				if(tempArr[i]!=arr[i])
				{
					char a = tempArr[i];
					tempArr[i] = tempArr[N-1-i];
					tempArr[N-1-i] = a;
				}
			}
			
			for(int i=0; i<N; i++)
			{
				if(tempArr[i]==arr[i])
				{
					flag=1;
				}else {
					flag=0;
					break;
				}
			}
			
			if(flag==1)
			{
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
