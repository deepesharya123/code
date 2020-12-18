import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class ORinMatrix
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
		int m = in.nextInt();
		String[] s = new String[n];
		
		int i;
		for(i=0;i<n;i++) {
			s[i]=in.nextLine();
			s[i]=s[i].replaceAll(" " , "");
		}
		
	
		int[][] ar=new int[n][m];
		
		for(i=0;i<n;i++) {
			String cs= s[i];
			while(cs.contains("0")) {
				int ind = cs.indexOf('0');
//				System.out.println(ind);
				char[] ch = cs.toCharArray();
				ch[ind]='1';
				cs=String.copyValueOf(ch);
				int j=i;
				int h= 0;
				for(h=0;h<m;h++) {
					ar[i][h]--;
				}
				for(h=0;h<n;h++) {
					ar[h][ind]--;
				}
			}
//			s[i]=cs;
			
			
		}
		String[] ss = new String[n];
		String one = "",zero="";
		int cm =m;
		while(cm>0) {
			one+="1";
			zero+="0";
			cm--;
		}
//		System.out.println(one);
		for(i=0;i<n;i++) {
			ss[i]=zero;
		}
		for(i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
//				System.out.print(ar[i][j]+" ");
				if(ar[i][j]==0) {
					ar[i][j]=1;
//					System.out.print(1+" ");
					ss[i]=one;
					int h = 0;
					for(h=0;h<n;h++) {
						char[] ch = ss[h].toCharArray();
						ch[j]='1';
						ss[h]=String.copyValueOf(ch);
//						System.out.println(ss[i]);
					}
					
				} 
				else {
					ar[i][j]=0;
//					System.out.print(0+" ");
				}
			}
//			System.out.println();
		}
		boolean eq  =true;
		for(i=0;i<n;i++) {
//			System.out.println(ss[i]);
			if(!s[i].contentEquals(ss[i])) {
//				System.out.println(s[i]+" "+ss[i]);
				eq=false;
				break;
			}
		}
		
		if(!eq)
		System.out.println("NO");
		else {
			System.out.println("YES");
			for(i=0;i<n;i++) {
				for(int j= 0;j<m;j++) {
					System.out.print(ar[i][j]+" ");
				}
				System.out.println();
			}
				
		}
	}
	
}