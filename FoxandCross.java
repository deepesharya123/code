import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class FoxandCross

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
		String[]  s= new String[n];
		int i;
		for(i=0;i<n;i++)
			s[i]=in.nextLine();
		
		
		boolean posss = true;
		
		
		for(i=0;i<n;i++) {
			int j = 0;
			String cs = s[i];
			for(j=0;j<n;j++) {
				if(j-1>=0&&j+1<n&&i-1>=0&&i+1<n&&(s[i].charAt(j-1)=='#'&&s[i].charAt(j+1)=='#'&&s[i].charAt(j)=='#'&&s[i-1].charAt(j)=='#'&&s[i+1].charAt(j)=='#')) {
					
					char[] pre = s[i-1].toCharArray();
					pre[j]='.';
					s[i-1]=String.valueOf(pre);
					pre=s[i+1].toCharArray();
					pre[j]='.';
					s[i+1]=String.valueOf(pre);
					pre=s[i].toCharArray();
					pre[j+1]='.';
					pre[j-1]='.';
					pre[j]='.';
					s[i]=String.valueOf(pre);
				}
			}
		}
		
		posss=true;
		for(i=0;i<n;i++) {
			int j;
			for(j=0;j<n;j++) {
				if(s[i].charAt(j)=='#') {
					posss=false;
					break;
				}
			}
		}
		
		System.out.println(posss?"YES":"NO");
		
		
		
		
		
		
		
		
	}
	
}