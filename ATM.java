import java.util.Scanner;

public class ATM{

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int x = in.nextInt();
			int[] ar = new int[n];
			
			int j;
			for(j=0;j<n;j++)
				ar[j]=in.nextInt();
			
			int z=0;
			int k=0;
			int[] res = new int[n];
			int s=0;
			while(z<=n) {
				if(z<n) {
				for(j=0;j<n;j++) {
					if(ar[j]!=0) {
						if(ar[j]<=x) {
//							System.out.println(ar[j]+" "+j+" "+k);
							res[k]=j+1;
							ar[j]=0;
							k++;
							z++;
							s++;
						}else {
							ar[j]=ar[j]-x;
//							System.out.println();
//							res[k]=j+1;
//							k++;
						}
					}
				}
			}
				else {
//					System.out.println();
					int er=i+1;
					for(j=0;j<k;j++) {
						if(j==0)
						System.out.print("Case #"+er+": "+res[j]+" ");
						else
							System.out.print(res[j]+" ");
					}
//					System.out.println();
//					break;
					z++;
				}
				
			}
			
			
			
			
			
		}
		
		
//		Solution.java:3: error: class gk1 is public, should be declared in a file named gk1.java
//		public class gk1 {
//		       ^
		
	}
}
