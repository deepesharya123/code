
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class RedandBlue
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
			int ma1 = 0,ma2=0;
			int s1 = 0,s2=0;
			
			int i;
			for(i=0;i<n;i++) {
				int nu = in.nextInt();
				s1+=nu;
				ma1 = Math.max(ma1, s1);
			}
			int m = in.nextInt();
			n=m;
			for(i=0;i<n;i++) {
				int nu = in.nextInt();
				s2+=nu;
				ma2 = Math.max(ma2, s2);
			}
			int res = ma1+ma2;
			System.out.println(res);
			
		
		}
		

		
		
		
		
		
		
			
	}
	
}