package marchlongchallenge1;
import java.util.Arrays;
import java.util.Scanner;

public class Wordle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	       String S = sc.next();
	       String T = sc.next();
	       int len = S.length();
	       StringBuilder sbf = new StringBuilder();
	       char arrS[] = S.toCharArray();
	       char arrT[] = T.toCharArray();
	       char arrM[] = new char[len];
	       for(int i=0; i<arrS.length; i++)
	       {
	    	   if(arrS[i] == arrT[i])
	    	   {
	    		   arrM[i] = 'G';
	    	   }else {
	    		   arrM[i] = 'B';
	    	   }
	       }
	       sbf.append(arrM);
	       System.out.println(sbf);
		}
	}
}
