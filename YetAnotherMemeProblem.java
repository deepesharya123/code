

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class YetAnotherMemeProblem
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
			int a  = in.nextInt();
			int b = in.nextInt();
			int ca=a,cb=b;
			int da=0,db=0;
			while(ca>0) {
				da++;
				ca/=10;
			}
			while(cb>0) {
				db++;
				cb/=10;
			}
			long[] ans = new long[2];
			int nna = da-1,nnb=db-1;
			long rna =(long)Math.pow(10, da);
			rna--;
			long rnb =(long)Math.pow(10, db);
			rnb--;
//			System.out.println(rna+" "+rnb);
			if(a==rna)
				nna++;
			if(b==rnb)
				nnb++;
//			ans[0]=(long)nna*b;
			long an =(long)nnb*a;
//			long pr = Math.max(ans[0], ans[1]);
			
			System.out.println(an);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}