
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class FavoriteSequence
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
			int[] ar= new int[n];
			int[] a= new int[n];
			int e=0,odd=0;
			if(n%2==0) {
				odd=n-1;
			}else {
				odd=n-2;
			}
			int h = n/2;
			for(i=0;i<n;i++)
				ar[i]=in.nextInt();
			
			for(i=0;i<n;i++) {
//				if(&&odd>=0) {
					if(e<n&&i<=h) {
						a[e]=ar[i];
//						System.out.print(a[e]+" ");
						e+=2;
					}else {
						if(odd>=0) {
						a[odd]=ar[i];
						odd-=2;
						}
					}
//					System.out.println(i+" "+h);
//				}
			}
			
			
			for(i=0;i<n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
		
		
		
		
		
	}
	
}