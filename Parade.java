//Parade

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
		
	public static void main(String[] args){
		FastReader in=new FastReader();
		
		int n = in.nextInt();
		int [][] mat =new int[n][2];
		int i=0;
		long uncs=0;
		int tl =0,tr=0;
		for(i=0;i<n;i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			mat[i][0]=l;
			mat[i][1]=r;
			tl+=l;
			tr+=r;
		}
		uncs = Math.abs(tl-tr);
		int ind = 0;
		int ctl = tl,ctr=tr;
		int cuncs=(int) uncs;
		int[] ne =new int[n];
		for(i=0;i<n;i++) {
			ctl=tl;
			ctr=tr;
			int l = mat[i][0];
			int r = mat[i][1];
			ctl -=l;
			ctr-=r;
			ctl+=r;
			ctr+=l;
			int dif = Math.abs(ctl-ctr);
			if(dif>cuncs) {
				cuncs = dif;
				ind=i+1;
			}
		}
		
		
		System.out.println(ind);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}