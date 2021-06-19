//PetrandaCombinationLock

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
			
			public static void solve(int[] ar,int i,int s,Vector v) {
				int z = 0;
				if(i==ar.length) {
	//				System.out.println(s);
					if(s%360==0) {
						z=1;
						v.add(z);
	//					System.out.println("I am here");
					}
	//				return ans;
					return ;
				}
				else {
					int s1=s,s2=s;
					s1+=ar[i];
					s2-=ar[i];
					i++;
					solve(ar,i,s1,v);
					solve(ar,i,s2,v);
					
				}
				
			}
		
		
		 
		public static void main(String[] args){
			FastReader in=new FastReader();
			int n =in.nextInt();
			int i = 0;
			int[] ar=new int[n];
			boolean p = false;
			int s = 0;
			int[] con = new int[181];
			for(i=0;i<n;i++) {
				ar[i]=in.nextInt();
				s+=ar[i];
				con[ar[i]]++;
			}
			int dif = s%360;
			if(dif%360==0) p=true;
	//		System.out.println(dif);
	//		sort(ar,0,n-1);
			if(dif!=0&&n>1) {
				int ts = 0;
				int j = 0;
				int ans = 0;
				int aa=0;
				Vector vv = new Vector();
				solve(ar,j,ts,vv);
	//			System.out.println(vv);
				if(vv.size()>0) p=true;
				
			}
			System.out.println(p?"YES":"NO");
			
			
		}
			
	}