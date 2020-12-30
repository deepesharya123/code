
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class BovineDilemma
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

		double d[]  =new double[55];
		for(int i=1;i<55;i++) {
			int ci = i;
			d[i]=i/2;
			if(ci%2!=0) {
				d[ci]+=.5;
			}
//			System.out.println(ci+" "+d[ci]);
		}
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			
			int n = in.nextInt();
			int[] ar =new int[n];
			int i;
			for(i=0;i<n;i++)
				ar[i]=in.nextInt();
			
			int con = 0;
//			double[] c = new double[200];
			Vector<Double> c= new Vector<Double>();
			for(i=0;i<n;i++) {
				int j;
				for(j=i+1;j<n;j++) {
//					System.out.println(i+" "+j);
					double a = d[ar[i]];
					double b = d[ar[j]];
					double area = b-a;
//					System.out.print(area+" ");
					if(c.indexOf(area)==-1) {
						con++;
						c.add(area);
						
					}
				}
			}
				System.out.println(con);			
			
			
		}
		
					
	}
	
}