
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class Minimumandmaximumdifferences
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
		
		int n = in.nextInt();
		long sum = 0;
		
		if(n==1) {
			System.out.println(-1);
			System.out.println(-1);
		}
		else {
		if(n%2==0) {
//			for(int i=1;i<n;i+=2) {
//				sum+=i;
//			}
			sum+=sum;
			System.out.println(n);
			int p =n;
//			1 2 3 4 5 6
//			2 1 4 3 6 5 
//			0 1 2 3 4 5 
			for(int i=0;i<n;i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}else {
					int so = i+2;
					System.out.print(so+" ");
				}
			}
			System.out.println();

			sum=(n)*((n/2));
			System.out.println(sum);
			p =n;
			for(int i=0;i<n;i++) {
				System.out.print(p+" ");
				p--;
			}
		}else {
			int h = n/2;
			
//			for(int i=2;i<n;i+=2) {
//				sum+=i;
//			}
//			sum+=sum;
			System.out.println(n+1);
			int p = n;
//			1 2 3  	4 5 6 7 
//			3 1 2  	5 4 7 6
//			0 1 2  	3 4 5 6
			for(int i=0;i<n;i++) {
				if(i==0) {
					System.out.print(3+" ");
				}else if(i==1) {
					System.out.print(1+" ");
				}else if(i==2) {
					System.out.print(2+" ");
				}else {
					if(i%2==0) {
						System.out.print(i+" ");
					}else {
						int so = i+2;
						System.out.print(so+" ");
					}
				}
			}
			System.out.println();
			sum=(n+1)*((n/2));
			System.out.println(sum);
			p = n;
			for(int i=0;i<n;i++) {
				if(i==h) {
//					int so = h-1;
					System.out.print(h+" ");
				}else if(i==h+1){
					int so = h+1;
					System.out.print(so+" ");
				}else {
					System.out.print(p+" ");
				}
				p--;
			}
		}
		}
		
		
	}
	
}