import java.util.Scanner;

public class CandiesDivision {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in) ;
		
		int t =  in .nextInt();
		int i ;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			
			if(n%k==0) {
				System.out.println(n);
			}else {
				int c= 0;
				int d = n/k;
				c=d*k;
				int r = n%k;
				if(r>k/2) {
					r=k/2;
				}
				c+=r;
				System.out.println(c);
			}
			
		}
		
	}
	
}
