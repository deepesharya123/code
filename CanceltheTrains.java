CanceltheTrains

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class t
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
			int n  = in.nextInt();
			int m = in.nextInt();
			
			int[] h = new int[101];
			
			int[] a=  new int[n];
			int[] b=  new int[m];
			
			int i,c=0;
			for(i=0;i<n;i++) {
				a[i]=in.nextInt();
				h[a[i]]++;
			}
			for(i=0;i<m;i++) {
				b[i]=in.nextInt();
				h[b[i]]++;
			}
			for(i=0;i<=100;i++) {
				if(h[i]>1) {
					c++;
				}
			}
				System.out.println(c);
			
		}
		



        
	}
	
}