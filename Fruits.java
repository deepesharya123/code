//Fruits

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

		int n = in.nextInt();
		int m = in.nextInt();
		int[] ar=  new int[n];
		int i = 0;
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		Vector<String> s  = new Vector<String>();
		int[] pr = new int[m];
		
		for(i=0;i<m;i++) {
			String ss =  in.next();
			if(s.indexOf(ss)==-1) 
				s.add(ss);
			pr[s.indexOf(ss)]++;
			
		}
//		System.out.println(s);
		Vector<Integer> v = new Vector<Integer>();
		for(i=0;i<s.size();i++) {
			v.add(pr[i]);
		}
//		System.out.println(v);
		
		Collections.sort(v);
		Arrays.sort(ar);
		int mn = 0,mx = 0;
		int st = 0;
		for(i=v.size()-1;i>=0;i--) {
			int nu = v.get(i);
			int ad = 0;
			while(nu>0) {
				ad+=ar[st];
//				st++;
				nu--;
			}
			st++;
//			System.out.println(ad+" for min");
			mn+=ad;
			
		}
		st = n-1;
		mx=0;
		for(i=v.size()-1;i>=0;i--) {
			int nu = v.get(i);
			int ad = 0;
			while(nu>0) {
				ad+=ar[st];
				nu--;
			}
//			System.out.println(ad+" ad");
			mx+=ad;
			st--;
		}
		System.out.println(mn+" "+mx);
		
		
		
		
		
		
			
		
		
		
		
		
	}
		
}