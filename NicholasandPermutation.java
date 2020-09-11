import java.util.Scanner;

public class NicholasandPermutation {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		int i;
		int[] ar= new int[n];
		int s=-1;
		int l=-1;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			if(ar[i]==1) s=i+1;
			if(ar[i]==n) l=i+1;
		}
		
		int min = Math.min(s, l);
		int max = Math.max(s, l);
//		int ans1=
		int cmin = 1;
		int ans1= max-cmin;
		int cmax = n;
		int ans2 = cmax-min;
		int res = Math.max(ans1, ans2);
		System.out.println(res);
		
	
	}
	
}
