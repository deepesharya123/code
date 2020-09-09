import java.util.Scanner;
public class AntonandLetters {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
//		System.out.println(s);
		int[] ar = new int[26];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int nu = c;
			if(nu>=97&&nu<=122) {
				nu=nu-97;
				ar[nu]++;
			}
				
		}
		int c=0;
		for(int i=0;i<26;i++)
			if(ar[i]!=0)
				c++;
		System.out.println(c);
		
	}
	
}
