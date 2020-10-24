import java.util.Scanner;

public class div$2$678 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
			
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			long s=0;
			for(int j=0;j<n;j++) {
				int nu = in.nextInt();
				s+=nu;
			}
			
			if(s==m)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
		
		
	}
	
}
	