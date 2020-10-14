import java.util.Scanner;

public class DataCenter {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int cn = n;
		int an =(int) Math.sqrt(cn);
		int sq = an*an;
		if(sq==cn) {
			System.out.println(4*an);
		}else {
			int i;
			int ans = 2*(n+1);
			
			for(i=1;i<n+1;i++) {
				if(cn%i==0) {
					int b = cn/i;
					if(b<i) {
						i=n+2;
						break;
					}else {
						int res = 2*(b+i);
						ans = Math.min(res, ans);
					}
				}
			}
			System.out.println(ans);
			
		}
		
	}
	
}
