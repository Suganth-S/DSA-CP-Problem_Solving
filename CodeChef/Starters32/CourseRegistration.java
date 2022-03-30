package CodeChef.Starters32;

import java.util.Scanner;
/**
 * 
 * @author Suganth
 * Problem : https://www.codechef.com/START32D/problems/COURSEREG
 *
 */
public class CourseRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	       int n = sc.nextInt();
	       int m = sc.nextInt();
	       int k = sc.nextInt();
	       
	       System.out.println(((m-k)>=n) ? "Yes": "No");
		}
	}

}
