package CodeChef.Starters32;

import java.util.Scanner;

/**
 * 
 * @author Suganth S
 * Problem : https://www.codechef.com/START32D/submit/VOLCONTROL
 *
 */
public class VolumeControl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	       int x = sc.nextInt();
	       int y = sc.nextInt();
	       System.out.println((x>y) ? (x-y):(y-x));
		}
	}

}
