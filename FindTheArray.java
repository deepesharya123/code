//FindTheArray

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
			int m = l+((u-l)/2);
//				m/=2;
					
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
			int s = in.nextInt();
			Vector v = new Vector();
			int rs = 0,mx = -1;;
			while(rs<s) {
				if(rs==0) {
					v.add(1);
					mx=1;
					rs++;
				}else if(s-rs==1) {
					rs+=1;
					v.add(1);
				}else {
//					System.out.println(rs+" "+mx);
					if(s-rs>=2&&s-rs>=mx) {
						mx+=2;
						v.add(mx);
						rs+=mx;
					}else {
						v.add(s-rs);
						rs=s;
					}
				}
				int dif = s-rs;
			
//			System.out.println(v+" rss"+ rs+" dif"+dif);
			}
			System.out.println(v.size());
			
			
		}
		
		
		
		
		
		
		
		
		

		
		
		
		
	}
}
		