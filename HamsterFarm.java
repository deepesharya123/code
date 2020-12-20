import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class HamsterFarm
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
			
		long n = in.nextLong();
		int k = in.nextInt();
		int i;
		long[] ar = new long[k];
		
		for(i=0;i<k;i++) {
			ar[i]=in.nextLong();
		}
		
		long amxitems = 0,type=0,nosbox = 0;
//		19 3
//		5 4 10

		for(i=0;i<k;i++) {
			long nu = ar[i];
			long ttype = i+1;
			long tnosbox = n/nu;
			long titems = tnosbox*nu;
			if(amxitems<titems) {
				type = ttype;
				amxitems = titems;
				nosbox = tnosbox;
			}
		}
		if(nosbox==0)
			type = 1;
		System.out.println(type+" "+nosbox);
		
		
		

		

	}
	
}