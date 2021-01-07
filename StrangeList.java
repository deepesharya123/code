StrangeList
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
			
			int t=in.nextInt();
			while(t>0) {
				t--;
				int n = in.nextInt();
				int x = in.nextInt();
				
				int[] tt =new int[31];
				tt[0]=1;
				for(int i=1;i<31;i++) {
					tt[i]=tt[i-1]*x;
//					System.out.println(tt[i]);
				}
				long s=0;
				int[] ar = new int[n];
				int[] d = new int[n];
				int i;
				int r = -1;
				for(i=0;i<n;i++) {
					r=-1;
					ar[i]=in.nextInt();
					s+=ar[i];
						int j=0;
						for(j=0;j<31;j++) {
							if((tt[j]!=0&&ar[i]%tt[j]==0&&ar[i]/tt[j]>0)) {
								r=j;
							}
						}
					d[i]=r;
				}
				int ans = d[0],ind=0;	
				for(i=0;i<n;i++) {
					if(d[i]<ans) {
//						System.out.println(d[i]+" "+ans);
						ind=i;
						ans=d[i];
					}
				}
				ans=d[ind];
				int can= ans;
//				ans--;
				s=s+(s*ans);
				for(i=0;i<ind;i++)
					s+=ar[i];
				
				
				
				
				System.out.println(s);
				
				
				
			
			}
			
			
			
			
			
			
			
		}
		
	}