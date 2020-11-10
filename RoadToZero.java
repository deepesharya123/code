import java.util.*;
import java.io.*;

public class RoadToZero {

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t>0) {
			t--;
			long x = in.nextLong();
			long y = in.nextLong();
			long a = in.nextLong();
			long b = in.nextLong();
			if(x<0&&y<0) {
				x=Math.abs(x);
				y=Math.abs(y);
			}
			long p=0;
			if(x>0&&y>0) {
				long p1 = (x+y)*a;
				long dif = Math.abs(x-y);
				long add = dif*a;
				long p2 =Math.min(x,y)*b;
				long res = add+p2;
				p=(long)Math.min(res, p1);
			}else {
//				-2 5
//				5 -2
				long min= Math.min(x, y);
				long max= Math.max(x, y);
				x=min;
				y=max;
//				System.out.println(x+" "+y);
				long p1 = (y-x)*a;
				long dif=Math.abs(Math.abs(x)-y);
				long add = dif*a;
				long p2 = Math.min(Math.abs(x), y)*b;
				long res=p2+add;
				p=(long)Math.min(res, p1);
			}
			
			System.out.println(p);
			
			
			
		}
		

	}
	
	
}
