

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class DinnerwithEmma
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
		
//		int t = in.nextInt();
		
//		while(t>0) {
//			t--;
//			int n = in.nextInt();
//			int[] tim=  new int[n+1];
//			Vector<Integer> v = new Vector<Integer>();
//
//			int[] ctim = new int[n+1];
//			int i;
//			int fn = -1;
//			for(i=0;i<n;i++) {
//				v.add(in.nextInt());
//				tim[v.get(i)]++;
//				ctim[v.get(i)]++;
//				if(i==0)
//					fn= v.get(i);
//			}
//			int fnr = tim[fn];
//			int minforfn = 0,minforother=0;
//			int maxtm = 0;
//			for(i=0;i<n+1;i++) {
//				maxtm=Math.max(maxtm, tim[i]);
//			}
//			int[][] ar=  new int[n][maxtm];
//			for(i=0;i<n;i++) {
//				int nu = v.get(i);
////				int 
//				ar[nu][tim[nu]-1]=i;
//				tim[nu]--;
//			}
//			int thatn  = n,tr = n;
//			for(i=0;i<n;i++) {
//				
//			}
//			
//			
//			
//			
//		}
		
		int n = in.nextInt();
		int m=  in.nextInt();
		int i,j;
		int[][] ar= new int[n][m];
		int[] ma = new int[n];
		for(i=0;i<n;i++) {
			int min = 1000000000;
			for(j=0;j<m;j++) {
				ar[i][j]=in.nextInt();
				min= Math.min(min, ar[i][j]);
			}
			ma[i]=min;
		}
		
		int ans = 0;
		for(i=0;i<n;i++) {
			ans= Math.max(ans, ma[i]);
		}
		System.out.println(ans);
		
		
		
		
		
	}
	
}