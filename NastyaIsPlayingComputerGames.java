import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class NastyaIsPlayingComputerGames

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
		int k = in.nextInt();
		int ans = (n+n);
		ans++;
		int res = Math.min(n+k-2, n+n-k-1);
		ans+=res;
		System.out.println(ans);
		
		
		
	}
	
}