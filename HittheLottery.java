 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class HittheLottery
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
		int c = 0;
		while(n>0) {
			
			if(n<5) {
				c+=n;
				n-=n;
			}else if(n==5) {
				c++;
				n-=5;
			}else if(n>5&&n<10){
				c++; //for five
				n-=5;
				c+=n;
				n=0;
			}else if(n==10) {
				c++;
				n-=10;
			}else if(n>10&&n<20) {
				c++;
				int nu = n%10;
				n-=10;
//				c+=n;
//				n=nu;
			}else if(n==20) {
				c++;
				n-=20;
			}else if(n>20&&n<100) {
				int nu = n%20;
				int r = n/20;
				c+=r;
				n=nu;
			}else if(n==100) {
				c++;
				n-=n;
			}else {
				int nu = n%100;
				int r = n/100;
				c+=r;
				n=nu;
			}
//			System.out.println(c);
		}
		System.out.println(c);
		
		
		
		
		
		
		
	}
	
}