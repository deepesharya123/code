//24Game

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
		if(n<4) {
			System.out.println("NO");
		}else {
			if(n%2==0) {
				int dif = n-4;
				int one = dif/2;
				int cn = n;
				boolean run = true;
				System.out.println("YES");
				while(cn>4) {				
					int a = cn;
					int b = cn-1;
					System.out.println(a+" - "+b+" = "+1);
					cn-=2;
				}
				one++;
				System.out.println(4+" * "+3+" = "+12);
				while(one!=0) {
					System.out.println(12+" * "+1+" = "+12);	
					one--;
				}
				System.out.println(12+" * "+2+" = "+24);
				
			}else {
				System.out.println("YES");
				System.out.println(5+" * "+4+" = "+20);
				System.out.println(3+" + "+2+" = "+5);
				System.out.println(5+" - "+1+" = "+4);
				int cn = n;
				while(cn>5) {
					int a = cn;
					int b = cn-1;
					System.out.println(a+" - "+b+" = "+1);
					cn-=2;
				}
				int div = n-5;
				div/=2;
				while(div>0) {
					System.out.println(20+" * "+1+" = "+20);
					div--;
				}
				System.out.println(20+" + "+4+" = "+24);
			}
		}
		
		
//7
//3
//2 5 4
//8
//1 1 1 1 1 1 1 1
//6
//1 2 3 4 5 6
//6
//1 1 2 1 2 2
//1
//1000000000
//5
//1 2 2 1 1
//3
//1 1 1
		
	}
}