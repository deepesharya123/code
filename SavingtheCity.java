import java.util.*;

public class SavingtheCity{

	public static void main(String artg[]) {
		Scanner in = new Scanner(System.in);
	
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			
			int a = in.nextInt();
			int b = in.nextInt();
			in.nextLine();
			
			String s = in.nextLine();
			int indo = s.indexOf('1');
			if(indo==-1) {
				System.out.println(0);
			}else {
				String sc = s.substring(indo, s.lastIndexOf('1')+1);
//				System.out.println(sc);
				int gap = 0;
				long p=0;
				int one = 0;
				for(int i=indo;i<s.length();i++) {
					
					if(s.charAt(i)=='1') {
						one=1;
					}else {
						if(s.charAt(i)=='0') {
							gap++;
						}
					}
					if(one==1&&gap>0&&s.charAt(i)=='1') {
						p+=Math.min(gap*b, a);
						one=1;
						gap=0;
					}
					
				}
				
				System.out.println(p+a);
				
				
			}
			
		}
		
		
	}
	
}
//
//5
//1
//011000101000110
