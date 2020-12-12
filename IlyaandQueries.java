
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class IlyaandQueries
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
		
		String s = in.nextLine();
		
		int len = s.length();
		int[] ar= new int[len];
		int[] ss= new int[len];
		
		int i ;
		for(i=0;i<len-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				ar[i]=1;
				
			}
			if(i==0) {
				ss[i]=ar[i];
			}else {
				ss[i]=ss[i-1]+ar[i];
//				System.out.println(ss[i]+" "+ar[i]);
			}
		}
		i=0;
		while(i<=len-1) {
//			System.out.println(ss[i]+" "+i);
			i++;
		}
//		System.out.println("ASD	F");
		int m = in.nextInt();
		while(m>0) {
			m--;
			
			int st = in.nextInt();
//			st--;
			int fin = in.nextInt();
//			fin--;
			int sum = 0;
			if(st>=2)
			sum  =ss[fin-2]-ss[st-2];	
			else
				sum=ss[fin-2];
			
			System.out.println(sum);
		}
		
		
		
			
		
		
	}
	
}