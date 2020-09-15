import java.util.Scanner;

public class Letters {

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
//		for(int i=1;i<22;i++)
//			System.out.println(i);
		int n = in.nextInt();
		int m = in.nextInt();
		
		long[] a = new long[n];
		long[] b = new long[m];
		
		int i;
		for(i=0;i<n;i++)
			a[i]=in.nextLong();
		
		for(i=0;i<m;i++)
			b[i]=in.nextLong();
		
		for(i=1;i<n;i++) {
			a[i]=a[i]+a[i-1];
//			System.out.println(a[i]);
		}
		
		int j;
		if(n==1) {
			for(j=0;j<m;j++) {
//				for(i=0;i<n;i++) {
					System.out.println(1+" "+b[j]);
//				}
			}
				
		}
		
		int k=0;
		for(j=0;j<m;j++){
			long c1 = b[j];
			for(i=k;i<n-1;i++) {
//				if(i+1<n) {
					long c2 = a[i];
					long c3 =a[i+1];
					
					if(c1<=c2) {
						if(i>=1) {
							long res= c2-c1;
							System.out.println(i+1+" "+res);
//							k=i;
						}else {
							System.out.println(i+1+" "+c1);
						}
						
						break;
					}
					else if(c1>c2&&c1<=c3){
						long res= c1-c2;
						System.out.println(i+2+" "+res);
						k=i;
						break;
					}
					
				
//				}
				
			}
		}
		
		
		
	}
	
}
