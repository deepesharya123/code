	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class Fence
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
			
		
		int n = in.nextInt();
		int k = in.nextInt();
		int i;
		int[] ar= new int[n];
		int ck = k,si = 0;
		long s = 0;
		long sm;
		int aa = -1;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			if(k>0) {
				s+=ar[i];
				aa=i;
				k--;
				
			}
		}
		sm=s;
//		System.out.println(aa);
		int ans = 1;
		for(i=ck;i<n;i++) {
			s-=ar[si];
			si++;
			s+=ar[i];
			if(sm>=s) {
//				System.out.println(sm+" "+s);
				sm=Math.min(sm, s);
				ans = si+1;
//				System.out.println(i+" "+sm);
			}
		}
		System.out.println(ans);
			
			
//		7
//		2 1 2 3 4 5 6 22			
			
//		7
//		2
//		1 2 6 1 1 7 1
			
	}
		
}


