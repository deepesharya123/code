//DoubleCola

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
		
		int i = 0;
		int x = in.nextInt();
		int po=0;
		long ans = 5;
		boolean run = true;
		long[] con = new long[100];
		while(run) {
			con[i]=ans;
			if(i>0)
				con[i]=con[i-1]+ans;
			i++;
//			System.out.println(con[i-1]);
			ans*=2;
			if(ans>2000000000)
				run =false;
		}
		i=0;
		run = true;
		while(run) {
			if(con[i]>=x) {
				po=i;
				run=false;
			}else
				i++;
		}
		long powe =(long) Math.pow(2, po);
		if(po==0)
			po=1;
		long sif = x-con[po-1];
		long csif = sif;
		sif/=powe;
		if(csif%powe!=0) sif++;
		if(x<=5) {
			sif= x;
		}
		
		if(sif==1) {
			System.out.println("Sheldon");
		}else if(sif==2) {
			System.out.println("Leonard");
		}else if(sif==3) {
			System.out.println("Penny");
		}else if(sif==4) {
			System.out.println("Rajesh");
		}else {
			System.out.println("Howard");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}