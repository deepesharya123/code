//AlphabeticRemovals

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
			
	public static int solve(int[] ar, int s,int e,int x) {
		int ans = -1;
		if(s<=e) {
			int mid = s+((e-s)/2);
			if(ar[mid]==x)
				return mid;
			else if(ar[mid]<x)
				return solve(ar,mid+1,e,x);
			else
				return solve(ar,s,mid-1,x);
		}
		else
			return -1;
	}
	

	public static void main(String[] args){
		FastReader in=new FastReader();

		int n = in.nextInt();
		int k = in.nextInt();
		int i = 0;
		String s = in.nextLine();
		char[] cc = s.toCharArray();
		String cs = "";
		cs+=s;
		int[] con = new int[26];
		
		for(i=0;i<n;i++) {
			char c = s.charAt(i);
			int ind = (int) (c-97);
//			System.out.println(ind);
			con[ind]++;
		}
		int fon[] = new int[26];
		
		for(i=0;i<26;i++) {
			int nu = con[i];
			if(nu<=k) {
				con[i]=0;
				k-=nu;
				fon[i]=nu;
			}else {
				int dif = Math.abs(nu-k);
				con[i]=dif;
				fon[i]=k;
				k=0;
			}
			
			if(k<=0)
				break;
		}

		String ans = "";  
		for(i=0;i<n;i++) {
			int j = s.charAt(i);
			j-=97;
			if(con[j]>0) {
				if(fon[j]==0) {
					System.out.print(s.charAt(i));
					con[j]--;
				}else {
					fon[j]--;
				}
			}
			
		}
		System.out.println(ans);
		
	}
}
		