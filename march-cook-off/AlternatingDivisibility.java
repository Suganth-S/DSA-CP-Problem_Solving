import java.util.Scanner;

public class AlternatingDivisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        for(int i=1; i<=N; i++)
	        {
	        	if(i==1)
	        	{
	        		arr[i] = 1;
	        	}else if(i==2)
	        	{
	        		arr[i] = N-1;
	        	}
	        	
	        	if(i%2==0 && i!=2)
	        	{
	        		arr[i] = arr[i-1]*arr[i-1];
	        	}
	        	if(i%2!=0 && i!=1)
	        	{
	        		arr[i] = arr[i-1] - 1;
	        	}
	        }
	        
	        for(int i=0; i<N; i++)
	        {
	        	System.out.print(arr[i]+" ");
	        }
		}

	}

}
