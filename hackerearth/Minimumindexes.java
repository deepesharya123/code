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
		int q = in.nextInt();
		Vector<Integer> v = new Vector<Integer>();
		int i;
		int[] ar= new int[n];
		for(i=0;i<n;i++) {
			v.add(in.nextInt());
			int nu = v.get(i);
			int sum = 0;
			while(nu!=0) {
				int rem = nu%10;
				sum+=rem;
				nu=nu/10;
			}
			ar[i]=sum;
		}
		for(i=0;i<q;i++) {
			int nu = in.nextInt();
			nu--;
			int gs = ar[nu];
			int ans =-1;
			for(int j=nu+1;j<n;j++) {
				if(v.get(nu)<v.get(j)&&ar[nu]>ar[j]) {

//					System.out.println(v.get(nu)+" "+v.get(j));
					ans=j+1;
					
					break;
				}
			}
			System.out.println(ans);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}