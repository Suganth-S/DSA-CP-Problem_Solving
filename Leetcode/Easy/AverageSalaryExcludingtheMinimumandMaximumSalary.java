class Solution {
    public double average(int[] salary) {
        double sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int n:salary){
            sum+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        
        return (sum-min-max)/(salary.length-2);
    }
}