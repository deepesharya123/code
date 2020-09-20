import java.util.Scanner;

public class DigitGame {

	public static void main(String args[]) {
		Scanner in=  new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n=in.nextInt();
			in.nextLine();
			String s = in.nextLine();
			String[] od = {"1","3","5","7","9"};
			
			if(n%2!=0) {				//odd
				int me2=1;
				for(int j=0;j<s.length();j=j+2) {
					char c =s.charAt(j);
					if(c=='1'||c=='3'||c=='5'||c=='7'||c=='9') {
						System.out.println(1); 		//raze wins
						me2=0;
						break;
					}
				}
				if(me2==1)
					System.out.println(2);
			}else {
				int me1=1;
				for(int j=1;j<s.length();j=j+2) {
					char c =s.charAt(j);
					if(c=='0'||c=='2'||c=='4'||c=='6'||c=='8') {
						System.out.println(2); 		//breach wins
						me1=0;
						break;
					}
				}
				if(me1==1) {
					System.out.println(1);
				}
			}
			
			
		
		}
		
	}
	
}
