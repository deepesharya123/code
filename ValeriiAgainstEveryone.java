import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class ValeriiAgainstEveryone
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
		while(t>0){
			t--;
			int n = in.nextInt();
			int i;
			Vector<Integer> v = new Vector<Integer>();

			for(i=0;i<n;i++) {
				int nu =in.nextInt();
				v.add(nu);
			}
			
			Collections.sort(v);
			int match  =0;
			for(i=1;i<n;i++) {
				int p = v.get(i-1);
				if(p==v.get(i)) {
					match = 1;
					break;
				}
			}
			if(match>0)
				System.out.println("YES");
			else
				System.out.println("NO");
			
					
		}
		
	}
	
}