
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class MemoryandTrident
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

		String s = in.nextLine();
		int r=0,l=0,u=0,d=0;
		int i;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='U') {
				u++;
			}if(s.charAt(i)=='D') {
				d++;
			}if(s.charAt(i)=='L') {
				l++;
			}if(s.charAt(i)=='R') {
				r++;
			}
		}
		
		if(s.length()%2!=0)
			System.out.println(-1);
		else {
			int chan = 0;
			int hor = r+l;
			int ver = u+d;
			if(hor%2!=0) {
				hor++;
				if(l<r)
					l++;
				else
					r++;
				ver--;
				if(u<d)
					u++;
				else
					d++;
				chan++;
			}
			int ans = Math.abs(r-l)/2;
			int an = Math.abs(u-d)/2;
			chan+=ans+an;
			System.out.println(chan);
			
			
		}
		
		
		
		
		
		

	}
		
}