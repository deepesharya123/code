import java.util.*;

public class YellowCards {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int k1= in.nextInt();
		int k2= in.nextInt();
		int n = in.nextInt();
		
		int min = 0,max=0;
		int cn =n;
		int ca1 = a1*(k1-1);
		int ca2 = a2*(k2-1);
		cn=cn-ca1-ca2;
		if(cn<0) cn=0;
		int res1 = (Math.min(a1+a2, cn));
		if(Math.min(k1, k2)==k1) {
			cn=n;
			max = n/k1;
			if(max>=a1){
				int minus = a1*k1;
				cn-=minus;
				max=a1;
				int addthis = cn/k2;
				
				max+=addthis;
			}
		}else{
			cn=n;
			max = n/k2;
			if(max>=a2){
				int minus = a2*k2;
				cn-=minus;
				max=a2;
				int addthis = cn/k1;
				
				max+=addthis;
			}
		}
		System.out.println(res1+" "+max);
		
		
		
		
		
	}
	
}
