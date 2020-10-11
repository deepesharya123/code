import java.util.*;

public class Barrels {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int j;
		for(j=0;j<t;j++) {
			int n = in.nextInt();
			
			System.out.println(2);
			int min=1;
			for(int i=n-1;i>0;i--) {
				if(i>=n-2) {
					System.out.println(i+" "+n);
				}else {
					int and=n-min;
					System.out.println(i+" "+and);
					min++;
				}
			}
			
			
		}
		
		
	}

}