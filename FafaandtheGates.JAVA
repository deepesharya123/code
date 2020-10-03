import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FafaandtheGates {
	
	public static void main(String args[]) throws Exception {
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(is);
		int n =Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		int i,x=0,y=0,c=0;
		for(i=0;i<n;i++) {
			char ch = s.charAt(i);
			
			if(ch=='U') {
				y++;
				if(x==y) {
					if(i+1<n) {
						if(s.charAt(i+1)=='U')
							c++;
					}
				}
			}
			else {
				x++;
				if(x==y) {
					if(i+1<n) {
						if(s.charAt(i+1)=='R')
							c++;
					}
				}
			}
			
			
		}
		
		System.out.println(c);
		
		
		
		
	}
	
	
}
