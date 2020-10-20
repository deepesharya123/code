import java.util.Scanner;

public class YetAnotherBookshelf {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
			
		int t= in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			in.nextLine();
			String s= in.nextLine();
			s=s.replaceAll(" ", "");
//			System.out.println(s);
			int so = s.indexOf('1');
			int lo = s.lastIndexOf('1');
			String cs = s.substring(so, lo+1);
//			System.out.println(cs);
			int pl = cs.length();
			cs=cs.replaceAll("1", "");
			System.out.println(cs.length());
//			System.out.println(cs);
			
			
		}
		
	
	}
	
}
