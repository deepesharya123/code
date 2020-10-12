import java.util.Scanner;

public class MinimumProduct {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i;
		int t = in.nextInt();
		for(i=0;i<t;i++) {
			long  a =in.nextLong();
			long b =in.nextLong();
			long x =in.nextLong();
			long y =in.nextLong();
			long n =in.nextLong();
			long min = Math.min(a, b);
			long max = Math.max(a, b);
//			a=min;
//			b=max;
			long cn = n;
			long ca = a;
			long cb = b;
			long cx = x;
			long cy = y;
			
			long ans=0;
			if(a==min) {
				long dif = a-x;
				if(dif>=n) {
					a-=n;
					n=0;
				}else {
					long mh= dif;
					n-=dif;
					a=x;
					long difforb = b-y;
					if(difforb>=n) {
						b-=n;
						n=0;
					}else {
						long hm = difforb;
						b=y;
						n=0;
					}
				}
				
				ans = a*b;
			}else {
				long dif = b-y;
				if(dif>=n) {
					b-=n;
					n=0;
				}else {
					long mh= dif;
					n-=dif;
					b=y;
					long difforb = a-x;
					if(difforb>=n) {
						a-=n;
						n=0;
					}else {
						long hm = difforb;
						a=x;
						n=0;
					}
				}
				
				ans = a*b;
			
			}
			
			min = Math.min(x, y);
			max = Math.max(x, y);
			n=cn;
			a=ca;
			b=cb;
			x=cx;
			y=cy;
			long asn = 0;
			if(x==min) {
				long dif = a-x;
				if(dif>=n) {
					a-=n;
					n=0;
				}else {
					long mh= dif;
					n-=dif;
					a=x;
					long difforb = b-y;
					if(difforb>=n) {
						b-=n;
						n=0;
					}else {
						long hm = difforb;
						b=y;
						n=0;
					}
				}
				
				asn = a*b;
			}else {
				long dif = b-y;
				if(dif>=n) {
					b-=n;
					n=0;
				}else {
					long mh= dif;
					n-=dif;
					b=y;
					long difforb = a-x;
					if(difforb>=n) {
						a-=n;
						n=0;
					}else {
						long hm = difforb;
						a=x;
						n=0;
					}
				}
				
				asn= a*b;
			
			}
			
			long res = Math.min(asn, ans);
			System.out.println(res);
		
		}
		
		
	}
	
}
