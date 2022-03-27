package PrepBytes;

import java.util.Scanner;

public class MinimumNumbersInJar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int res=0;
	    while(n>0)
	    {
	      res = res+(n&1);
	      n=n>>1;
	    }
	    System.out.println(res);
	}

}
