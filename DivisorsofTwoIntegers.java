

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class DivisorsofTwoIntegers
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
		int max = 1;
		int[] ar= new int[n];
		int[] d = new int[10001];
		for(int i = 0;i<n;i++) {
			ar[i]=in.nextInt();
			d[ar[i]]++;
			max=Math.max(max, ar[i]);
		}
		long ans = 1;
//		Arrays.sort(ar);
//		for(int i = 0;i<n;i++) {
//			if(max%ar[i]==0) {
//				d[ar[i]]--;
//				int j=i+1;
//				
//				
//				for(;j<n;j++) {
//					if(ar[i]!=ar[j]) {
//						i=j-1;
//						break;
//					}
//				}
//			}
//			
//			if(d[ar[i]]>0) {
//				ans*=ar[i];
//			}
//			
//			
//		}
//		
		int i;
		Vector<Integer> v = new Vector<Integer>();
		for(i=0;i<n;i++) {
			if(max%ar[i]!=0||(d[ar[i]]>1)) {
				d[ar[i]]--;
//				System.out.println(ar[i]);
//				ans*=ar[i];
				v.add(ar[i]);
				ans = Math.max(ans, v.get(v.size()-1));
			}
		}
		
		System.out.println(ans+" "+max);
		
		
		
		
		
		
		
	}
	
}