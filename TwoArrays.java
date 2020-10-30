import java.util.Scanner;
import java.io.*;

public class TwoArrays {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int tar = in.nextInt();
			
			int j;
			int h=0;
			h = tar/2;
				
			int hc=0;
				
			for(j=0;j<n;j++) {
				int x = in.nextInt();
				if(tar%2==0&&x==h) {
					System.out.print(((hc++)%2)+" ");
				}
				else if(2*x<tar) {
					System.out.print(1+" ");
				}else {
					System.out.print(0+" ");
				}
			}
			
			System.out.println();
			
		}
		
		
		
	}
	
}
