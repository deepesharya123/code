import java.util.Scanner;

public class BadUglyNumbers {

	public static void main(String args[]) {
		Scanner in = new  Scanner(System.in);
		int t = in.nextInt();
		
		int j;
		for(j=0;j<t;j++) {
			int n = in.nextInt();
			if(n==1)
				System.out.println(-1);
			else {
				int[] ar = new int[n];
				for(int i=0;i<n;i++) {
					if(i==0)
					System.out.print(2);
					else System.out.print(3);
				}
				System.out.println();
			}
		}
		
		
		
	}
}
