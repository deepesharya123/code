import java.util.Scanner;

public class ThreePilesofCandies {

	public static void main(String args[]) {
		Scanner in =  new Scanner(System.in);
		
		int t = in.nextInt();
		for(int i=0;i<t;i++) {
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();
			long ans = x+y+z;
			System.out.println(ans/2);
			
		}
		
		
		
	}
	
}
