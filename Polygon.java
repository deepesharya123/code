		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		//import java.util.Scanner;
		import java.util.*;
		
		public  class Polygon
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
			int n = in.nextInt();
			String[] s = new String[n];
			int i = 0;
			int one = 0;
			for(i=0;i<n;i++) {
				s[i]=in.next();
				if(s[i].indexOf('1')>=0)
					one++;
			}
			boolean poss = true;
			if(one>0) {
				int j = 0;
				for(i=0;i<n;i++) {
					String ss = s[i];
					for(j=0;j<n;j++) {
						char c = ss.charAt(j);
						boolean temp = true;
						if(c=='1') {
							if((j==n-1&&c=='1')||(i==n-1&&c=='1')||(j+1<n&&s[i].charAt(j+1)=='1')||(i+1<n&&s[i+1].charAt(j)=='1')) {
//								System.out.println(i+" "+j);
								temp=false;
							}
							else
								temp =true;
							temp=!temp;
						poss = poss&temp;
					
						}
					}
					if(!poss)
						break;
				}
			}
			
			System.out.println(poss?"YES":"NO");
			
		}
			
	}
}
		