

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		//import java.util.Scanner;
		import java.util.*;
		
		public  class ChristmasSpruce
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
		
		int n = in.nextInt();
		int[] ar = new int[n+11];
		int i = 0 ;
		int []con = new int[n+11];
		int[] leaf = new int[n+11];
		for(i=2;i<=n;i++) {
			ar[i]=in.nextInt();
			con[ar[i]]++;
		}
		Vector nonLeaf = new Vector();
		for(i=1;i<=n;i++) {
			if(con[i]==0) {
				leaf[i]=1;
			}
//			System.out.println(con[i]+" "+leaf[i]);
			
			if(leaf[i]==0)
				nonLeaf.add(i);
		}
//		System.out.println("NONO LEAF");
//		System.out.println(nonLeaf);
		boolean ans = true;
//		for leaf child leaf[i]=1
//		for nonLeaf child leaf[i]=0
				
//		for(i=1;i<n+1;i++)
//			System.out.println(leaf[i]+" "+i);
//		System.out.println("asdf");
		int[] leafChild= new int[n+1];
		for(i = 0;i<nonLeaf.size();i++) {
			int nu = (int) nonLeaf.get(i);
			int result = 0;
			if(leafChild[nu]==0) {
				for(int j = 2;j<=n;j++){
//					System.out.println(ar[j]+" "+leaf[j]+" jj   "+j);
					if(ar[j]==nu&&leaf[j]==1) {
						result++;
					}
				}
//				System.out.println("RESULT   "+result);
				if(result<3)
					result=-1;
				leafChild[nu]=result;
			}

			if(leafChild[nu]<0) {
//				System.out.println(leafChild[nu]+" "+nu);
				ans = false;
				break;
			}
		}
		
		System.out.println(ans?"YES":"NO");		
		
	}
}
		