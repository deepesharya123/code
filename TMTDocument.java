//TMTDocument

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
		
		int t=  in.nextInt();
		while(t>0) {
			t--;
		
			int n = in.nextInt();
			String s = in.nextLine();
			boolean yes = true;
			int m =0,rt=0,reqt = 0;
			String cs= s;
			cs=cs.replaceAll("T", "");
			int len = cs.length();
			int tl = n-len;
//			System.out.println(tl+" "+len);
			if(tl!=2*len)
				yes=false;
			for(int i=0;i<n;i++) {
				char c = s.charAt(i);
				if(c=='T') {
					rt++;
					int left = len - m;
					int poss = m+m+left;
					if(rt>poss) {
						yes=false;
						break;
					}
				}else {
					m++;
					if(rt<m) {
						yes=false;
						break;
					}
				}
			}
			System.out.println(yes?"YES":"NO");
		
		}
		
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