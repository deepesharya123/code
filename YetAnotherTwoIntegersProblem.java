import java.util.Scanner;

public class MinimumProduct {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i;
		int t = in.nextInt();
		for(i=0;i<t;i++) {
			int  a =in.nextInt();
			int  b =in.nextInt();
			int  x =in.nextInt();
			int  y =in.nextInt();
			int  n =in.nextInt();
			int j,k;
			int ans1=0,ans2=0;
			if(x<y)
			{
				System.out.println(i);
				l1:{
				for(j=x;j<=a;j++) {
					for(k=y;k<=b;k++) {
						ans1=k*j;
						if(Math.abs(a-k+b-j)==n) {
							System.out.println(ans1);
							break l1;
						}
					}
				}
			}
			}
			else {
				
				l2:{
				for(j=y;j<=b;j++) {
					for(k=x;k<=a;k++) {
						ans2=k*j;
						if(Math.abs(a-k+b-j)==n) {
							System.out.println(ans2);
//							break l2;
						}
					}
				}
			}
			
			}
			
			
			
		
		}
		
		
	}
	
}
