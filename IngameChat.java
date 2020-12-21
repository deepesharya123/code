 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class IngameChat
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
			int len = in.nextInt();	
			String s = in.nextLine();
			int c=0,v=0;
			for(int i=len-1;i>=0;i--) {
				if(s.charAt(i)==')') {
					c++;
				}else {
					break;
				}
			}
			v = len-c;
			System.out.println(c>v?"YES":"NO");
			
			
			
			
			
		}
			

	}
	
}