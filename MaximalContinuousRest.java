import java.util.Scanner;

public class MaximalContinuousRest {

	public static void main(String sgep[]) {
		
		Scanner in = new Scanner(System.in);
		
		int n  = in.nextInt();
		
		int s = 0,e=0,c=1;
		
		int i;
		int cs=-1;
		int[] a = new int[n];
		int[] res = new int[n];
		int ir = 0;
		int ars = 0;
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
			
			if(a[i]==1&&i==0) {
				c=1;
			}
			else if(i-1>=0&&(a[i]==0&&a[i-1]==1)) {
				res[ir]=c;
				ir++;
//				System.out.println("ASDFzxcvzxcv");
				c=1;
			}
			else if(a[i]==1&&a[i-1]==1){
				c++;
			}
			
			
			if(i==n-1&&c>0) {
				res[ir]=c;
				ir++;
			}
			ars+=a[i];
		}
		
//		for(i=0;i<ir;i++)
//			System.out.println(res[i]);
		
		
		int comp=-1,max=-1;
		if(a[0]==1&&a[n-1]==1) {
//			System.out.println(res[0]);
//			System.out.println(res[ir-1]);
			int sum = res[0]+res[ir-1];
			comp=sum;
		}
//			int max  = res[0];
			for(i=0;i<ir;i++) {
				if(max<res[i]) {
//					System.out.println(res[i]);
					max= res[i];
				}
			}
			if(ars<=0)
				max=0;
		
		
		
		int fin = Math.max(comp, max);
		System.out.println(fin);
		
	}
	
}
