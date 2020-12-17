
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class GrowingMushrooms
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
	
		int n= in.nextInt();
		int t1= in.nextInt();
		int t2= in.nextInt();
		int k = in.nextInt();
		
		
		Vector<Double> ans= new Vector<Double>();
		Vector<Double> an= new Vector<Double>();
		Vector<Integer> ind= new Vector<Integer>();
		
//		2 3 3 50
//		2 4
//		4 2
		double kf = (double) k;
		double kp = kf/100;
		int i;
		for(i=0;i<n;i++) {
			int a= in.nextInt();
			int b = in.nextInt();
			
			double p1 ,p2 ;
			p1=t1*a;
			p1=p1-(kp*p1);
			p1=p1+(b*t2);
			
			p2=t1*b;
			p2=p2-(kp*p2);
			p2=p2+(a*t2);
			
			ans.add(Math.max(p1, p2));
			an.add(Math.max(p1, p2));
			
		}
		int[] ai = new int[n];
		int aii = n-1;
		Collections.sort(an);
		for(i=0;i<n;i++) {
			double nu  = an.get(i);
			int inda = ans.lastIndexOf(nu);
			ind.add(inda);
			ans.remove(inda);
			ans.add(inda, -1.0);
			ai[aii]=inda+1;
			aii--;
		}
		
		for(i=0;i<n;i++) {
			System.out.print(ai[i]+" ");
			System.out.println(String.format("%.2f", an.get(n-i-1)));
//			System.out.println();
		}
		
//		+" "+ans.get(i)
	}
	
}