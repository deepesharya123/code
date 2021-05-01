//NezzarandLuckyNumber

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
		
		public void merge(int[] a,int l,int m,int u) {
			int n1 = m-l+1;
			int n2 = u-m;
			
			int[] left = new int[n1];
			int []right = new int[n2];
			
			int i,j,k;
			for(i=0;i<n1;i++)
				left[i]=a[i+l];
			for(i=0;i<n2;i++)
				right[i]=a[i+m+1];
			
			i=0;
			j=0;
			k=l;
			while(i<n1&&j<n2) {
				if(left[i]<right[j]) {
					a[k]=left[i];
					i++;
				}else {
					a[k]=right[j];
					j++;
				}
				k++;
			}
			
			while(i<n1) {
				a[k]=left[i];
				i++;
				k++;
			}
			
			while(j<n2) {
				a[k]=right[j];
				k++;
				j++;
			}
			
			
			
			
		}
		
		public void sort(int[] a,int l,int u) {
			if(l<u) {
				int m = l+u-1;
				m/=2;
				
				sort(a,l,m);
				sort(a,m+1,u);
				
				merge(a,l,m,u);
			}
		}
	public static void goof(int[][] mat,int i,int divkaro) {
		if(i<111) {
			int pre = 0;
			if(i%divkaro==0) {
				pre=1;
			}
			int ci = i;
			while(ci>0) {
				int rem = ci%10;
				ci/=10;
				if(ci==divkaro||rem==divkaro) {
					pre=1;
				}
			}
			if(pre>0)
			mat[i][divkaro]=pre;
			if(mat[i][divkaro]==1) {
				int j = i;
				while(j+divkaro<111) {
					mat[j+divkaro][divkaro]=1; 
					j+=divkaro;
				}
			}
			i++;
			goof(mat,i,divkaro);
		}
	}
	public static void main(String[] args){
		FastReader in=new FastReader();
		
		int[][] mat = new int[111][10];
		for(int i = 1;i<10;i++) {
			mat[i][i]=1;
			goof(mat,1,i);
		}
		
//		for(int i = 1;i<111;i++) {
//			System.out.print(i+" ");
//			for(int j = 1;j<10;j++) {
//				System.out.print(mat[i][j]+" ");
//			}
//			System.out.println();
//		}
//		for(int j = 1;j<10;j++) {
//			for(int i=1;i<101;i++) {
//				int pre = 0;
//				if(i%j==0) {
//					pre=1;
//				}
//				if(pre==0) {
//					int cn = i;
//					while(cn!=0) {
//						int rem = cn/10;
//						if(rem==j) {
//							pre=1;
//						}
//						if(cn%10==j) {
//							pre=1;
//						}
//						cn/=10;
//						
//					}
//				}
//				mat[i][j]=pre;
//			}
//		}
		int t = in.nextInt();
		while(t>0) {
			t--;
			int q = in.nextInt();
			int d = in.nextInt();
			int i= 0 ;
			for(i=0;i<q;i++) {
				int nu = in.nextInt();
//				1 2 5 
				if((nu>=d*10)) {
					System.out.println("YES");
				}else {
					if((mat[nu][d]>0)) 
						System.out.println("YES");
					else
						System.out.println("NO");
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}