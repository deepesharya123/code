import java.util.Scanner;

public class MahmoudandLongestUncommonSubsequence {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		String t = in.nextLine();
		
		if(s.contentEquals(t))
			System.out.println(-1);
		else {
			System.out.println(Math.max(s.length(), t.length()));
		}
		
		
	}
	
}
