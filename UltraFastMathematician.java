import java.util.Scanner;

public class UltraFastMathematician {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		String b = in.nextLine();
		char[] c = new char[a.length()];
		int i,n=a.length();
		for(i=0;i<n;i++) {
			if(a.charAt(i)==b.charAt(i)) {
				c[i]='0';
			}else
				c[i]='1';
		}
		String cs = new String(c);
		System.out.println(c);
		
	}
	
}
