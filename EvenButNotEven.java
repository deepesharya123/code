import java.util.Scanner;

public class EvenButNotEven {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t =in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			in.nextLine();
			String s = in.nextLine();
			
			int j=0,c=0;
			char []ch = new char[2];
			int f=-1;
			for(j=0;j<n;j++) {
				if(s.charAt(j)=='1'||s.charAt(j)=='3'||s.charAt(j)=='5'||s.charAt(j)=='7'||s.charAt(j)=='9') {
					c++;
					if(f==-1) {
					ch[0]=s.charAt(j);
						f=0;
					}else {
						ch[1]=s.charAt(j);
						break;
					}
				}
			}
			
			if(c>=2) {
				System.out.println(ch[0]+""+ch[1]);
			}else {
				System.out.println("-1");
			}
			
		}
		
	}
	
}
