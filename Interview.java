import java.util.Scanner;

public class Interview {

	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);

		int n = in.nextInt();
		int[] ar = new int[n];
		int[] br = new int[n];
		int i;
		int aa=1,bb=1;
		int ans;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			if(i>=1) {
//				int c1=aa;
				aa=(aa|ar[i]);
			}else {
				aa=ar[i];
			}
		}
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			if(i>=1) {
//				int c1=aa;
				bb=(bb|ar[i]);
			}else {
				bb=ar[i];
			}
		}
		
		System.out.println(aa+bb);
//		for(i=0;i<n;i++)
//			br[i]=in.nextInt();
//		
		
		
		
	
	}
	
}
