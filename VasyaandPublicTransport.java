//VasyaandPublicTransport
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
		
		int c1 =  in.nextInt();
		int c2 =  in.nextInt();
		int c3 =  in.nextInt();
		int c4 =  in.nextInt();
		
		int n =  in.nextInt();
		int m =  in.nextInt();
		int[] an = new int[n];
		int[] am = new int[m];
		int i = 0;
		int san = 0,sam=0;
		for(i=0;i<n;i++) {
			an[i]=in.nextInt();
			san+=an[i];
		}
		for(i=0;i<m;i++) {
			am[i]=in.nextInt();
			sam+=am[i];
		}	
	//	unlimited ride on anything bus or trolley
		int ans = c4;
	////	all single ride wih c1 price of each ride
	//	ans = Math.min(ans, c1*(sam+san));
	////	
		int ans1 =c4;
		if(sam>0) {
			ans1=0;
			ans1+=c3;
			int to = 0;
			for(i=0;i<m;i++) {
				int p = 0;
				if(am[i]>0) {
					p=Math.min(c2, am[i]*c1);
				}
				to+=p;
			}	
			ans1+=to;
//			if(san>0) {
//				ans1+=Math.min(to,ans1);
//			}
		}
		int can= c4;
		if(san>0) {
			can=0;
			can+=c3;
			int to = 0;
			for(i=0;i<n;i++) {
				int p = 0;
				if(an[i]>0) {
					p=Math.min(c2, an[i]*c1);
				}
				to+=p;
			}
//			if(sam>0) {
//				can+=Math.min(to,ans1);
//			}
			can+=to;
			
		}
		int asd = c4;
		if(sam>0&&san>0) {
			asd=0;
			asd+=c3;
			asd+=c3;
		}
//		if(asd>0)
		ans1=Math.min(ans1, asd);
		
		ans1=Math.min(can, ans1);
		ans=Math.min(ans1, ans);
//		System.out.println(can+" "+ans1+" "+asd);
		int cc1 = 0;
		cc1 = (sam+san);
		cc1*=c1;
		ans = Math.min(cc1, ans);
//		System.out.println(ans);
		int cal = 0;
		for(i=0;i<n;i++) {
			int p = 0;
			if(an[i]>0) {
				p=Math.min(c2, an[i]*c1);
			}
			cal+=p;
		}		
		for(i=0;i<m;i++) {
			int p = 0;
			if(am[i]>0) {
				p=Math.min(c2, am[i]*c1);
			}
			cal+=p;
		}		
//		System.out.println(cal);
		ans=Math.min(ans,cal);
		System.out.println(ans);
		
				
	}
}
