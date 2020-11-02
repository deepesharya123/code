import java.util.Scanner;

public class KidsSeating{

	public static void main(String artg[]) {
		Scanner in = new Scanner(System.in);
	
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			
			int  n = in.nextInt();
			if(n==1) {
				System.out.println(4);	
			}else {
//				System.out.print(4+" ");
				
				int p = 4*n;
				p-=2;
				int c=1;
				while(c<=n) {
					System.out.print(p+" ");
					p-=2;
					c++;
				}
				System.out.println();
			}
			
			
			
		}
		
		
	}
	
}