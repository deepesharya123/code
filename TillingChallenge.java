import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;


public class TilingChallenge {
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

				int n=in.nextInt();
				String[] s = new String[n];
				int i;
				for(i=0;i<n;i++) 
					s[i]=in.nextLine();
				
				
				
				boolean poss = true;
				if(s[0].charAt(0)=='.'||s[n-1].charAt(n-1)=='.'||s[0].charAt(n-1)=='.'||s[n-1].charAt(0)=='.') {
					poss=false;
				}else {
					for(i=0;i<n;i++) {
						int ind = s[i].indexOf('.');
						if(ind>0&&ind-1>=0&&ind+1<n) {
							if(i+2<n&&ind-1>=0) {
								char i1 = s[i+1].charAt(ind-1);
								char i2= s[i+1].charAt(ind);
								char i3 = s[i+1].charAt(ind+1);
								char i4 = s[i+2].charAt(ind);
								if(i1=='.'&&i2=='.'&&i3=='.'&&i4=='.') {
									char[] c1= s[i].toCharArray();
									char[] c2= s[i+1].toCharArray();
									char[] c3= s[i+2].toCharArray();
									c1[ind]='#';
									c2[ind]='#';
									
									c2[ind-1]='#';
									c2[ind+1]='#';
									c3[ind]='#';
									s[i]=String.valueOf(c1);
									s[i+1]=String.valueOf(c2);
									s[i+2]=String.valueOf(c3);
//									System.out.println(s[i]);
//									System.out.println(s[i+1]);
//									System.out.println(s[i+2]);
									i--;
								}else {
									
									poss=false;
//									break;
								}
								
							}else {
								poss=false;
								break;
							}
							
						}

							
					}
				
				}
				
				for(i=0;i<n;i++){
					if(s[i].indexOf('.')>-1) {
						poss=false;
						break;
					}
					
				}
			if(poss)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}
}
		
	
