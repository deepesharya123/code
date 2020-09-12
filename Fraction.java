import java.util.Scanner;

public class Fraction {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n  = in.nextInt();
		int an = n/2;
		if(n%2==0)
		an--;
		int res= n-an;

//		System.out.println(an+" "+res);
		if(an%2!=0||res%2!=0)
		System.out.println(an+" "+res);
		else {
			an--;
			res++;
			System.out.println(an+" "+res);
		}
		
	}
	
}
