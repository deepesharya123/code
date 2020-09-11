import java.util.Scanner;

public class Game {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int l = in.nextInt();
//		 nk,ml
		int min = Math.min(k, l);
		while(n>0&&m>0) {
			n=n-min;
			m=m-min;
		}
//		System.out.println(n+" "+m);
		if(n>m)
			System.out.println("First");
		else if(n==m)
			System.out.println("Second");
		else
			System.out.println("Second");
		
		
		
	}
	
}
