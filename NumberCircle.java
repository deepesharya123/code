//NumberCircle

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
		
	public static void main(String[] args){
		FastReader in=new FastReader();
		
	int n = in.nextInt();
		int i = 0;
		int[] ar = new int[n];
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		
		Vector v = new Vector();
		Vector vv = new Vector();
		
		sort(ar,0,n-1);
		
		int ad = n%2;
		v.add(ar[n-1]);
		for(i=n-2;i>=0;i--) {
			if(i%2==ad) {
				v.add(ar[i]);
			}else {
				vv.add(ar[i]);
			}
		}
		Vector ans = new Vector(v);
		for(i=vv.size()-1;i>=0;i--) {
			ans.add(vv.get(i));
		}
		boolean poss = true;
		for(i=1;i<n-1;i++) {
			int curr = (int)ans.get(i);
			int pre = (int) ans.get(i-1);
			int nex = (int) ans.get(i+1);
			if(curr>=(pre+nex)) {
				poss=false;
			}
		}
		if(poss) {
			int last = (int) ans.get(n-1);
			int ll = (int) 	ans.get(n-2);
			int ne = (int) ans.get(0);
			
			int sec = (int) ans.get(1);
			if(last>=(ll+ne)||(ne>=(sec+last))) {
				poss=false;
			}
			
		}
		if(!poss)
			System.out.println("NO");
		else {
			System.out.println("YES");
			for(i=0;i<n;i++)
				System.out.print(ans.get(i)+" ");
//			System.out.println();
	
		}
		
	}
		
}