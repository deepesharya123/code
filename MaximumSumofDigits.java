//MaximumSumofDigits

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

		long n = in.nextLong();
		long cn =n;
		int con = 0;
		long nn = 0;
		long res = 0;
		while(cn>0){
			con++;
			cn/=10;
		}
		while(con>1) {
			nn*=10;
			nn+=9;
			con--;
		}
		long dif = n-nn;
		while(dif>0) {
			long rem = dif%10;
			res+=rem;
			dif/=10;
		}
		while(nn>0) {
			long rem = nn%10;
			res+=rem;
			nn/=10;	
		}
		System.out.println(res);
		
		
	}
		
}