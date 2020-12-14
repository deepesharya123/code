import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class JapaneseCrosswordsStrikeBack
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
		
		
		int n = in.nextInt();
		int k = in.nextInt();
		Vector<Integer> v=  new Vector<Integer>();
		int i;
		long s = 0;
		boolean tr = true;
		for(i=0;i<n;i++) {
			v.add(in.nextInt());
			s+=v.get(i);
		}
		s=s+n;
//		System.out.println(s);
		if(s==k+1) {
			System.out.println("YES");
		}else
			System.out.println("NO");
		
	}
	
}