

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class ZuhairandStrings
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
		String s = in.nextLine();
		int i;
		int[] ar=new int[26];
		int ans= 0;
		for(i=0;i<n;i++) {
			boolean e = true;
			char c = s.charAt(i);
			int jj=0;
			for(int j = i;j<k+i;j++) {
				jj=j;
				if(j<s.length()) {
				if(s.charAt(j)!=c) {
					e=false;
					break;
				}
				}else {
					e=false;
					break;
				}
			}
			if(e) {
				ar[c-97]++;
				ans=Math.max(ar[c-97], ans);
				i=jj;
			}else
				i=jj-1;
			
		}
		
		System.out.println(ans);

//		12
//		2
//		aabbcbbcbbbb
	}
		
}