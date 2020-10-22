import java.util.Scanner;

public class MakeProductEqualOne {

	public static void main(String ararg[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		
		int i=0,z=0,nn =0,sm=-1;
		long c=0;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			if(ar[i]<0) {
				nn++;
			}else {
				if(ar[i]==0)
					z++;
				int dif = Math.abs(ar[i]-1);
				c+=dif;	
			}
		}
		long cn = 0;
		if(nn%2!=0) {
			if(z==0)
				cn+=2;
			
		}
		for(i=0;i<n;i++) {
			if(ar[i]<0) {
				int dif  = Math.abs(ar[i]+1);
				cn+=dif;
			}
		}
		
		c=c+cn;
		System.out.println(c);
		
		
		
	}
	
}
