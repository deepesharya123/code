//IncreasingMatrix

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
//	import java.
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
		
		public static void merge(int[] a,int l,int m,int u) {
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
		
		public static void sort(int[] a,int l,int u) {
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
		int m = in.nextInt();
		int[][] mat = new int[n][m];
		int i = 0,j=0,z=0;
		int sum = 0;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++) {
				mat[i][j]=in.nextInt();
				if(mat[i][j]==0)	z++;
				sum+=mat[i][j];
			}
		
		boolean good =true;
		
		for(i=n-1;i>0;i--) {
			for(j=m-1;j>0;j--) {
				int cur = mat[i][j];
				if(cur==0) {
					int up = mat[i-1][j];
					int down = mat[i+1][j];
					int left = mat[i][j-1];
					int right = mat[i][j+1];
					int fitn = Math.min(right, down);
					fitn--;
					mat[i][j]=fitn;
					sum+=fitn;
				}	
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=1;j<m;j++) {
				if(mat[i][j]<=mat[i][j-1]) {
					good=false;
					i=n;
					break;
				}
			}
		}
		if(good) {
			for(j=0;j<m;j++) {
				for(i=1;i<n;i++) {
					if(mat[i][j]<=mat[i-1][j]) {
						good=false;
						j=m;
						break;
					}
				}
			}
		}
			
		if(good)
			System.out.println(sum);
		else
			System.out.println(-1);
		
		
		
		
		
		
		
	}
}