package CodeChef.Starters32;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Suganth S
 * Problem : https://www.codechef.com/START32D/problems/MAXTHEMIN
 *
 */
public class MaximizeTheMinimum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
			if(k>arr.length)
			{
				System.out.println(arr[n-1]);
			}
			else
			{
				System.out.println(arr[k]);
			}
		}
	}
}
