import java.util.Scanner;

public class SubsetMex {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			int n = in.nextInt();
			int[] ar =new int[n];
			int j;
			int[] c = new int[101];
			String s= "";
			for(j=0;j<n;j++) {
				ar[j]=in.nextInt();
				c[ar[j]]++;
			}
			
			for(j=0;j<101;j++) {
				int nu =c[j];
				if(nu>=2) {
					nu=2;
					s=s+nu;
				}else {
					s=s+nu;
				}
			}
//			System.out.println(s);
			int indz = s.indexOf('0');
			int indo = s.indexOf('1');
			
			
			if(indz<indo||indo==-1) {
				System.out.println(2*indz);
			}else {
				int a1 = 2*indz;
				int a2 = indz+indo;
				System.out.println(Math.min(a1,a2));
			}
				
			
			
		}
		
		
		
	}
	
}
