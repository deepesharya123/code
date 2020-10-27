import java.util.*;
import java.io.*;

public class MarketingScheme{

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int  l =in.nextInt();
			int r = in.nextInt();
			int max = Math.max(l, r);
			int min = Math.min(l, r);
			int ha = max/2;
			if(min>ha)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}
		
		
	}
	
}
