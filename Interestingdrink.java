import java.io.*;
import java.util.*;
import java.util.Collections;

public class Interestingdrink {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i;
		
		int[] ar = new int[n];
		int[] c = new int[100001];
		
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			c[ar[i]]++;
		}
		Arrays.sort(ar);
		int ps=1;
		
		for(i=1;i<=100000;i++) {
			c[i]=c[i]+c[i-1];
		}
		int m = in.nextInt();
		for(i=0;i<m;i++)	{
			int nu = in.nextInt();
			if(nu>=ar[n-1])
				System.out.println(n);
			else
			System.out.println(c[nu]);
		}
		
		
//		Vector<Integer> ar = new Vector<Integer>();
//		for(i=0;i<n;i++) {
//			int nu = in.nextInt();
//			ar.add(nu);
//		}
//		Collections.sort(ar);
//		int q = in.nextInt();
//		int[] b = new int[q];
//		int ln = ar.get(ar.size()-1);
//		for(i=0;i<q;i++) {
//			int nu =in.nextInt();
//			if(nu>=ln) {
//				System.out.println(ar.size());
//			}else if(nu<ar.get(0)){
//				System.out.println(0);
//			}else {
//				int c=0;
//				int j;
//				for(j=0;j<ar.size();j++) {
//					if(ar.get(j)<=nu)
//						c++;
//					else
//						break;
//				}
//				
//				
//				System.out.println(c);
//			}
//		}
//		
		
		
	}
	
	
}
