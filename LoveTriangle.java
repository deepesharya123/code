
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class LoveTriangle
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
		int i;
		int[] ar = new int[n];
		boolean yes = false;
		
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
//		5
//		2 4 5 1 3
// 		5 
//		2 3 4 5 1
		for(i=0;i<n;i++) {
			int a =ar[i];
			int b = ar[a-1];
			int c = ar[b-1];
			if(c-1==i) {
				yes=true;
				break;
			}
//			if()
		}
		
		
		System.out.println(yes?"YES":"NO");
		


		

	}
	
}