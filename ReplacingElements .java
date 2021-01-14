ReplacingElements 
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class t
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
			boolean ans = true;
			int i;
			int n = in.nextInt();
			int k = in.nextInt();
			int[] ar=new int[n];
			for(i=0;i<n;i++) {
				ar[i]=in.nextInt();
				if(ar[i]>k)
					ans=false;
			}
			if(ans==true) {
				System.out.println("YES");
			}else {
				for(i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i!=j){
							int s = ar[i]+ar[j];
							if(s<=k) {
								ans=true;
								i=n+22;
								break;
							}
						}
					}
				}
				
				System.out.println(ans?"YES":"NO");
			}
			
			
			
			
		}
		


	}
		
}