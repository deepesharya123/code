import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class Badge
{
	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new
			InputStreamReader(System.in));
		}
		String next(){
			while (st == null || !st.hasMoreElements()){
				try{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt(){
			return Integer.parseInt(next());
		}
		long nextLong(){
			return Long.parseLong(next());
		}
		double nextDouble(){
			return Double.parseDouble(next());
		}
		String nextLine()
		{
			String str = "";
			try{
				str = br.readLine();
			}
			catch (IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args){
		FastReader in=new FastReader();
			
		int n  = in.nextInt();
		int i;
		int[]ar = new int[n];
		for(i=0;i<n;i++) {
			ar[i]= in.nextInt();	
			ar[i]--;
		}
//		3
//		1 2 1
//		
		for(i=0;i<n;i++) {
			int nu = ar[i];
			int asn = -1;
			boolean run  = true;
			int[] b = new int[n];
			b[i]++;
			b[nu]++;
			while(run) {
				nu = ar[nu];
				b[nu]++;
				
				if(b[nu]>1) {
					asn = nu+1;
//					System.out.println(asn);
					run=false;
				}
			}
			
			System.out.print(asn+" ");
		}
				
		

	}
	
}