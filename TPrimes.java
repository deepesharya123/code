import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class TPrimes
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
		
		int[] ar= new int[1000001];
		ar[0]=ar[1]=0;
		int i;
		for(i=2;i<1000001;i++) {
			ar[i]=1;
		}
		
		for(i=2;i<=1000;i++) {
			if(ar[i]==1) {
				for(int j=i*i;j<=1000000;j+=i) {
					ar[j]=0;
				}
			}
		}
//		for(i=1;i<101;i++)
//			if(ar[i]==1)
//			System.out.println(i);
		for(i=0;i<n;i++) {
			long nu = in.nextLong();
			long sqrt = (long) Math.sqrt(nu);
			if(sqrt*sqrt==nu) {
				if(ar[(int)sqrt]==1) {
					System.out.println("YES");
				}else
					System.out.println("NO");
			}else {
				System.out.println("NO");
			}
					
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}