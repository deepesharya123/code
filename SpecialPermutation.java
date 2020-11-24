
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class SpecialPermutation
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
			int n =in.nextInt();
			int i;
			if(n%2==0) {
				int p=n;
				for(i=0;i<n;i++) {
					System.out.print(p+" ");
					p--;
				}
			}else {
				int h= n/2;
				for(i=0;i<n;i++) {
					if(i==0)
					System.out.print(3+" ");
					else if(i==1)
						System.out.print(1+" ");
					else if(i==2)
						System.out.print(2+" ");
					else {
						if(i%2==0) {

							System.out.print(i+" ");
						}else {
							int p =i+2;
							System.out.print(p+" ");
						}
					}
					
					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}