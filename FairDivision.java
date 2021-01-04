

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class FairDivision
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
				int n = in.nextInt();
				int[] ar = new int[n];
				int o = 0,to=0;
				int s = 0,ss=0;
				for(int i =0;i<n;i++) {
					ar[i]=in.nextInt();
					s+=ar[i];
					if(i==0) {
						ss+=ar[i];
					}else {
						if(ss>0) {
							ss-=ar[i];
						}else
							ss+=ar[i];
					}
//					if(ar[i]==1) {
//						if(o==0) {
//							o++;
//						}else {
//							o--;
//						}
//					}else {
//						if(to==0) {
//							to+=2;
//						}else {
//							to-=2;
//						}
//					}
					if(ar[i]==1) {
						o++;
					}else
						to++;
				}
//
//				if(to==o)
//					System.out.println("YES");
//				else
////					System.out.println("NO");
				if(s%2==0) {
					if((o%2==0&&o!=0)||(o==0&&to%2==0))
						System.out.println("YES");
					else
						System.out.println("NO");
				}else
					System.out.println("NO");
				
//				System.out.println(ss==0?"YES":"NO");
				
				
			}
			
			
			
			
				
		}
		
	}