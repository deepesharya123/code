
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class SimilarPairs
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
			int[] ar=new int[n];
			int[] con = new int[101];
			Vector<Integer> odd = new Vector<Integer>();
			Vector<Integer> even = new Vector<Integer>();
			
			int o=0,e=0;
			for(i=0;i<n;i++) {
				ar[i]=in.nextInt();
				if(ar[i]%2==0) {
					e++;
					even.add(ar[i]);
				}
				else {
					o++;
					odd.add(ar[i]);
				}
				con[ar[i]]++;
			}
			if(e%2==0&&o%2==0) {
				System.out.println("YES");
			}else {
				boolean ye=  false;
				for(i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i!=j) {
							if(Math.abs(ar[i]-ar[j])==1) {
								ye=true;
								i=n+1;
								break;
							}
						}
					}
				}
				if(ye) {
					e--;
					o--;
				}
				if(e%2==0&&o%2==0)
					System.out.println("YES");
				else
					System.out.println("NO");
				
			}

			
			
			
			
			
			
		}
		


	}
		
}