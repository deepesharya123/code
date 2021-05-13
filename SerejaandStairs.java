//SerejaandStairs

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
	
		
	public static void main(String[] args){
		FastReader in=new FastReader();

		int n = in.nextInt();
		int[] ar = new int[n];
		int i = 0;
		int ans = 0;
		int max = 0;
		int[] con = new int[5001];
		Vector<Integer> v = new Vector<Integer>();
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			con[ar[i]]++;
			max=Math.max(max, ar[i]);
		}
		for(i=0;i<5001;i++) {
			if(con[i]<3&&i!=max)
				ans+=con[i];
			if(con[i]>=3&&i!=max)
				ans+=2;
			if(i==max) 
				ans++;
		}
		int co = 0;
		System.out.println(ans);
		if(ans==1)
			System.out.println(ar[0]);
		else if(n==2) {
			System.out.println(Math.min(ar[0], ar[1])+" "+Math.max(ar[0], ar[1]));
		}else {
//			if(ans==n) {
//				for(i=0;i<5001;i++) {
//					if(con[i]==1) {
//						v.add(i);
//						System.out.println(i);
//					}
//				}
//				System.out.println(v);
////				for(i=0;i<v.size()-2;i++) {
////					System.out.print(v.get(i)+" ");
////				}
////				System.out.print(v.get(v.size()-1)+" "+v.get(v.size()-2));
//			}else {
				int[] an = new int[ans];
				int st = 0,la= ans-1;
				for(i=0;i<5001;i++) {
					if(con[i]==1) {
						an[st]=i;
						st++;
					}else if(con[i]>=2) {
						an[st]=i;
						st++;
						an[la]=i;
						la--;
					}
				}
				for(i=0;i<ans;i++) {
					if(i<ans-2)
						System.out.print(an[i]+" ");
					else {
						if(an[i]>an[i+1]) {
							System.out.print(an[i]+" ");
							System.out.print(an[i+1]+" ");	
							i=n+1;
						}else {
							System.out.print(an[i+1]+" ");
							System.out.print(an[i]+" ");
							i=n+1;
						}
					}
				}
				System.out.println();
//			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}