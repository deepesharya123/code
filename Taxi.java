//Taxi
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
		
		int n= in.nextInt();
		int i=0,one=0,two=0,three=0,four = 0;
		for(i=0;i<n;i++) {
			int nu = in.nextInt();
			if(nu==1)
				one++;
			else if(nu == 2)
				two++;
			else if(nu==3)
				three++;
			else 
				four++;
		}
		
//		4 will be alone 		4
//		3 can combine with one only			(3+1)
//		two can combine with two only		(2+2)
		int con = four;
		int min13 = Math.min(three, one);
		if(min13==one) {
			one=0;
			three-=min13;
			con+=min13;
			con+=three;
			int add = 0;
			if(two%2!=0)
				add++;
			add+=two/2;
			con+=add;
		}else {
//			three=5  one =10;
			con+=min13;
			three=0;
			one-=min13;
			int add = 0;
			int fourbyTwo = two/2;
			if(two%2!=0) {
				if(one>=2){
					fourbyTwo++;
					one-=2;
				}else if(one==1) {
					fourbyTwo++;
					one--;
				}
				else {
					fourbyTwo++;
				}
			}
//			System.out.println(one);
			int addOne = one/4;
			if(one%4!=0) {
				addOne++;
			}
//			System.out.println(addOne+" "+fourbyTwo);
			con+=addOne+fourbyTwo;
		}
		System.out.println(con);
	
		
		
	}
		
}