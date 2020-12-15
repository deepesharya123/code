
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class LastYearsSubstring
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
			int i;
			String s = in.nextLine();
			boolean poss =false;
			char c0 = s.charAt(0);
			char c1 = s.charAt(1);
			char c2 = s.charAt(2);
			char c3 = s.charAt(3);
			char lc0 = s.charAt(n-1);
			char lc1 = s.charAt(n-2);
			char lc2 = s.charAt(n-3);
			char lc3 = s.charAt(n-4);
			
			if((c0=='2'&&lc0=='0'&&lc1=='2'&&lc2=='0')||
					(c0=='2'&&c1=='0'&&lc0=='0'&&lc1=='2')||
					(c0=='2'&&c1=='0'&&c2=='2'&&lc0=='0')||
					(c0=='2'&&c1=='0'&&c2=='2'&&c3=='0')||
					(lc3=='2'&&lc2=='0'&&lc1=='2'&&lc0=='0')) {
				poss=true;
				
			}
				
			System.out.println(poss?"YES":"NO");
			
			
			
		}
		
		
		
		
		
	}
	
}