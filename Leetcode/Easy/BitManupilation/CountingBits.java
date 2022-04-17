package Leetcode.Easy.BitManupilation;

public class CountingBits {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(countBits(n));
	}

	private static int[] countBits(int n) {
		int arr[] = new int [n+1];
        for(int i=0; i<=n; i++)
        {
            arr[i] = countSetBit(i);
        }
        System.out.println(arr);
        return arr;
	}

	private static int countSetBit(int num) {
		int count = 0;
        while(num>0)
        {
            count = count+(num&1);
            num=num>>1;
        }
        return count;
	}
}
