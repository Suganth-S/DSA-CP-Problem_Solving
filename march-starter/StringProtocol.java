import java.util.Scanner;

public class StringProtocol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	     int N =sc.nextInt();
	     String S = sc.next();
	     
	     char arr[] = S.toCharArray();
	     int count=0;
	     int copy=0;
	     for(int i=1; i<N; i++)
	        {
	            if(arr[i] != arr[i-1])
	            {
	                 copy+=1;
	                 count=0;
	            }
	            if(arr[i] == arr[i-1] && count<1)
	            {
	                copy+=1;
	             count+=1;
	            }
	        }
	     if(arr[N-1] != arr[N-2] )
         {
         	copy+=1;
         }
	             System.out.println(copy);
		}

	}

}
