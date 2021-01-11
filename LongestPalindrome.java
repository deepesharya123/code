
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class LongestPalindrome
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
		int m = in.nextInt();
		String[] s = new String[n];
		Vector<Integer> p =new Vector<Integer>();
		int i;
		Vector<String> an =new Vector<String>();
		for(i=0;i<n;i++) {
			s[i]=in.nextLine();
			boolean yo = true;
			for(int j=0;j<s[i].length()/2;j++) {
				if(s[i].charAt(j)!=s[i].charAt(m-1-j)) {
					yo=false;
					break;
				}
			}
			if(yo) {
				p.add(i);
//				System.out.println(s[i]);
			}
		}
		
		String emp = "";
		int cn = n+1;
		while(cn>0) {
			cn--;
			emp+=" ";
		}
		int fir = 1;
		for(i=0;i<n;i++) {
			String ss = s[i];
			int j;
			if(p.contains(i)) {
				if(fir==1) {
				int si = an.size();
				si/=2;
				an.add(si, ss);
				fir=0;
				s[i]=emp;
				}
			}else {
				int jj = 0;
				boolean pa = true;
				for(j=0;j<n;j++) {
					jj=j;
					pa=true;
					for(int k = 0;k<m;k++) {
//						System.out.println(s[i]+" "+s[j]+" a");
						if(m-1-k>=0&&s[i].charAt(k)!=s[j].charAt(m-1-k)) {
							pa=false;
							break;
						}
					}
					if(pa)
						break;
				}
				if(pa) {
					an.add(0, s[i]);
					an.add(an.size(),s[jj]);
					s[i]=emp;
					s[jj]=emp;
				}
				
			}
			
			
		}
		
		while(an.contains(emp)) {
			an.remove(emp);
		}
		
//		System.out.println(an);
		int size = an.size();
		size*=m;
		System.out.println(size);
		for(i=0;i<an.size();i++)
			System.out.print(an.get(i)+"");
		
		
		
		
		
		

			
	}
		
}