import java.util.Scanner;

public class Temporarilyunavailable {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t= in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int r = in.nextInt();
			
			int x = c+r;
			int y = c-r;
			
			int ds = Math.min(a, b);
			int dl = Math.max(a, b);
			int rs = Math.min(x, y);
			int rl = Math.max(x, y);

//			System.out.println(ds);
//			System.out.println(dl);
//			System.out.println(rs);
//			System.out.println(rl);
			
			if(ds<=rs) {
				int s = 0;
				s=rs-ds;
				if(dl<=rs) {
					s=dl-ds;
				}else {
					if(dl>=rl) {
						int w = rl-rs;
						int as = dl-ds;
						s=as-w;
					}else {
						int w = dl-ds;
						int q = dl-rs;
						s=w-q;
					}
				}
				System.out.println(s);
			}
			else if(ds>rs&&ds<=rl) {
				int s = 0;
				if(dl<=rl) {
					s=0;
				}else {
					s=dl-rl;
				}
				System.out.println(s);
			}
			else {
				System.out.println(dl-ds);
			}
			
			
		}
		
	}
	
}
