import java.util.Scanner;

public class Berutaxi {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b=  in.nextInt();
		int i;
		int t = in.nextInt();
//		double k;
		double[] ar = new  double[t];
		for(i=0;i<t;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int  v = in.nextInt();

			double a1 = Math.pow(x-a, 2);
			double a2 = Math.pow(y-b, 2);
			double m = Math.pow(a1+a2, .5);
			m/=v;
			ar[i]=m;
		}
		double ans=ar[0];
		for(i=0;i<t;i++) {
//			System.out.println(ar[i]);
			if(ar[i]<ans)
				ans=ar[i];
		}
		
		System.out.format("%.8f",ans);
	}
	
}
