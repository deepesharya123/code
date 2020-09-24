import java.util.Scanner;

public class NastyaIsReadingaBook {

	public static void main(String a[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i;

		int[] ar = new int[n];

		int[] aa= new int[n];
		
		for(i=0;i<n;i++) {
			aa[i]=in.nextInt();
			ar[i]=in.nextInt();
		}
		
		int k = in.nextInt();
		int c=0;
		for(i=0;i<n;i++) {
			if(k<=ar[i]) {
				c=i;
				break;
			}
		}
//		c++;
		System.out.println(n-c);
		
		
	}
	
}
