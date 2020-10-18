import java.util.Scanner;

public class XORwice {

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int t = in .nextInt();
		
		int i;
		for(i=0;i<t;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			long ans= (~(a&b))&(a|b);
			
			System.out.println(ans);
			
			
		}
		
		
	}
	
}
