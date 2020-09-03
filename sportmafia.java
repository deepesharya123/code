import java.util.Scanner;

public class SportMafia {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		long n =in.nextLong();
		long k =in.nextLong();
		long b = 0;
		long cn= 0;
		long tc= 0;
		boolean run=true;
//		if(k!=0) {
			while(run) {
				long comp = tc*(tc+1);
				comp/=2;
				long dif = comp-k;
				if(dif==n-b) {
					System.out.println(dif);
					run=false;
				}
//				else if() {
//					
//				}
				else {
					b++;
					tc++;
				}
			}
//		else {
//			long ans = n*(n+1);
//			ans/=2;
//			System.out.println(ans);
//		}
	}
}
