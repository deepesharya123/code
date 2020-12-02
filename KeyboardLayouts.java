import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class KeyboardLayouts
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


		
		String a = in.nextLine();
		String b = in.nextLine();
		String c = in.nextLine();
		
		char[] aa = a.toCharArray();
		char[] ba = b.toCharArray();
		int[] big = new int[c.length()];
//		int[] ans = new int[c.length()];
		String ans="";
		int i;
		for(i=0;i<c.length();i++) {
			int nuc  = c.charAt(i);
			if(nuc>64&&nuc<91) {
				big[i]=1;
			}
		}
//		System.out.println((int)'A');
//		System.out.println((int)'Z');
//		System.out.println((int)'a');
//		System.out.println((int)'z');
//		
//		System.out.println((int)'0');
//		System.out.println((int)'1');
//		System.out.println((int)'9');
		int[] bind = new int[c.length()];
		for(i=0;i<c.length();i++) {
			char ch = c.charAt(i);
			int nu = (int) ch;
			
			if(nu>47&&nu<58) {
				ans+=ch;
			}else {
				if(ch>64&&ch<91) {
					char sch =(char)( ch+32);
					int inda = -1;
					for(int j = 0;j<a.length();j++) {
						if(ch==a.charAt(j)||sch==a.charAt(j)) {
							bind[i]=j;
							inda = j;
							break;
						}
					}
					char cb = b.charAt(inda);
					if(big[i]==1&&cb>96&&cb<123) {
//						System.out.println(cb);
						cb=(char)(cb-32);
//						System.out.println(cb);
					}
//					System.out.println(cb);
					String as = "";
					as+=cb;
					ans+=as;
				}else {
					char lch =(char)( ch-32);
					int inda = -01;
					for(int j = 0;j<a.length();j++) {
						if(ch==a.charAt(j)||lch==a.charAt(j)) {
							bind[i]=j;
							inda = j;
							break;
						}
					}
					char cb = b.charAt(inda);
					if(big[i]==0&&cb>64&&cb<91) {
//						System.out.println(cb);
						cb=(char)(cb+32);
//						System.out.println(cb);
					}
//					System.out.println(cb);
					String as = "";
					as+=cb;
					ans+=as;
				}
			}
			
		}
		System.out.println(ans);
		
		
		
		
		
		
		

        
	}
	
}