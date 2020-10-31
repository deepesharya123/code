import java.util.Scanner;

public class Football {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n =in.nextInt();
		int c1 = 0;
		int c2 = 0;
		in.nextLine();
		String s1= "";
		String s2 = " ";
		
		for(int i=0;i<n;i++) {
			String sc = in.nextLine();
			if(i==0) {
				s1 = sc;
				c1++;
			}else {
				if(sc.contentEquals(s1)) {
					c1++;
				}else {
					s2=sc;
					c2++;
				}
			}
			
		}
		
		if(c1>c2)
			System.out.println(s1);
		else
			System.out.println(s2);
		
		
	}
	
}
