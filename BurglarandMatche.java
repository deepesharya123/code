import java.util.Scanner;

public class BurglarandMatche {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[] a = new int[m];
		int[] b = new int[m];
		
		int i;
		for(i=0;i<m;i++){
			a[i]=in.nextInt();
			b[i]=in.nextInt();
		}
		long s=0;
		int cn=n;
		while(cn>0) {
			int l=-1,q=-1,ind=-1;
			int min=0;
			for(i=0;i<m;i++) {
				if(b[i]>l) {
					l=b[i];
					q=a[i];
					ind =i;
				}
				if(b[i]==-1)
					min++;
			}
			if(ind>=0) {
			b[ind]=-1;
			a[ind]=-1;
			min++;
			}
			if(q>=cn) {
				s+=cn*l;
				cn-=cn;
			}else {
				s+=q*l;
				cn-=q;
			}
			if(cn==0||min==m)
				break;
		
		
		}
		System.out.println(s);
		
	}
	
}
