//SumofCubes

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
		int t = in.nextInt();	
		while(t>0) {
			t--;
			long n = in.nextLong();
//			long cn = n*n*n;
//			System.out.println(n+" "+cn+" "+n*n*n);
			int i=0;
			boolean p = false;
			for(i=1;i<=10000;i++) {
				long cii =(long) i*i*i;
				long a = (long)(n-cii);
				long ca =(long) a;
				double po = 1;
				po/=3;
				long cuberoota = (long)Math.pow(ca, po);
//				System.out.println(cuberoota+" "+ca+" "+i);
				long ci = (long)i*i*i;
//				System.out.println(i+" "+cuberoota+" "+ca+" "+n+" "+ci);
				long fa= (long)( cuberoota*cuberoota*cuberoota);
				long fa1 = (long)( (cuberoota-1)*(cuberoota-1)*(cuberoota-1));
				long fa2 = (long)( (cuberoota+1)*(cuberoota+1)*(cuberoota+1));
				
//				System.out.println(fa+" "+ca+ " "+a+" "+i);
				if((fa1==ca||fa2==ca||fa==ca)&&a>0) {
					p=true;
//					System.out.println(fa+" "+ca+ " "+a+" "+cuberoota+" "+i);
					break;
				}
				
				if(cii>n) {
					break;
				}
			}
			System.out.println(p?"YES":"NO");
			
			
			
			
		}
		
		
		
	
		
	}
}