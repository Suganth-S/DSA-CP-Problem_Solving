package starter31;

import java.util.Scanner;

public class AlternatingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	       int n = sc.nextInt();
	       String s = sc.next();
	       char arr[] = s.toCharArray();
	       int count1=0,count0=0;
	       
	       for(int i=0;i<n;i++)
	       {
	    	   if(arr[i]=='1')
	    		   count1++;
	    	   else
	    		   count0++;
	       }
	       if(n%2==0)
	       {
	    	   if(count1==count0)
	    		   System.out.println(n);
	    	   else if(count0==0 || count1==0)
	    		   System.out.println("1");
	       }
	       else {
	    	   if(((count1-1)==count0) || ((count0-1)==count1))
	    		   	System.out.println(n);
	    	   if(count1 > (count0+1))
	    	   		System.out.println(n-count0);
	    	   else if(count0 >(count1+1))
	    		   	System.out.println(n-count1);
	       }
		}
	}
}
