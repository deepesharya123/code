	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;
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
				while (st == null  !st.hasMoreElements()){
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
				String str = ;
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
			if(b0) {
				re+=a;
			b--;
			if(b==0)
				System.out.println(re);
			mul(a,b,re);
		}
	}
		
		public void merge(int[] a,int l,int m,int u) {
			int n1 = m-l+1;
			int n2 = u-m;
			
			int[] left = new int[n1];
			int []right = new int[n2];
			
			int i,j,k;
			for(i=0;in1;i++)
				left[i]=a[i+l];
			for(i=0;in2;i++)
				right[i]=a[i+m+1];
			
			i=0;
			j=0;
			k=l;
			while(in1&&jn2) {
				if(left[i]right[j]) {
					a[k]=left[i];
					i++;
				}else {
					a[k]=right[j];
					j++;
				}
				k++;
			}
			
			while(in1) {
				a[k]=left[i];
				i++;
				k++;
			}
			
			while(jn2) {
				a[k]=right[j];
				k++;
				j++;
			}
			
			
			
			
		}
		
		public void sort(int[] a,int l,int u) {
			if(lu) {
				int m = l+u-1;
				m=2;
				
				sort(a,l,m);
				sort(a,m+1,u);
				
				merge(a,l,m,u);
			}
		}
		
	public static void main(String[] args){
		FastReader in=new FastReader();
		
		int t = in.nextInt();
		while(t0) {
			t--;
			int n =in.nextInt();
			int[] ar = new int[n+2];
			int i;
			long[] s = new long[n+2];
			for(i=0;in+2;i++) {
				ar[i]=in.nextInt();
			}
			t o = new t();
			o.sort(ar, 0, n+1);
			for(i=0;in+2;i++) {
				if(i==0)
					s[i]=ar[i];
				else
					s[i]+=s[i-1]+ar[i];
				System.out.print(s[i]+ );
			}
			System.out.println();
			long sum = s[n-1];
			if(ar[n]==sumsum==ar[n+1]) {
				for(i=0;in;i++) {
					System.out.print(ar[i]+ );
				}
				System.out.println();
			}else {
				sum = s[n];
				int myInd = -1;
				boolean poss = false;
				for(i=0;in+1;i++) {
					System.out.println(sum-ar[i]+ +s[n+1]);
					if(sum-ar[i]==ar[n+1]) {
						myInd = i;
						break;
					}
				}
				
				if(myInd0)
					System.out.println(-1);
				else {
					System.out.println();
					for(i=0;in+1;i++) {
						if(i!=myInd)
							System.out.print(ar[i]+ );
					}
					System.out.println();
				}
				
			}
			
			
		}
		
		
		
	}
		
}