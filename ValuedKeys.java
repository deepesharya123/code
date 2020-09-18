import java.util.Scanner;

public class ValuedKeys {

	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		
		String x  = in.nextLine();
		String z = in.nextLine();
		
		
		int l = x.length();
		String s= "";
		
		for(int i=0;i<l;i++) {
			char a = x.charAt(i);
			char b = z.charAt(i);
			
			if(a<b) {
				s=null;
				break;
			}else {
				if(a>b) {
					s=s.replaceAll(s, s+b);
				}else {
					s=s.replaceAll(s, s+a);
				}
			}
		
		}
		
		if(s==null) {
			System.out.println("-1");
		}else {
			System.out.println(s);
		}
		
		
		
	}
	
}
