import java.util.Scanner;

public class AryaandBran {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
	
		int n  =in.nextInt();
		int k = in.nextInt();
		
		int[] ar = new int[n];
		
		int i;
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		
		int ri = 0;
		int ans=0;
		int run=1;
		int sum=0;
		int cur=0;
		while(run==1&&ri<n) {
			int add =-1;
			cur+=ar[ri];
			add = Math.min(8, cur);
//			ri++;
			cur-=add;
			sum+=add;
			ans=ri+1;
			ri++;
			if(sum>=k) {
				run=0;
				break;
			}
			
			
		}
		
//		System.out.println(sum);
		
		if(sum>=k)
		System.out.println(ans);
		else
			System.out.println("-1");
		
		
		
	}
	
}