import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class Jumps
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
		
		int t = in.nextInt();
		int i;
		int[][] ar = new int[1415][3];
//		ar[i][0]=max;
//		ar[i][1]=min;
//		ar[i][2]=np;
		
		int as = 0;
		int con=0;
		for(i =1 ;i<1415;i++) {
			as+=i;
//			System.out.println(as+" "+i);
			int min= as-i-1;
			int np = as-1;
			ar[i][0]=as;
			ar[i][1]=min;
			ar[i][2]=np;
//			System.out.println(ar[i][0]+" "+ ar[i][1]+" "+ar[i][2]);
			if(as>1000000) {
				con++;
			}
			if(con==2) {
				break;
			}
		}
		
		while(t>0) {
			t--;
			int n = in.nextInt();
			
			i=0;
			int ans = -1;
			for(i=0;i<1415;i++) {
				
				if(n<=ar[i][0]&&n!=ar[i][2]) {
					ans=i;
					break;
				}
				
			}
		System.out.println(ans);
		
		}
		
		
		
		
		

		
	}
	
}