
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class PerfectNumber
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
		
//		int n = in.nextInt();
//		int s = 0;
//		int cn = n;
//		while(cn>0) {
//			int r = cn%10;
//			s+=r;
//			cn/=10;
//		}
//		
//		int cs = s;
//		int rem = cs%10;
//		rem = 10-rem;
//		n*=10;
//		n+=rem;
//		System.out.println(n);
		
		int[] ar = new int[10031];
		int i = 19;
		int con = 1;
		for(i=19;i<11000000;i++) {
			int s = 0,cn=i;
			while(cn>0) {
				int r =cn%10;
				s+=r;
				
				cn/=10;
			}
			if(s==10) {
				ar[con]=i;
				con++;
			}
		}
		int n = in.nextInt();
		System.out.println(ar[n]);
		
		
		
		
		
		
		
		
		
	}
	
}