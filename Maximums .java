
import java.util.Scanner;

public class Maximums {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] b = new int[n];
		
		int i;
		for(i=0;i<n;i++) {
			b[i]=in.nextInt();
		}
		long max = 0;
		for(i=0;i<n;i++) {
			if(i==0) {
				System.out.print(b[0]+" ");
				max=Math.max(max, b[0]);
			}else {
				long nu = max+b[i];
				System.out.print(nu+" ");
				max=Math.max(max,nu );
			}
		}
		
		
		
		
	
	}
	
	
}
