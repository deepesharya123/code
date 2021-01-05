import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;
	
public  class LongJumps

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
			
			int t = in.nextInt();
			while(t>0) {
				t--;
				int n = in.nextInt();
				int i;
				int[] ar = new int[n];
				for(i=0;i<n;i++) {
					ar[i] = in.nextInt();
				}
				int max = 0;
				int[] res = new int[n];
				for(i=n-1;i>=0;i--) {
					if(ar[i]+i<n) {
						res[i]=ar[i]+res[ar[i]+i];
					}else {
						res[i]=ar[i];
					}
					
					max = Math.max(max,res[i]);
				}

				
				System.out.println(max);
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
				
		}
		
	}