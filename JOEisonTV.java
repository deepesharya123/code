import java.util.Scanner;

public class JOEisonTV {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		double s=0;
		while(n>0) {
			double cn=n;
			double add = 1/cn;
			s+=add;
			n--;
			
			
		}
//		s=(double)5/(double)3;
		System.out.println(s);
	}
	
}
