import java.util.Scanner;

public class CoverPoints {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int a = 0;
		int i;
		for(i=0;i<t;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			if(a<x+y)
				a=x+y;
		}
		
		System.out.println(a);
		
		
	}
	
}
