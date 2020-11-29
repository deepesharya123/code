 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class PrisonBreak
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
			int m = in.nextInt();
			int r = in.nextInt();
			int c = in.nextInt();
			long s = 0;
//			long s1 = Math.abs(r-1)+Math.abs(c-1);
			long s1 = Math.abs(r-1)+Math.abs(c-1);
			long s2 = Math.abs(r-n)+Math.abs(c-1);
			long s3 = Math.abs(r-n)+Math.abs(c-m);
			long s4 = Math.abs(r-1)+Math.abs(c-m);
			
			s=Math.max(s1,Math.max(s2,Math.max(s3, s4)));

			System.out.println(s);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
	}
	
}