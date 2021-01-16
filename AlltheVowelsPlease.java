import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class AlltheVowelsPlease	
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
		

		int k = in.nextInt();
		boolean ye = false;
		int i=5;
		int root =(int) Math.sqrt(k);
		root++;
		int ans=  -1;
		for(i=5;i<root+1;i++) {
			if(k%i==0) {
				int a = k/i;
				int b = k/a;
				if(a>=5&&b>=5) {
					ans=i;
					ye=true;
					i=k+1;
				}
			}
		}
		
		if(ye) {
			int nn = k/ans;
			nn=k/nn;
			int r = nn,col = k/ans;
//			System.out.println(r+" "+col);
			int j;
			String[] s = new String[r];
			String s1 = "aeiou";
			String s2 = "uaeio";
			String s3 = "ouaei";
			String s4 = "iouae";
			String s5 = "eioua";
			String cols ="",rowsl="";
			int leftcol = col-5,leftrow = r-5;
			while(leftcol!=0) {
				s1+="a";
				s2+="e";
				s3+="i";
				s4+="o";
				s5+="u";
				leftcol--;
			}
			s[0]=s1;
			s[1]=s2;
			s[2]=s3;
			s[3]=s4;
			s[4]=s5;
			for(i=0;i<r;i++) {
				if(i<5) {
					System.out.print(s[i]);
				}else {
					System.out.print(s[0]);
				}
			}
				
			
			
		}else {
			System.out.println(-1);
		}
		
		
		
		
		
		
		
		
		
		
		
		


	}
		
}