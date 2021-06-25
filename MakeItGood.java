//MakeItGood

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
		int t  = in.nextInt();
		while(t>0) {
			t--;
			int  n = in.nextInt();
			int i = 0;
			int[] ar = new int[n];
			Stack s = new Stack();
			int sort= 0;
			for(i=0;i<n;i++) {
				ar[i]=in.nextInt();
//				s.add(ar[i]);
				if(i==0)
					sort++;
				else if(ar[i]>=ar[i-1])
					sort++;
			}
			int ans = 0;
			int ind = -1;
//			checking for decreasing array
			for(i=n-1;i>=0;i--) {
				int nu = ar[i];
				if(s.size()==0) {
					s.add(nu);
				}else {
					int top = (int)s.get(s.size()-1);
					if(top<=nu) {
						s.add(nu);
					}else {
						ind = i;
						break;
					}
				}
			}
			
//			System.out.println(ind+"    ocpy");
			boolean run =true;
			for(i=ind;i>=0;i--) {
				if(run) {
					int nu = ar[i];
					if(i==ind) {
						s.add(nu);
					}else {
						int top = (int) s.get(s.size()-1);
						if(nu<=top) {
							ind=i;
							s.add(nu);
						}else {
//							System.out.println(nu+" "+top);
							ind = i;
							run=false;
							break;
						}
					}
				}
			}
//			System.out.println(ind);
			if(sort==n||(ind==0&&run)) 
				ind=-1;
			System.out.println(ind+1);
//			System.out.println(s);
//			System.out.println(ind);
//			from index ind to index>=0 we have to check the increasing array
//			System.out.println(ind);
//			if(ind>-1) {
//				int ci = ind;
//				for(i=ind;i>=0;i--) {
//					int nu = ar[i];
//					if(s.size()==0) {
//						s.add(nu);
//					}else {
//						int top = (int) s.get(s.size()-1);
//						if(top>=nu) {
//							s.add(nu);
//						}else {
////							System.out.println(top+" "+nu);
//							ind= i;
//							break;
//						}
//					}
//				}
//				System.out.println(s+" "+ind);
////				System.out.println(ind+"  indci "+ci);
//				ans=ind+1;
//				if(ind==ci) ans = 0;
//			}else
//				ans = 0;
//			System.out.println(ans);
		}
		
	}
}
		