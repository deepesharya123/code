PhototoRemember
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class t
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
		int i;
		int[][] ar = new int[n][2];
		int hh[] = new int[1001];
		long W = 0,H=0;
		for(i=0;i<n;i++) {
			ar[i][0]=in.nextInt();  //width
			W+=ar[i][0];
			ar[i][1]=in.nextInt();	//height
			H+=ar[i][1];
			hh[ar[i][1]]++;
		}
		
		int l = -1,sl=-1;
		for(i=1000;i>=0;i--) {
			if(hh[i]>0) {
				if(l==-1) {
				l=i;
				hh[i]--;
				i=1001;
				}
				else {
					sl=i;
					hh[i]--;
//					i=1000;	
					break;
				}
			}
		}
		
		hh[l]++;
		hh[sl]++;
		
			for(i=0;i<n;i++) {
				long ml = l;
				if(ar[i][1]==l) {
					ml=sl;
				}
				long mw = W-ar[i][0];
				long res = ml*mw;
				System.out.print(res+" ");
			}
		
		
//			3
//			2 3
//			1 4
//			3 4
//		    16 20 12
//			20
		
	}
	
}