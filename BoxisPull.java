import java.util.Scanner;
import java.util.*;
public class BoxisPull{

	public static void main(String agr[]) {
		Scanner in = new Scanner(System.in);
		
		int t= in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			
			if(y1==y2) {
				int ans = Math.abs(x2-x1);
				System.out.println(ans);
			}else if(x1==x2) {
				int ans = Math.abs(y2-y1);
				System.out.println(ans);
			}
				else {
				int a1 = Math.abs(x2-x1);
				int a2 = Math.abs(y2-y1);
				
				System.out.println(a1+a2+2);
			}
			
		}
		
		
	}
	
}