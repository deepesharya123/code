import java.util.Scanner;

public class LCMProblem {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int l=in.nextInt();
			int r = in.nextInt();
			
			int d = 2*l;
			if(d<=r)
			System.out.println(l+" "+d);
			else {
				System.out.println(-1+" "+-1);
			}
			
		}
		
	}
	
}
