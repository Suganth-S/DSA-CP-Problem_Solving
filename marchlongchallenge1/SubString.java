package marchlongchallenge1;

import java.util.Scanner;

public class SubString {
	
	static boolean allCharactersSame(String s)
	{
	    int n = s.length();
	    for (int i = 1; i < n; i++)
	        if (s.charAt(i) != s.charAt(0))
	            return false;
	         
	    return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	      String str = sc.next();
	      int len = str.length();
	      int subLen = len/2;
	      int count=0;
    	  int low = 0;
    	  int mid = subLen;
    	  int flag=0;
    	  if(allCharactersSame(str))
    	  {
    		System.out.println("-1");
    	  }
    	  else
    	  {
    		  if(len%2==0)
    		  {
    			  subLen = len/2;
    		  }else {
    			  subLen+=1;
    		  }
	       for(int i=0; i<subLen; i++)
	       {
	    	  if(str.charAt(low) == str.charAt(mid)) {
	    		  count+=1;
	    		  low++;
	    		  mid++;
	    	  }else if(str.charAt(low)!= str.charAt(mid))
	    	  {
	    		  mid++;
	    		  flag=0;
	    	  }
	       }
	       System.out.println(len-(count*2));
    	  }
		}
	}

}
