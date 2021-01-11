
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class BinaryPeriod
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
		while(t>0) {
			t--;
			String s = in.nextLine();
			int or = s.length();
			int i,j;
			for(i=1;i<s.length();i++) {
				boolean yo = true;
				for(j=0;j<s.length()-i;j++) {
					if(s.charAt((j)%(s.length()+1))!=s.charAt((j+i)%(s.length()+1))) {
						yo=false;
						break;
					}
				}
				if(yo) {
					or=i;
					break;
				}
			}
//			System.out.println(or);
			String ss = s.substring(0, or);
			
			if(or==1) {
				System.out.println(s);
			}else {
				String ans= "10",aa="";
				int cn = s.length();
				while(cn>0) {
					cn--;
					aa+=ans;
				}
				System.out.println(aa);
			}

			
		}
		
		
		
		
		
		

			
	}
		
}