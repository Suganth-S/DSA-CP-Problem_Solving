public class Solution {
    // you need to treat n as an unsigned value
//brian kerningham algo solutn
    public int hammingWeight(int n) {
        if(n==0)
            return 0;
        return 1+hammingWeight(n&(n-1));
    }
}