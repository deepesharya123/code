import java.util.Scanner;

public class PalindromicSupersequence {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		String s1 = "";
		int i;
		for(i=0;i<s.length();i++) {
			
			s1=s1.replaceAll(s1, s1+s.charAt(s.length()-1-i));
		}
			
		System.out.println(s+s1);
		
	}
	
}
