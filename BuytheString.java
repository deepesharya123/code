

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class BuytheString
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
			int c0 = in.nextInt();
			int c1 = in.nextInt();
			int h = in.nextInt();
			String s = in.nextLine();
			int i;
			int z=0,o=0;
			for(i=0;i<n;i++) {
				if(s.charAt(i)=='0')
					z++;
				else
					o++;
			}
//			System.out.println(o+" "+z);
			long p1 = ((o*c1)+(z*c0));
			long p2 = ((o*h)+(n*c0));	// 1-->0
			long p3 = ((z*h)+(n*c1));
//			
//			System.out.println(p1);
//			System.out.println(p2);
//			System.out.println(p3);
			long res = (long) Math.min(p1, Math.min(p2, p3));
			System.out.println(res);			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}