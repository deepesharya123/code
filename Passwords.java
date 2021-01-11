
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class Passwords
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

		
		int n  = in.nextInt();
		int k = in.nextInt();
		String []s = new String[n];
		int i;
		for(i=0;i<n;i++)
			s[i]=in.nextLine();
		String ans = in.nextLine();
		
		int mn , mx,eqles=0,less=0;
		for(i=0;i<n;i++) {
			if(s[i].length()<ans.length()) {
				less++;
			}
			if(s[i].length()<=ans.length()) {
				eqles++;
			}
		}
		
//		System.out.println(eqles+" "+less);
		less++;
		int rm = 0;
		if(less%k==0) {
			rm=-1;
		}
		rm=rm+(less/k);
		mx = (5*rm)+(less);
		
		rm=0;
		if(eqles%k==0) {
			rm-=1;
		}
		rm=rm+(eqles/k);
		mn = (eqles)+(rm*5);
		System.out.println(mx+" "+mn);
		
		
		
		
		
		
		
		
		
		
		

			
	}
		
}