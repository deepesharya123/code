import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class Copypaste {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] ar =new int[n];
			
			int j;
			for(j=0;j<n;j++) {
				ar[j]= in.nextInt();
			}
			
			Arrays.sort(ar);
			int s = ar[0];
//			int s2 =ar[1];
			long sum = 0;
			for(j=1;j<n;j++) {
				int dif =k-ar[j];
				int add = dif/s;
				sum+=add;
				
			}
			System.out.println(sum);
			
			
		}
		
		
		
		
	}
}
