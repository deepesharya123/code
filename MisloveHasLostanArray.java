
import java.util.Scanner;

public class MisloveHasLostanArray {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int l = in.nextInt();
		int r = in.nextInt();
		
		long min = 0;
		long max=0;
		long mpnp=(long)Math.pow(2, l-1);
		long mxp = (long) Math.pow(2, r-1);
		
		for(int i=0;i<n;i++) {
			min+=mpnp;
			if(mpnp>=2)
				mpnp/=2;
		}
		
		mpnp=1;
		for(int i=0;i<n;i++) {
			max+=mpnp;
			if(i<r-1)
				mpnp*=2;
		}
		
		System.out.println(min+" "+max);
	}
	
}
