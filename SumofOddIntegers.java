import java.util.Scanner;

public class SumofOddIntegers {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			if(n%2!=k%2) {
				System.out.println("NO");
			}else {
				long sk =(long) k*k;
//				System.out.println(sk);
				if(n>=sk)
					System.out.println("YES");
				else
					System.out.println("NO");
				
			}
			
			
			
			
		}
		
		
		
		
		
	}
	
}
