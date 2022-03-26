import java.util.Scanner;

public class PlusleandMinunonArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	       int N = sc.nextInt();
            int arr[] = new int[N];
            int sum=0;
            for(int i=0; i<N; i++)
            {
                arr[i]=sc.nextInt();
            }
        	int max=0;
            for(int i=1; i<=N; i++)
            {
            	int low = i;
            	int high = N-i-1;
            	if(low<=high)
            	{
            		int arr2[]=swap(low,high,N,arr);
            		int op = calc(arr2,N);
            		if(max<op)
            		{
            			max=op;
            		}
            	}
            }
            System.out.println(max);
		}
	}
	
	static int calc (int arr2[], int ln)
	{
		int sum=0;
		 for(int i=0; i<ln; i++)
         {
             if(i==0)
             {
                 sum+=Math.abs(arr2[i]);
             }
             if((i%2!=0)&&i>=1){
                 sum-= Math.abs(arr2[i]);
             }else if((i%2==0)&&i>=1){
                 sum+= Math.abs(arr2[i]);
             }
         }
		 return sum;
	}
	
	static int[] swap(int i, int j, int len, int arr[]) {
		int temp[] = new int[len];
		for(int k=0; k<len; k++)
		{
			temp[k] = arr[i];
			arr[i] = arr[j];
			arr[j] = temp[k];
		}
		return temp;
	}
}

