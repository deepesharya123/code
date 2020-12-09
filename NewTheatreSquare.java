import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class NewTheatreSquare
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

		while(t>0) {
			t--;
			int n = in.nextInt();
			int m  =in.nextInt();
			int x= in.nextInt();
			int y = in.nextInt();
			
			
			String[] s = new String[n];
			int i;
			int td=0,tpt=0;
//					td==total_dots , tpt = total_consecutive__two_points
//			
			for(i=0;i<n;i++) {
				s[i]=in.nextLine();
				String cs = s[i];
				
				cs=cs.replace("*", "");
				td+=cs.length();
//				System.out.println(cs);
			}
				
//			System.out.println(td);
			
			for(i=0;i<n;i++) {
				String cs = s[i];
				int j;
				int ctt=0;
				for(j=0;j<m;j++) {
					if(j+1<m&&cs.charAt(j)=='.'&&cs.charAt(j+1)=='.') {
						ctt++;
						j++;
					}
				}
				tpt+=ctt;
			}
//			System.out.println(td+" "+tpt);
			int an2= ((tpt*y)+((td-tpt-tpt)*x)) ;
			int ans = Math.min(td*x,an2);
			System.out.println(ans);
			
			
		}
		
		
		
		

		
	}
	
}