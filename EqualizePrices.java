import java.util.Scanner;

public class EqualizePrices {

	public static void main(String ags[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++){
			int n = in.nextInt();
			int k = in.nextInt();
			int[] ar =new int[n];
			int j=0;
			for(j=0;j<n;j++) {
				ar[j]=in.nextInt();
			}
			
			int s=ar[0];
			int l=ar[0];
			
			for(j=0;j<n;j++) {
				int nu  =ar[j];
				if(s>nu) s=nu;
				if(l<nu) l=nu;
			}
			
			int n1 = s+k;
			int n2 = l-k;
			if(n1>=n2)
				System.out.println(n1);
			else
				System.out.println(-1);
			
		}
		
		
		
	}
	
	
}
