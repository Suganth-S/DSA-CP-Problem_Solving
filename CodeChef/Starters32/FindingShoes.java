package CodeChef.Starters32;
/**
 * 
 * @author Suganth
 * Problem : https://www.codechef.com/START32D/problems/FINDSHOES
 *
 */
public class FindingShoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0)
		{
	         int n = sc.nextInt();
	         int m = sc.nextInt();
	         System.out.println((n<=m)? n: ((n*2)-m));
		}
	}

}
