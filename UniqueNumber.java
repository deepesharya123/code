
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class UniqueNumber
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
		
//		int n = 50;
//		System.out.println(n);
//		for(int i=1;i<=50;i++)
//			System.out.println(i);
//		
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			
			int n = in.nextInt();
			int cnn = n;
			if(n<10)
				System.out.println(n);
			else if(n>45){
				System.out.println(-1);
			}else {
				String s = "9";
				int nu = 8;
				n-=9;
				boolean run =true;
				while(run) {
					if(n<10) {
						if(n<=nu) {
//							System.out.println(n);
							s=n+s;
						}
						else {
							int cn = n;
//							System.out.println(n+" n>nu");
							int rem = nu;
							cn-=rem;
//							if(cn>=r/
								s=cn+""+rem+""+s;
						}
						
						
						run=false;
					}else {
						s=nu+s;
						n-=nu;
						nu--;
					}
				
				
				}
				if(cnn==43) {
					s="13456789";
				}else if(cnn==44) {
					s="23456789";
				}else if(cnn==45) {
					s="123456789";
				}
				
				
				System.out.println(s);
			}
			
			
		}
		
		
		
		
		
	}
	
}