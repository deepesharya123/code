import java.util.Scanner;

public class LettersRearranging {

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		in.nextLine();
		int i;
		for(i=0;i<t;i++) {
			String s = in.nextLine();
			
			int[] ar = new int[26];
			int j;
			for(j=0;j<s.length();j++) {
				char c = s.charAt(j);
				int nu = c-97;
				ar[nu]++;
			}
			
			int c=0;
			for(j=0;j<26;j++)
				if(ar[j]!=0)
					c++;
			
			
			if(c==1) {
				System.out.println(-1);
			}else {
				for(j=0;j<26;j++) {
					int  nu = ar[j];
					while(nu>0) {
						char ch =(char) (97+j);
						System.out.print(ch);
						nu--;
					}
				}
				System.out.println();
			}
			
			
			
		}
		
		
	}
	
	
}
