BalancedRemainders
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
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			int n = in.nextInt();
			int c0=0,c1=0,c2=0;
			int i;
			for(i=0;i<n;i++) {
				int nu = in.nextInt();
				if(nu%3==0) {
					c0++;
				}else if(nu%3==1) {
					c1++;
				}else {
					c2++;
				}
			}
//			System.out.println(c0+" "+c1+" "+c2);
			int[] c = new int[4];
			c[0]=c0;c[1]=c1;c[2]=c2;
			int m0,m1,m2,s;
			s= c0+c1+c2;
			s/=3;
			int ans =0;
			if(c1>s&&c2<s) {
				int req = s-c2,avl = c1-s;
				int mm = Math.min(req,avl);
				ans+=mm;
				c2+=mm;
				c1-=mm;		
			}
			if(c0>s&&c2<s) {
				int req = s-c2,avl = c0-s;
				int mm = Math.min(req,avl);
				ans+=mm;
				ans+=mm;
				c2+=mm;
				c0-=mm;	
			}
			if(c0>s&&c1<s) {
				int req = s-c1,avl = c0-s;
				int mm = Math.min(req,avl);
				ans+=mm;
				c1+=mm;
				c0-=mm;
			}
			if(c2>s&&c1<s) {
				int req = s-c1,avl = c2-s;
				int mm = Math.min(req,avl);
				ans+=mm;
				ans+=mm;
				c1+=mm;
				c2-=mm;	
			}if(c2>s&&c0<s) {
				int req = s-c0,avl = c2-s;
				int mm = Math.min(req,avl);
				ans+=mm;
				c0+=mm;
				c2-=mm;	
			}
			if(c1>s&&c0<s) {
				int req = s-c0,avl = c1-s;
				int mm = Math.min(req,avl);
				ans+=mm;
				ans+=mm;
				c0+=mm;
				c1-=mm;		
			}
			System.out.println(ans);
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}