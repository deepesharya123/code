
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class StrangePartition
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
			
			while(t>0){
				t--;
				int n = in.nextInt();
				int x = in.nextInt();
				int i,fo=n,md=1000000000;
				long s= 0;
				boolean all=true;
				int[] ar=new int[n];
				for(i=0;i<n;i++) {
					ar[i]=in.nextInt();
					s+=ar[i];
					if(ar[i]%x!=0&&all==true) {
						fo=i;
						all=false;
					}
				}
				
				for(i=0;i<fo;i++) {
					if(ar[i]%x==0)
					{
						int dd =ar[i];
						int con = 0;
						while(dd>0) {
							if(dd%x==0) {
								con++;
								dd/=x;
							}else {
								dd=0;
							}
						}
						
						md=Math.min(con, md);
					
					}
				}
				System.out.println(md);
				s=0;
				for(i=0;i<fo;i++) {
					long add = ar[i]*(md+1);
					s+=add;
				}
				System.out.println(s);
				
			}
	
			
			
			
			
			
			
			
			
			
				
		}
		
	}
	
	
	
	
	
	
	
	
	