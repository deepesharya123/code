
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class LittlePigsandWolves
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
		for(i=0;i<n;i++)
			s[i]=in.nextLine();
		
		
		int j,con=0;
		for(i=0;i<n;i++) {
			String cs=s[i];
			for(j=0;j<m;j++) {
				if(cs.charAt(j)=='W') {
					
					if(((i!=0&&i!=n-1))) {
						
						if((j+1<m&&cs.charAt(j+1)=='P')) {
							con++;
							char[] ch = s[i].toCharArray();
							ch[j+1]='.';
							s[i]=String.valueOf(ch);
						}
						else if((j-1>=0&&cs.charAt(j-1)=='P')) {
							con++;
							char[] ch = s[i].toCharArray();
							ch[j-1]='.';
							s[i]=String.valueOf(ch);
						}
						
						else if((i-1>=0&&s[i-1].charAt(j)=='P')) {
							con++;
							char[] ch = s[i-1].toCharArray();
							ch[j]='.';
							s[i-1]=String.valueOf(ch);
						}
						
						else if((i+1<n&&s[i+1].charAt(j)=='P')) {
							con++;
							char[] ch = s[i+1].toCharArray();
							ch[j]='.';
							s[i+1]=String.valueOf(ch);
						}
						
					}
					
					else if((i==n-1&&j-1>=0&&cs.charAt(j-1)=='P')) {
						con++;
						char[] ch = s[i].toCharArray();
						ch[j-1]='.';
						s[i]=String.valueOf(ch);
					}
					
					else if((i==n-1&&j+1<m&&cs.charAt(j+1)=='P')) {
						con++;
						char[] ch = s[i].toCharArray();
						ch[j+1]='.';
						s[i]=String.valueOf(ch);
					}
					
					else if((i==n-1&&i-1>=0&&s[i-1].charAt(j)=='P')) {
						con++;
						char[] ch = s[i-1].toCharArray();
						ch[j]='.';
						s[i-1]=String.valueOf(ch);
					}
					
					else if(i==0&&j-1>=0&&cs.charAt(j-1)=='P') {
						con++;
						char[] ch = s[i].toCharArray();
						ch[j-1]='.';
						s[i]=String.valueOf(ch);
					}
					
					else if((i==0&&j+1<m&&cs.charAt(j+1)=='P')) {
						con++;
						char[] ch = s[i].toCharArray();
						ch[j+1]='.';
						s[i]=String.valueOf(ch);
					}
					
					else if((i==0&&i+1<n&&s[i+1].charAt(j)=='P')) {
						con++;
						char[] ch = s[i].toCharArray();
						ch[j]='.';
						s[i]=String.valueOf(ch);
					}
				}
			}
		}
		
		
		
		System.out.println(con);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}