package CodeChef.Starters32;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipSorting {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        for (int j=0;j<t;j++)
	        {
	            int n=sc.nextInt();
	            String str=sc.next();
	            char arr[]=str.toCharArray();
	            int x=0;
	            ArrayList<Integer> ar=new ArrayList<>();
	            for (int i=n-1;i>=0;i--)
	            {
	                if (arr[i]=='0')
	                {
	                    x=i+1;
	                    ar.add(x);
	                    for (int k=0;k<=i;k++)
	                    {
	                        if (arr[k]=='0')
	                        arr[k]='1';
	                        else
	                        arr[k]='0';
	                    }
	                }
	            }
	            System.out.println(ar.size());
	            for (int i=0;i<ar.size();i++)
	            {
	                System.out.println(1+" "+ar.get(i));
	            }
	           
	        }
	}
}
