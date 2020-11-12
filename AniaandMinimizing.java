import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class AniaandMinimizing
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

		int n= in.nextInt();
		int k =in.nextInt();
		String s = in.nextLine();
		int i =0;
		String t = s;
		String[] st = t.split("");
		int ck=k;
		while(k>0&&i<s.length()) {
			if(i==0) {
				if(s.charAt(i)!='1') {
					st[i]="1";
					k--;
				}else {
					st[i]="1";
				}
			}else {
				if(s.charAt(i)!='0') {
					st[i]="0";
					k--;
				}else {
					st[i]="0";
				}
				
			}
			i++;
		}


		if(n==1&&ck==1) {
//			System.out.println("ASDf");
			st[0]="0";
		}
		i=0;
		while(i<st.length) {
			System.out.print(st[i]);
			i++;
		}


	}
	
}