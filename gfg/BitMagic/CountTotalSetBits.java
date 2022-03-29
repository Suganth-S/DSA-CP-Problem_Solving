package gfg.BitMagic;

import java.util.Scanner;

public class CountTotalSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//Ignoring 0 as all the bits are unset. 
        n+=1;
        int count=0;
        //Counting set bits from 1 to n.
        for( int x=2 ; x/2<n ; x=x*2 )
        {
            //Total count of pairs of 0s and 1s.
            int quotient = n/x;
            //quotient gives the complete count of pairs of 1s.
            //Multiplying it with the (current power of 2)/2 will give
            //the count of 1s in the current bit.
            count += quotient * x / 2;
            
            int remainder = n%x;
            //If the count of pairs is odd then we add the remaining 1s 
            //which could not be grouped together. 
            if(remainder > x/2)
                count += remainder - x/2;
        }
		System.out.println(count);
    }
}


/**
 * Recursive Solution
 * explanation : https://www.youtube.com/watch?v=ZzZcFXDcbJw
 * 
 * int max2(int n){
 * 		int c=0;
 * 		while((1<<c)<=n)
 * 			c++;
 * 		return c-1;
 * 	}
 * 
 * int CountTotalSetBits(int n)
 * {
 *  	if(n==0)
 *  		return 0;
 *  	int x = max2(n);
 *  	int ans = x*(1<<(x-1)) + (n-(1<<x))+1+countSetBits(n-(1<<x));
 *  	return ans; 
 * }
 */