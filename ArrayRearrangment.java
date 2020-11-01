
import java.util.*;
//import java.io.*;
//import java.lang.reflect.Array;
public class ArrayRearrangment{

	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		
		int t = in.nextInt();
//		int i;
		while(t>0) {
			t--;
			int n = in.nextInt();
			int k = in.nextInt();
			int[] ar= new int[n];
			int[] br= new int[n];
			
			for(int i=0;i<n;i++) {
				ar[i]=in.nextInt();
			}
			for(int i=0;i<n;i++) {
				br[i]=in.nextInt();
			}
			
			Arrays.sort(ar);
			Arrays.sort(br);
			int a = ar[0];
			int b = ar[n-1];
			int c = br[0];
			int d = br[n-1];
			
			int j;
			boolean yes = true;
			for(j=0;j<n;j++) {
				if(ar[j]+br[n-1-j]>k) {
					yes=false;
					break;
				}
			}
			
			if(yes)
				System.out.println("YES");
			else
				System.out.println("NO");
			
//			if((a+d<=k)&&b+c<=k) {
//				System.out.println("YES");
//			}else {
//				System.out.println("NO");
//			}
			
			
			
			
		}
		
	}
	
}