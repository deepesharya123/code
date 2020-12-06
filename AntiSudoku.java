
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class AntiSudoku
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
//			int n = in.nextInt();
			String s[] = new String[9];
			int i;
			for(i=0;i<9;i++)
				s[i]=in.nextLine();
			
			
			for(i=0;i<9;i++) {
				char[] ch= s[i].toCharArray();
				if(i==0) {
					ch[0]=ch[1];
					s[i]=String.valueOf(ch);
				}
				else if(i==1) {
					int nn = 3;
					char c = s[i-1].charAt(nn);
					ch[nn]=c;
					s[i]=String.valueOf(ch);
				}else if(i==2) {
					int nn = 6;
					char c = s[i-1].charAt(nn);
					ch[nn]=c;
					s[i]=String.valueOf(ch);
				}else if(i==3) {
					int nn = 1;
					char c = s[i-1].charAt(nn);
					ch[nn]=c;
					s[i]=String.valueOf(ch);
				}else if(i==4) {
					int nn = 4;
					char c = s[i-1].charAt(nn);
					ch[nn]=c;
					s[i]=String.valueOf(ch);
				}else if(i==5) {
					int nn = 7;
					char c = s[i-1].charAt(nn);
					ch[nn]=c;
					s[i]=String.valueOf(ch);
				}else if(i==6) {
					int nn = 2;
					char c = s[i-1].charAt(nn);
					ch[nn]=c;
					s[i]=String.valueOf(ch);
				}else if(i==7) {
					int nn = 5;
					char c = s[i-1].charAt(nn);
					ch[nn]=c;
					s[i]=String.valueOf(ch);
				}else if(i==8) {
					int nn = 8;
					char c = s[i-1].charAt(nn);
					ch[nn]=c;
					s[i]=String.valueOf(ch);
				}
				
				System.out.println(s[i]);
			}
			
			
			

		}
		
		
		
		
		
	}
	
}