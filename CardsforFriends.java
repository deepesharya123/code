
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public  class CardsforFriends
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
	
	public static void mul(int a,int b,int re) {
		if(b>0) {
			re+=a;
			b--;
			if(b==0)
				System.out.println(re);
			mul(a,b,re);
		}
	}

	
	public static void main(String[] args){
		FastReader in=new FastReader();
		
		 int  t = in.nextInt();
//		 int i;
		while(t>0) {
			t--;
			int w = in.nextInt();
			int h = in.nextInt();
			int n = in.nextInt();
			long  con = 1 ;
			while((h%2==0||w%2==0)&&(h!=0&&w!=0)) {
				if(h%2==0) {
					h/=2;
					con*=2;
				}
				if(w%2==0) {
					w/=2;
					con*=2;
				}
				if(con>=n) {
					break;
				}
			}
//			System.out.println(con);
//			if(n==1)
//				System.out.println("YES");
//			else
			System.out.println(con>=n?"YES":"NO");
			
			
			
			
			
		}
		
		
		
		
			
	}
	
}