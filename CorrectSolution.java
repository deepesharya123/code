//CorrectSolution

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
		String sm = in.nextLine();
		int[] ar = new int[10];
		int i = 0;
		int cn = n;
		int min = cn;
		if(n==0)	ar[0]=1;
		int d = 0;
		while(cn>0) {
			int rem = cn%10;
			ar[rem]++;
			min = Math.min(min, rem);
			cn/=10;
			d++;
		}
		String s= "";
//		System.out.println(min+" "+d);
		char[] cc = new char[d];
		int jb = -1;
		int asg = -1;
		for(i=min+1;i<10;i++)
			if(ar[i]>0) {
				jb=i;
				break;
			}
		if(min!=0) {

			int k = 0;
			for(i=min;i<10;i++) {
				int num = ar[i];
				char ascii = (char) (i+'0');
				while(num>0) {
					cc[k]=(char)ascii;
					k++;
					num--;
//					System.out.println(cc[k-1]);
				}
			}
			s = new String(cc);
//			asg = Integer.parseInt(s);
		}else {
			for(i=1;i<10;i++) {
				if(ar[i]!=0) {
					s+=(char)(i+'0');
					ar[i]--;
					break;
				}
			}
//			System.out.println(ar[0]);
			while(ar[0]>0) {
				s+='0';
				ar[0]--;
			}
			for(i=0;i<10;i++) {
				int nu =ar[i];
				while(nu>0) {
					s+=(char)(i+'0');
					nu--;
				}
			}
			
			
			
		}
		
//		System.out.println(s+" "+ sm);
		System.out.println(s.matches(sm)?"OK":"WRONG_ANSWER");	
		
		
		
		
		
		
		
		
	}
}