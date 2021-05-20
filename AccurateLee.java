//AccurateLee

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
		while(t>0){
			t--;
			int n = in.nextInt();
			String s = in.nextLine();
			String ans = "";
			int z = 0,o=0;
			for(int i =0;i<n;i++) {
//				ans+=s.charAt(i);
				if(s.charAt(i)=='0')
					z++;
				else
					break;
			}
			for(int i = n-1;i>=0;i--) {
				if(s.charAt(i)=='1') {
					o++;
				}else {
					break;
				}
			}
			if(z+o==n)
				System.out.println(s);
			else {
				for(int i=0;i<z;i++){
	                ans+='0';
	            }
	            ans+='0';
	            
	            for(int i=0;i<o;i++){
	                ans+='1';
	            }
	            System.out.println(ans);
			}
//			if(s.contains("10")) {
//				ans+="0";
//			}
//			for(int i = s.lastIndexOf('0')+1;i<s.length();i++) {
//				ans+=s.charAt(i);
//			}
////			if(s.lastIndexOf('0')>=0&&s.lastIndexOf('0')<s.indexOf('1'))
////				for(int i = s.indexOf('1');i<s.length();i++)
////					ans+=s.charAt(i);
////			else  {
////				if(s.indexOf('1')>=0&&s.lastIndexOf('0')>=0&&s.indexOf('1')<s.lastIndexOf('0'))
////					ans+="0";
////				for(int i =s.lastIndexOf('0')+1;i<s.length();i++)
////					ans+=s.charAt(i);
////			}
//			if(s.indexOf('1')==-1) {
////				ans=s;
//				System.out.println(s);
//			}else
//			System.out.println(ans);
//			
			
		}
		
		
		
		
		
		
		
		
		
	}
		
}