
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class GameofRobots
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
		
		for(i=0;i<n;i++) {
			v.add(in.nextInt());
		}
		
		int[][] ar= new int[100000][2];
		int c= 0;
		ar[0][0]=1;
		int ka = 0;
		int ind = -1;
		for(i=1;i<64000;i++) {
			ar[i][0]+=ar[i-1][0]+i-1;
			ar[i][1]+=ar[i][0]+ka;
			ka++;
//			System.out.println(ar[i][0]+" "+ar[i][1]);
		
			if((ar[i][0]<k&&ar[i][1]>k)||(ar[i][0]==k||ar[i][1]==k)) {
				ind = ar[i][0];
				break;
			}
			
		}
		int ans = 0;
		while(ind!=k) {
			ind++;
			ans++;
		}
		System.out.println(v.get(ans));
		
		
		
		
	
		
		
	}
	
}