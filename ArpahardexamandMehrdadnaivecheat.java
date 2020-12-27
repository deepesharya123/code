
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class ArpahardexamandMehrdadnaivecheat
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
			if(n==0)
				System.out.println(1);
			else if((n-2)%4==0) {
				System.out.println(4);
			}else if((n+1)%4==0) {
				System.out.println(2);
			}else if((n%2==0)) {
				System.out.println(6);
			}else
				System.out.println(8);
		
		
		
		
		
		
		
		
		
			
	}
	
}