//AlmostRectangle
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
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			int n = in.nextInt();
			String[] s = new String[n];
			int i,a,b,x,y;
			a=-1;
			b=-1;
			x=-1;
			y=-1;
			for(i=0;i<n;i++) {
				s[i]=in.nextLine();
				if(s[i].indexOf('*')>=0) {
					if(s[i].indexOf('*')==s[i].lastIndexOf('*')) {
					
						if(a==-1) {
							a=i;
							b=s[i].indexOf('*');
						}else {
							x=i;
							y=s[i].indexOf('*');
						}
					}else {
						a=i;
						b=s[i].indexOf('*');
						x=i;
						y=s[i].lastIndexOf('*');
					}
				}
			}
//			
//			System.out.println(a+" "+b);
//			System.out.println(x+" "+y);
//			
			if(a==x) { // same row
				if(a>=0&&a<n-1) {
					char []c = s[a+1].toCharArray();
					c[b]='*';
					c[y]='*';
					s[a+1]=String.valueOf(c);
				}else {
					char []c = s[a-1].toCharArray();
					c[b]='*';
					c[y]='*';
					s[a-1]=String.valueOf(c);
				}
			}else if(b==y){
				if(y>=0&&y<n-1) {
					char []c = s[a].toCharArray();
					c[y+1]='*';
					char []cc = s[x].toCharArray();
					cc[y+1]='*';

					s[a]=String.valueOf(c);
					s[x]=String.valueOf(cc);
				}else {
					char []c = s[a].toCharArray();
					c[y-1]='*';
					char []cc = s[x].toCharArray();
					cc[y-1]='*';

					s[a]=String.valueOf(c);
					s[x]=String.valueOf(cc);
				}
			}else {
				int a1 = -1,b1=-1,x1=-1,y1=-1;
				a1=a;
				b1=y;
				x1=x;
				y1=b;
				char[] c = s[a].toCharArray();
				char[] cc = s[x].toCharArray();
				c[b1]='*';
				cc[y1]='*';
				s[a]=String.valueOf(c);
				s[x]=String.valueOf(cc);
			}
//			System.out.println("1");
			for(i=0;i<n;i++)
				System.out.println(s[i]);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}