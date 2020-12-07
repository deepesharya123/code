 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class BallsofSteel
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
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			int n = in.nextInt();
			int k = in.nextInt();
			int i,poss= 0;
			int[][] ar= new int[n][2];
			
			for(i=0;i<n;i++) {
				ar[i][0]=in.nextInt();
				ar[i][1]=in.nextInt();
			}
			long maxdis = -1;
			int j;
//			if there is any ball that can attract all the other balls then answer is 1 else -1
			poss=0;
			double dk = k;
			boolean c1 =false;
			for(i=0;i<n;i++) {
				int a = ar[i][0];
				int b = ar[i][1];
				int po = 0;
				boolean c2 = true;
				for(j=0;j<n;j++) {
					if(j!=i) {
						int c = ar[j][0];
						int d = ar[j][1];
						long ca = (long)Math.abs(c-a);
						long db = (long) Math.abs(d-b);
						long cadb = ca+db;
						double root = Math.sqrt(cadb);
						if(cadb>dk) {
							c2=false;
							break;
						}
					}
					
					
				}
				
				if(c2) {
					c1=true;
					break;
				}
				
			}
			if(c1)
				System.out.println(1);
			else
			System.out.println(-1);


			
		}
		
		
		
		
		
	}
	
}