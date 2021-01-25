
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class newYear'snumber
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

//		int t = in.nextInt();
//		Vector<Integer> p = new Vector<Integer>();
//		int[] ar = new int[1000001];
//		int cp =0;
//		int i;
//		for(i=0;i<1000001;i++) {
//			ar[i]=1;
//		}
//		
//		for(i=2;i<=1000;i++) {
//			if(ar[i]==1) {
//				int j=i;
//				for(j=i*i;j<1000001;j+=i) {
//						ar[j] = 0;
//				}
//			}
//		}
////		System.out.println(ar[7]);
//		for(i=0;i<1000001;i++) {
//			if(ar[i]==1) {
//				cp++;
//				p.add(i);
//			}
//			if(cp==10007) {
//				break;
//			}
//		}
////		for(i=0;i<20;i++)
////			System.out.println(p.get(i));
//		while(t>0) {
//			t--;
//			int n = in.nextInt();
//			long ans= 1;
//			ans=((long) p.get(n+1)*(long)p.get(n+2));
//			System.out.println(ans);
//		}
		
//		int t = in.nextInt();
//		while(t>0) {
//			t--;
//			int n = in.nextInt();
//			String b = in.nextLine();
//			String a = "",d="1";
//			if(b.charAt(0)=='1')
//				d="2";
//			a+=Math.abs(b.charAt(0)-d.charAt(0));
//			
//			for(int i = 1;i<n;i++) {
//				if(b.charAt(i)=='1') {
//					if(d.charAt(i-1)=='2') {
//						d+="1";
//					}else {
//						d+="2";
//					}
//				}else {
//					if(d.charAt(i-1)=='1') {
//						d+="0";
//					}else {
//						d+="1";
//					}
//				}
//				
//				a+=Math.abs(b.charAt(i)-d.charAt(i));
//				
//			}
////			System.out.println(d+" "+b);
//			System.out.println(a);
//			
//		
//		}
		
//		int t = in.nextInt();
//		long[] to = new long[45];
//		to[0]=1;
//		for(int i= 1;i<45;i++) {
//			to[i]=to[i-1]*2;
////			System.out.println(to[i]);
//		}
//		
//		while(t>0) {
//			t--;
//		
//			long n = in.nextLong();
//			boolean b = true;
//			for(int i = 0;i<45;i++) {
//				if(to[i]==n) {
//					b=false;
//				}
//			}
//			if(b==false)
//				System.out.println("NO");
//			else
//				System.out.println("YES");
//		}
//		
		
		
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			int n = in.nextInt();
			int cn = n;
			int cnn= n;
			boolean yo = false;
			
			while(cn>0) {
				int r = cn-2020;
				if(cn%2021==0) {
					yo=true;
					break;
				}else {
					cn-=2020;
				}
			}
			
			if(yo==false) {
				while(cnn>0) {
					int r = cnn-2021;
					if(cnn%2020==0) {
						yo=true;
						break;
					}else {
						cnn-=2021;
					}
				}
			}
			
			if(yo)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

	}
		
}