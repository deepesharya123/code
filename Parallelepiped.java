import java.util.Scanner;

public class Parallelepiped {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		long a=in.nextLong();
		long b=in.nextLong();
		long c=in.nextLong();
		
		long x= (a*b)/c;
		x=(long)Math.sqrt(x);
		long y= (a*c)/b;
		y=(long)Math.sqrt(y);
		long z= (b*c)/a;
		z=(long)Math.sqrt(z);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		long ans = 4*(x+y+z);
		System.out.println(ans);
		
		
	}
	
}
