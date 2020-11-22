import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class TwoBrackets
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
		
			String s = in.nextLine();
			int i=0,c= 0,co=0,cc=0,so=0,sc=0;
			while(i<s.length()) {
				char ch = s.charAt(i);
				i++;
				
				if(ch=='(') {
					co++;
				}else if(ch==')'&&co>0){
					co--;
					c++;
				}
				if(ch=='[') {
					so++;
				}else if(ch==']'&&so>0){
					so--;
					c++;
				}
			}
			
			
			//			String cs=s;
//			cs=cs.replace('[',' ');
//			cs=cs.replace(']',' ');
//			cs=cs.replaceAll(" ", "");
//			int c=0;
////			System.out.println(cs);
//			int i = 0;
//			Vector<Integer> v = new Vector<Integer>();
//			while(i<cs.length()) {
//				if(cs.charAt(i)=='(') {
//					v.add(1);
//				}else {
//					int rem = v.indexOf(1);
//					if(rem>=0) {
//						v.remove(rem);
//						c++;
//						}
//				}
//				i++;
//			}
//			
////			System.out.println(c);
//			v.clear();
//			cs=s;
//			cs=cs.replace('(',' ');
//			cs=cs.replace(')',' ');
//			cs=cs.replaceAll(" ", "");
//			i=0;
//			while(i<cs.length()) {
//				if(cs.charAt(i)=='[') {
//					v.add(1);
//				}else {
//					int rem = v.indexOf(1);
//					if(rem>=0) {
//					v.remove(rem);
//					c++;
//					}
//				}
//				i++;
//			}
//			
//
//			
//			

			System.out.println(c);

			

			
			
			
			
			
		}
		
	}
	
}