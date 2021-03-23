

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class KsushatheSquirrel
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
		
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.nextLine();
		Vector<Integer> no_rock= new Vector<Integer>();
		Vector<Integer> rock= new Vector<Integer>();
		int i = 0;
		boolean can_pass = true;
//		for(i=0;i<n;i++) {
//			
//			if(can_pass) {
//				if(s.charAt(i)=='.') {
//					no_rock.add(i);
//					if(no_rock.size()>1) {
//						if(i-no_rock.get(no_rock.size()-1)>1) {
//							
//						}
//					}
//				}
//			}else {
//				break;
//			}
//		}
//		
//		
//		
		int hasc=0;
		int pre = 0;
		for(i=0;i<n;i++) {
			if(can_pass) {
				if(s.charAt(i)=='.') {
					if(hasc>=k) {
						can_pass=false;
					}else
						hasc=0;
				}else {
					hasc++;
				}
				
				
				
			}else {
				break;
			}
		}
		if(hasc>=k) {
			can_pass=false;
		}
//		System.out.println(can_pass);
		System.out.println(can_pass?"YES":"NO");
		
		

	}
		
}