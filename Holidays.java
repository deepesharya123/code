import java.util.Scanner;

public class Holidays {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		if(n<2) {
			System.out.println(0+" "+1);
		}
		else if(n<=5&&n>=2) {
			System.out.println(0+" "+2);
		}else if(n==6) {
			System.out.println(1+" "+2);
		}else {
			int res= n/7;
			res*=2;
			int res2 =res;
			if(n%7==1)
				res2++;
			if(n%7==6)
				res++;
			if(n%7>=2)
				res2+=2;
			System.out.println(res+" "+res2);
			
		}
		
	}
	
}
