Chocolate
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
	
		
	public static void main(String[] args){
		FastReader in=new FastReader();
		

		int n = in.nextInt();
		int ar[] =new int[n];
		int con = 0;
		long ans = 1;
		boolean yo = false;
		int lon=-1,son=-1;
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0;i<n;i++) {
			ar[i]=in.nextInt();
			if(ar[i]==1) {
				lon=  i;
			}
			if(son==-1&&ar[i]==1) {
				son=i;
			}
		}
		for(int i=son;i<lon+1;i++) {
			if(i>=0) {
				if(ar[i]==0) {
					con++;
					yo=true;
				}else {
					v.add(con);
					con++;
					ans*=con;
					con=0;
				}
			}else {
				break;
			}
		}
//		System.out.println(yo);
		if(son>=0)
			System.out.println(ans);
		else
			System.out.println(0);

	}
		
}