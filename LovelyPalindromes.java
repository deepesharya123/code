import java.util.*;

public class LovelyPalindromes {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		char[] c = s.toCharArray();
		
		StringBuilder as= new StringBuilder(s);
		String sc = "";
//		sc=as.reverse().toString();
		for(int i=0;i<s.length();i++) {
			sc=sc+s.charAt(s.length()-1-i);
		}
		System.out.println(s+sc);
		
		
		
		
	}
	
}
