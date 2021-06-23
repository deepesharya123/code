//EmailfromPolycarp

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

		int t = in.nextInt();
		while(t>0) {
			t--;
			String s = in.next();
			String p = in.next();
			boolean ans = true;
			if(p.length()<s.length())
				ans=false;
			else {
				int i = 0;
				Vector v = new Vector();
				Vector conv = new Vector();
				for(i=0;i<s.length();i++) {
					char c = s.charAt(i);
					if(v.size()==0||(char)v.get(v.size()-1)!=c) {
						v.add(c);
						conv.add(1);
					}else {
						int ad = 0;
						if(conv.size()>0) {
							ad= (int)conv.get(conv.size()-1);
							conv.remove(conv.size()-1);
						}
						conv.add(ad+1);
					}
				}
				
			
				Vector vv = new Vector();
				Vector convv = new Vector();
				for(i=0;i<p.length();i++) {
					char c = p.charAt(i);
					if(vv.size()==0||(char)vv.get(vv.size()-1)!=c) {
						vv.add(c);
						convv.add(1);
					}else {
						int ad = 0;
						if(convv.size()>0) {
							ad= (int)convv.get(convv.size()-1);
							convv.remove(convv.size()-1);
						}
						convv.add(ad+1);
					}
				}
				if(vv.size()!=v.size())
					ans=false;
				else {
					for(i=0;i<vv.size();i++) {
						int na = (int) conv.get(i);
						int nb = (int) convv.get(i);
						char c1 = (char) v.get(i);
						char c2 = (char) vv.get(i);
						if(na>nb||c1!=c2) {
							ans=false;
							break;
						}
					}
				}
			}
			System.out.println(ans?"YES":"NO");
		}
			
	}
}
		