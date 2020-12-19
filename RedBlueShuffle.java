import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class  RedBlueShuffle
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
	
	public static void main(String[] args){
		FastReader in=new FastReader();

		
		int t= in.nextInt();

		while(t>0) {
			t--;
			int n = in.nextInt();
			String s = in.next();
			int[] a= new int[n];
			int[] b= new int[n];
			int win = 0;	// 0 ==equl , 1 =red,-1 blue

			for(int i=0;i<n;i++) {
				a[i]=s.charAt(i);
			}
//			Arrays.sort(a);
			String s1= in.next();
			for(int i=0;i<n;i++) {
				b[i]=s1.charAt(i);
			}
//			Arrays.sort(b);
			int c = 0;
			int e=0,r=0,bl=0;
			for(int i=n-1;i>=0;i--) {

//				System.out.println(a[i]+" "+b[i]);
				if(a[i]>b[i]) {
					r++;
				}else if(b[i]>a[i]) {
					bl++;
				}else {
					r++;
					bl++;
				}
			}
//			System.out.println(r+" "+bl);
			if(r==bl) {
				System.out.println("EQUAL");
			}else if(r>bl) {
				System.out.println("RED");
			}else
				System.out.println("BLUE");
			
			
			
			
			
			
			
		}
		
		
		
		
		
		

	}
	
}