package marchlunchtime;

import java.util.Scanner;

public class SplitPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0)
		{
	      String str= sc.next();
	      int len = str.length();
	      int i=1;
	      int A=1;
	      int B=1;
	     
	     while(i<len)
	     {
	    	 if(A%2!=0)
	    		 A =Integer.parseInt(str.substring(0, i));
	         if(A%2==0)
	         {
	             B = Integer.parseInt(str.substring(i,len));
	             break;
	         }
	         i++;
	     }
	     if(A%2==0 && B%2==0)
	    	 	System.out.println("YES");
	     else if(A%2!=0 && B%2!=0)
	    	 System.out.println("YES");
	     else
	    	 System.out.println("NO");
		}
	}
}
