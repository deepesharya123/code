import java.util.Scanner;

public class FindingSasuke{

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
			
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			
			int[] ar= new int[n];
			int j;
			
//			0  1 2 3 
//			0  1 2 3 4 5

			int h = n/2;
			
			for(j=0;j<n;j++) {
				ar[j]=in.nextInt();
				if(j<h) {
					ar[j]=-ar[j];
				}
			}
			
			for(j=n-1;j>=0;j--)
				System.out.print(ar[j]+" ");
			
			System.out.println();
			
			
			
		}
		
		
	}
	
}
