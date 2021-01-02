

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public  class TextDocumentAnalysis
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
	
	public static void mul(int a,int b,int re) {
		if(b>0) {
			re+=a;
			b--;
			if(b==0)
				System.out.println(re);
			mul(a,b,re);
		}
	}

	
	public static void main(String[] args){
		FastReader in=new FastReader();
		
		int  n =in.nextInt();
		String s = in.nextLine();
		String ans = "";
		int i ,a1 = 0,a2 = 0;
		int j =0,b=0;
		int cc = 0;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				a1=Math.max(a1, b);
				b=0;
				int k = i+1;
				for(k=i+1;k<s.length();k++) {
					if(s.charAt(k)==')') {
						i=k;
						break;
					}
				}
			}else
			{
				if(s.charAt(i)!='_') {
					b++;
					if(i==s.length()-1) {
//						b--;
						a1=Math.max(a1, b);
					}
				}else {
					a1=Math.max(a1, b);
					b=0;

				}
			}
			
		}
		
		b=0;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				b=1;	
			}else if(b==0) {
				char[] ch = s.toCharArray();
				ch[i]=' ';
				s=String.valueOf(ch);
			}else {
				if(s.charAt(i)==')') {
					b=0;
				}
			}
		}
		s=s.replaceAll(" ", "");
		for(i=1;i<s.length();i++) {
			if(s.charAt(i-1)!='_'&&s.charAt(i-1)!='('&&s.charAt(i-1)!=')') {
				if(s.charAt(i)=='_'||s.charAt(i)=='('||s.charAt(i)==')') {
					a2++;
				}	
			}
		}
//		System.out.println(s);
		System.out.println(a1+" "+a2);
			
	}
	
}