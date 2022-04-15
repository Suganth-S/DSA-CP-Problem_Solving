package Leetcode.Easy.BitManupilation;

public class FindTheDifference {

	public static void main(String[] args) {
		char c=0;
        String s = "abcd", t = "abcde";
        for(char cs : s.toCharArray())
        {
            c^=cs;
        }
        for(char ct : t.toCharArray())
        {
            c^=ct;
        }
        	System.out.println(c);
	}

}
