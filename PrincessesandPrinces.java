//PrincessesandPrinces

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
	
	public static void insertHeap(int[] ar,int n) {
		
		for(int i=1;i<n;i++) {
			int pa= i-1;
			pa/=2;
			int ari = ar[i];
			
			if(ar[pa]<ar[i]) {
				int temp = ar[pa];
				ar[pa]=ar[i];
				ar[i]=temp;
			}
			
//			while(pa>=0&&ar[pa]<ar[i]) {
//				ar[pa]=ari;
//				i=pa;
//				pa--;
//				pa/=2;
//			}
			
//			ar[i]=
		}
		
		
		
	}
		
	
	public static void print_arr(int[] ar,int n) {
		int i;
		for(i=0;i<n;i++)
			System.out.print(ar[i]+" ");
	}
	public static void main(String[] args){
		FastReader in=new FastReader();
	
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			int n = in.nextInt();
			Vector v = new Vector();
			int[] ar = new int[n+1];
			int con = 0;
			int i = 0;
			int[] got = new int[n];
			Vector problem = new Vector();
			for(i=0;i<n;i++) {
				int m = in.nextInt();
				Vector vs = new Vector();
				boolean add=true;
				while(m>0) {
					int nu = in.nextInt();
					vs.add(nu);
					if(ar[nu]==0&&add) {
						ar[nu]=1;
						got[i]=1;
						add=false;
						con++;
					}
				m--;
				}
				if(vs.size()==0) {
					problem.add(i);
					v.add(-1);
				}
				else if(got[i]==0) {
					problem.add(i);
					v.add(vs);
				}else {
					v.add(-1);
				}
			}
			if(con==n)
				System.out.println("OPTIMAL");
			else {
//				System.out.println("HERE");
//				System.out.println(problem);
//				System.out.println(v);
				System.out.println("IMPROVE");
				int start = 0;
				for(i=1;i<=n;i++) {
					if(ar[i]==0) {
						start=i;
						break;
					}
				}
				for(i=0;i<problem.size();i++) {
					int pri = start;
					int pp = (int)problem.get(i)+1;
					System.out.println(pp+" "+pri);
//					break;
					i=problem.size();
				}
				
			}
		
		}
		
		
	}
		
}