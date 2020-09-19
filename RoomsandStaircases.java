import java.util.Scanner;

public class RoomsandStaircases {

	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		int i;
		for(i=0;i<n;i++) {
			int m = in.nextInt();
			in.nextLine();
			String s = in.nextLine();
			
			int lo=s.lastIndexOf('1');
			int fo=-1;
			int j;
			for(j=0;j<m;j++) {
				if(s.charAt(j)=='1') {
					fo=j;
					break;
				}
			}
			
			if(lo==-1) {
				System.out.println(m);
			}else {
				if(fo<m/2) {
						fo=m-1-fo;
				}
				int max = Math.max(fo, lo);
				max++;
				System.out.println(2*max);
			}
			
			
		}
		
		
	}
	
}
