
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class SubstringsSort
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
		Vector<String> s = new Vector<String>();
		int i;
		int ml = 0;
		for(i=0;i<n;i++) {
			String ss = in.nextLine();
			int ls = ss.length();
			ml=Math.max(ml, ss.length());
			int j = 0;
			for(j=0;j<s.size();j++) {
				if(s.get(j).length()>=ss.length()) {
					break;
				}
			}
			s.add(j,ss);
		}
//		int conbs = 0;
//		Vector<String> bg = new Vector<String>();
//		
//		for(i=0;i<n;i++) {
//			if(s.get(n-1-i).length()==ml){
//				conbs++;
//				bg.add(s.get(n-1-i));
//			}else
//				break;
//		}
		Vector<String> ans = new Vector<String>();
		boolean y = true;
		boolean string_of_equal_length_are_equal=true;
		for(i=1;i<n;i++) {
			String s1 = s.get(i-1);
			String s2 = s.get(i);
			if(s1.length()==s2.length()) {
				if(!s1.contains(s2)) {
					string_of_equal_length_are_equal=false;
					break;
				}
			}
		}
		
		if(string_of_equal_length_are_equal==false) {
			System.out.println("NO");
		}else {
			boolean g = true;
			for(i=1;i<n;i++) {
				String s1 = s.get(i-1);
				String s2 = s.get(i);
				if(s1.length()!=s2.length()) {
					if(!s2.contains(s1)) {
						g=false;
						break;
					}
				}
			}
			
			if(g==false)
				System.out.println("NO");
			else {
				System.out.println("YES");
				for(i=0;i<n;i++)
					System.out.println(s.get(i));
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}
		
}