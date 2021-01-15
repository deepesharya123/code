NonCoprimePartition
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
		
		int n = in.nextInt();
		int s = n*(n+1);
		s/=2;
//		System.out.println(s);
		int nu = -1;
		int root =(int) Math.sqrt(s);
		root++;
//		System.out.println(root);
		for(int i=2;i<root+1;i++) {
			if(s%i==0) {
				nu=i;
				break;
			}
		}
		if(nu==-1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
			System.out.println(1+" "+nu);
			System.out.print(n-1+" ");
			for(int i = 1;i<n+1;i++) {
				if(i!=nu) {
					System.out.print(i+" ");
				}
			}
		}


	}
		
}