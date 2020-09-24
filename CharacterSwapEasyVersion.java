import java.util.Scanner;

public class CharacterSwapEasyVersion {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			in.nextLine();
			String p = in.nextLine();
			String s = in.nextLine();
			
			if(s.contentEquals(p))
				System.out.println("Yes");
			else {
				int c=0;
				int a=-1,b=-1;
				
				int j;
				for(j=0;j<n;j++) {
					if(s.charAt(j)==p.charAt(j))
						c++;
					else {
						if(a==-1)
							a=j;
						else
							b=j;
					}
						
				}
				if(c<n-2) {
					System.out.println("No");
				}else {
					char c1 = s.charAt(a);
					char c2= ' ';
					if(b>=0)  c2 = s.charAt(b);
					char c3 = p.charAt(a);
					char c4 = ' ';
					if(b>=0) c4 = p.charAt(b);
//					System.out.println(a);
//					System.out.println(b);
					
					if(c1==c2&&c3==c4)
						System.out.println("Yes");
					else
						System.out.println("No");
					
				}
				
				
			}
			
			
			
			
		}
	
	}
	
}
