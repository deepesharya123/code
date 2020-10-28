import java.util.*;
import java.io.*;

public class EffectiveApproach {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		Vector<Integer> ar = new Vector<Integer>();
		int i;
		int[] index = new int[100001];
		for(i=0;i<n;i++) {
			int nu = in.nextInt();
			ar.add(nu);
			index[nu]=i;
		}
		
		int m = in.nextInt();
		long[] x = new long[100001];
		long[] y = new long[100001];
		int la = 0;
		for(i=0;i<m;i++) {
			int nu = in.nextInt();
			if(la<nu) 
				la=nu;
			long ind = index[nu];
			ind++;
			x[nu]=x[nu]+ind;
			y[nu]+=n-ind+1;
			
		}
		
		long sa = 0,sb =0;
		for(i=0;i<=la;i++) {
			sa+=x[i];
			sb+=y[i];
		}
		
		System.out.println(sa+" "+sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
