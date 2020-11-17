
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class SumofMedians
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
			int k = in.nextInt();
			Vector<Integer> v = new Vector<Integer>();
			int i;
			for(i=0;i<n*k;i++) {
				int nu = in.nextInt();
				v.add(nu);
			}
			int h = n/2;
			long sum = 0;
			if(n%2==0) {
//				h--;
//				int r = n-h;
				int gap =0;
				int c = 0;
				for(int j=((n*k)-1);j>=0;j--) {
					if(gap==h) {
						int nu  =v.get(j);
						sum+=nu;
//						System.out.println(nu);
						gap=0;
						c++;
					}else {
						gap++;
					}
					
					if(c==k)
						break;
				}
				
				
			}else {
				int ch =h;
				h++;
//				int r = n-h;
				int gap =0;
				int c = 0;
				for(int j=((n*k)-1);j>=0;j--) {
					if(gap==ch) {
						int nu  =v.get(j);
						sum+=nu;
//						System.out.println(nu);
						gap=0;
						c++;
					}else {
						gap++;
					}
					
					if(c==k)
						break;
				}
				
			}
			
			
			
			System.out.println(sum);
			
			
			
			
		}
		
		
	}
	
}