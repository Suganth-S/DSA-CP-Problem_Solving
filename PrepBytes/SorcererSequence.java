package PrepBytes;

import java.util.Scanner;

public class SorcererSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
		    long n = sc.nextLong();
		    System.out.print(n+" ");
		    while(n>=1)
		    {
		    	
		     if(n==1) {
		    		break;
		    	}
		      if(n%2==0)
		      {
		    	  n=(int)Math.sqrt(n);
		      }
		      else if(n%2!=0){
		    	  double num=0;
		    	  num=Math.sqrt(n);
		    	  n = (int) Math.pow(num, 3);
		      }
		      System.out.print(n+" ");
		    }
		}
		
	}

}
