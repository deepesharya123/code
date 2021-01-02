import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public  class Pingpong

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
	
	public static void mul(int a,int b,int re) {
		if(b>0) {
			re+=a;
			b--;
			if(b==0)
				System.out.println(re);
			mul(a,b,re);
		}
	}

	
	public static void main(String[] args){
		FastReader in=new FastReader();
		
		 int  t = in.nextInt();
		 int i;
		 for(i=0;i<t;i++) {
			 int x = in.nextInt();
			 int y = in.nextInt();
			 System.out.println(x-1+" "+y);
			 
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
			
	}
	
}