import java.util.*;

public class AvoidingZero {

	public static void main(String srgs[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] ar = new int[n];
			int j;
			long s=0;
			for(j=0;j<n;j++) {
				ar[j]=in.nextInt();
				s+=ar[j];
			}
			
			if(s==0) {
				System.out.println("NO");
//				System.out.println();
			}else {
				System.out.println("YES");
				Arrays.sort(ar);
				if(s<0) {
					for(j=0;j<n;j++)
						System.out.print(ar[j]+" ");
				}
				else {
					for(j=n-1;j>=0;j--) {
						System.out.print(ar[j]+" ");
					}
				}
				System.out.println();
				
		
			
			}
			
			
		}
		
	}
	
}
