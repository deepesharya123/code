
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class AvoidTrygub
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

			String s = in.nextLine();
			int tb=0;
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='b') {
					tb++;
				}
			}
			if(tb==0)
				System.out.println(s);
			else {
				String sb = "";
				while(tb!=0) {
					sb+="b";
					tb--;
				}
				s=s.replaceAll("b", "");
				s=sb+s;
				System.out.println(s);
			}
			
			
			


			
		}
		
		
		
		
		
	}
	
}