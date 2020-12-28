
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class CaptainFlintandaLongVoyage
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
			int n  = in.nextInt();
//			n--;
			String s= "";
			int add ,cn=  n;
			add = n%4;
			if(add>0)
				add=1;
			add+=cn/4;
			int cas = add;
			n = n-cas;
			while(n>0) {
				n--;
//				s="9"+s;
				System.out.print("9");
			}
			while(add>0) {
				add--;
//				s+="8";
				System.out.print("8");
			}
			
			System.out.println();
			
			
		}
		
		
		
		
		
			
	}
	
}