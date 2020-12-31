import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class Games
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
			
			String s = in.nextLine();
			int w = 0;
			int i = 0;
			while(s.contains("01")||s.contains("10"))
			for(i=0;i<s.length();i++) {
				if(i+1<s.length()&&s.charAt(i)!=s.charAt(i+1)) {
					char[] c = s.toCharArray();
					c[i]=' ';
					c[i+1]=c[i];
					s=String.valueOf(c);
					s=s.replaceAll(" ", "");
					w++;
					i=0;
				}
			}
			
			if(w%2!=0)
				System.out.println("DA");
			else
				System.out.println("NET");
			
			
			
			
		}
		
					
	}
	
}