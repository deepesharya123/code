//LectureSleep
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
		int ar[] = new int[n];
		int t[] = new int[n];
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		int ans = 0;
		int[] preSumofT =new int[n];
		for(i=0;i<n;i++) {
			t[i]=in.nextInt();
			if(t[i]==1) {
				t[i]=0;
				ans+=ar[i];
				ar[i]=0;
			}else {
				t[i]=ar[i];
			}
			
			if(i==0)
				preSumofT[i]=ar[i];
			else
				preSumofT[i]+=ar[i]+preSumofT[i-1];
//			System.out.print(preSumofT[i]+" ");
		}
		int li = 0,ri = Math.min(k-1, n-1);
		int sum = 0;
		sum = preSumofT[k-1];
		
		for(i=k;i<n;i++) {
			if(i>=0) {
				int ss = 0;
//				if(i+<n)
					ss += preSumofT[i];
				int ll = i-k+1;
				if(ll-1>=0)
					ss-=preSumofT[ll-1];
				if(sum<ss)
					sum=ss;
			}
		}
//		System.out.println(sum);
		ans+=sum;
		System.out.println(ans);
		
		
		
		
		
	}
}
		