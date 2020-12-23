
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class SerejaandSuffixes
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
		int[] ar= new int[n];
		int i;
		int m = in.nextInt();
		int[] con = new int[100002];
		int[] res = new  int[n+1];
		for(i=0;i<n;i++) {
			ar[n-1-i]=in.nextInt();	
		}
		for(i=0;i<n;i++) {
			if(con[ar[i]]==0) {
				con[ar[i]]++;
				res[i+1]=res[i]+1;
			}else {
				res[i+1]=res[i];
			}
		}
		
		for(i=0;i<m;i++) {
			int nu = in.nextInt();
			System.out.println(res[n+1-nu]);
		}
			
		
		
	}
	
}