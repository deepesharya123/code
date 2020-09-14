import java.util.Scanner;

public class ConstructtheString {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t =  in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int  n = in.nextInt();
			int  a = in.nextInt();
			int  b = in.nextInt();
//			a  =Math.min(b, a);
			char[] c = new char[26];
			int j;
			for(j=0;j<26;j++) {
				int nu = 97+j;
				c[j]=(char)nu;	
			}
			
			if(a==b) {
				int cn = n;
				int k=0;
				String s = "";
				
				while(cn!=0){
					char ch = c[k%26];
					k++;
					s=s.replaceAll(s, s+ch);
					cn--;
				}
				
				System.out.println(s);
				
			}else {
				int cn = n;
				String s = "";
				int k = 0;
				
				while(cn!=0){
					char ch = c[k%26];
					k++;
					if(k>=b) k=0;
					s=s.replaceAll(s, s+ch);
					cn--;
				}
				
				System.out.println(s);
			}
			
			
		}
		
		
	}
	
}
