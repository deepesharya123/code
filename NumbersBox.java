import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class t
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

			int n=in.nextInt();
			int m=in.nextInt();
			int i,j;
			int neg=0,z=0;
			int sum=0;
			Vector<Integer> v = new Vector<Integer>();
			for(i=0;i<n;i++) {
				for(j=0;j<m;j++) {
					int nu = in.nextInt();
					v.add(Math.abs(nu));
					sum+=Math.abs(nu);
					if(nu<0) {
						neg++;
					}
					if(nu==0) {
						z++;
					}
				}
			}
//			System.out.println(v);
			if(neg%2!=0&&neg>0&&z==0) {
				Collections.sort(v);
				int ind = -1;
//				System.out.println(v.get(5));
//				System.out.println(v);
				int nu = v.get(0);
				sum=sum-nu-nu;
			}
			System.out.println(sum);
			
			
		}
		
		
	}
	
}