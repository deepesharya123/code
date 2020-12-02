 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class MaximumControl(easy)
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
		
			int n = in.nextInt();
			
			int[] ar = new int[n+1];
			int c = 0;
			int i;
			for(i=0;i<n-1;i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				ar[a]++;
				ar[b]++;
			}
			
			for(i = 1;i<=n;i++) {
				if(ar[i]==1) {
					c++;
				}
			}
		


		
		System.out.println(c);
		

        
	}
	
}