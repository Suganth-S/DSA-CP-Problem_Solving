package Leetcode.Easy.arrays;

public class RomanToInteger {

	public static void main(String[] args) {
		String str = "MCMXCIV";
		int sum = 0, num = 0,prev=0;
        //sum :to store latest sum
        //num :for getting each number
        //prev :to store last seen number
        for (int i=0;i<str.length();i++) {
            switch(str.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }//getting current digit
            if (i!=0&&prev<num) 
            	sum-=2*prev;
            //checking if the previous seen number is less than current number like in IV (1<5) 
            //I+V=6 but ans is 4 ie 6-2 ie (6-2*prev)
            //XL=40  => X+L=10+50=60  => (60 - 2* 10) 
            prev=num;
            sum+=num;
        }
		System.out.println(sum);
	}
}
