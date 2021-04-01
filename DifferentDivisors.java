
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class DifferentDivisors
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
	
	public static void insertHeap(int[] ar,int n) {
		
		for(int i=1;i<n;i++) {
			int pa= i-1;
			pa/=2;
			int ari = ar[i];
			
			if(ar[pa]<ar[i]) {
				int temp = ar[pa];
				ar[pa]=ar[i];
				ar[i]=temp;
			}
			
//			while(pa>=0&&ar[pa]<ar[i]) {
//				ar[pa]=ari;
//				i=pa;
//				pa--;
//				pa/=2;
//			}
			
//			ar[i]=
		}
		
		
		
	}
		
	
	public static void print_arr(int[] ar,int n) {
		int i;
		for(i=0;i<n;i++)
			System.out.print(ar[i]+" ");
	}
	public static void main(String[] args){
		FastReader in=new FastReader();
		int n = 110001;
		int [] prime = new int[n];
		for(int i=0;i<n;i++)
			prime[i]=1;
		int i;
		for(i=2;i<=Math.sqrt(n);i++) {
			if(prime[i]==1) {
				for( int j = i*i;j<n;j+=i)
					prime[j]=0;
			}
		}
		int k = 0;
		int[] p = new int[n/2];
		for(i=2;i<n;i++)
			if(prime[i]==1) {
				p[k]=i;
				k++;
			}
		
		int t = in.nextInt();
		while(t>0)
		{
			t--;
			int c = -1,di=-1;
//			int ans ;
			int ii;
			int dif = in.nextInt();
			for(ii=0;ii<n/2;ii++) {
				if(c>=0&&p[ii]-p[c]>=dif) {
					di = ii;
					break;
				}
				if(p[ii]-1>=dif&&c<0) {
					c=ii;				
				}
				
			}
			long ans = 1*p[c]*p[di];
//			System.out.println(p[c]);
			System.out.println(ans);
		}
		

		
		
	}
		
}