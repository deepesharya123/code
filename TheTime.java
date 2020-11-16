import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class TheTime
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
		
		String s = in.nextLine();
		int a = in.nextInt();
		int hh =Integer.parseInt(s.substring(0, 2));
		int mm =Integer.parseInt(s.substring(3, 5));
		
		int ca =a;
		while(ca!=0) {
			mm++;
			if(mm==60) {
				mm=0;
				hh++;
			}
			if(hh==24) {
				hh=0;
			}
			ca--;
		}
		String h = "";
		if(hh<10) {
			h="0";
		}
		h+=hh;
		String m = "";
		if(mm<10) {
			m="0";
		}
		m+=mm;
		System.out.println(h+":"+m);
		
	
		
	}
	
}