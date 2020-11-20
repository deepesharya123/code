import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class FixYou
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
		
		
		int t =in.nextInt();
		while(t>0) {
			t--;
			int r = in.nextInt();
			int c = in.nextInt();
			int i,con=0;
			String[] s = new String[r];
			for(i=0;i<r;i++) {
				s[i]= in.nextLine();
				if(i==r-1) {
					int j;
					for(j=0;j<c-1;j++) {
						if(s[i].charAt(j)=='D') {
							con++;
						}
					}
				}else {
					char ch = s[i].charAt(c-1);
					if(ch=='R') {
						con++;
					}
				}
			}
			System.out.println(con);
			
			
			
			
		}
		
		
		
	}
	
}