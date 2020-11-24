
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class UniqueBidAuction
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
		
//		int n = in.nextInt();
//		Vector<Integer> v = new Vector<Integer>();
//		int i;
//		for(i=0;i<n;i++){
//			v.add(in.nextInt());
//		}
//		int st = 0;
//		long aa= 0,comp=0,addthis=0;
//		boolean run = true;
//		while(run) {
//			for(i=st;i<n;i++) {
//				i+=v.get(i);
//				st=i;
//				if(i+1<n-1) {
//					comp++;
//				}
//				
//				else if(i+1==n-1) {
//					addthis=v.get(i+1);
//					comp++;
//					aa+=addthis;
//					run=false;
//				}
//				
//				else if(i>n-1) {
//					System.out.println(i);
//					addthis = i-n;
//					aa+=addthis;
//					comp++;
//					st=i;
//					System.out.println("ASDF");
//					run=false;
//				}
//				
//			}
//		}
//		System.out.println(comp);
//		long ans = comp+aa;
//		long dif =n-comp ;
//		ans+=dif;
//		
//		
//		System.out.println(ans);
//		
//		
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			int n = in.nextInt();
			int[] ar=  new int[n+1];
			Vector<Integer> v = new Vector<Integer>();
			int i;
			int min = n;
			for(i=0;i<n;i++) {
				v.add(in.nextInt());
				ar[v.get(i)]++;
				min = Math.min(min, v.get(i));
			}
			int ans = -1;
			for(i=min;i<=n;i++) {
				if(ar[i]==1) {
					ans=i;
					break;
				}
			}
			if(ans==-1)
				System.out.println(ans);
			else
				System.out.println(v.indexOf(ans)+1);
			
			
			
		
		}
		
		
	}
	
}