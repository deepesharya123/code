import java.util.Scanner;

public class Margariteandthebestpresent {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int i ;
		for(i=0;i<q;i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			if(l==r) {
				if(l%2!=0)
					System.out.println(-l);
				else
					System.out.println(r);
			}else {
				if(l%2!=0) {
					if(r%2==0) {
						int ans=r-l;
						ans/=2;
						ans++;
						System.out.println(ans);
					}else {
						int nr = r-1;
						int an=nr-l;
						an/=2;
						an++;
						int nu=-r;
						int ans=an+nu;
						System.out.println(ans);
					}
						
				}
				else {
					if(r%2!=0) {
						int ans=r-l;
						ans/=2;
						ans++;
						System.out.println(-ans);
					}else {
						int cr=r-1;
						int cnr=r;
						int as=cr-l;
						as/=2;
						as++;
						System.out.println(cnr-as);
					}
				}
			}
		}
		
	}
	
}
