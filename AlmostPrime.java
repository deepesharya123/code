import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class t
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
		int[] ar = new int[3000];
		int i;
		for(i=0;i<3000;i++) {
			ar[i]=1;
		}
		ar[0]=ar[1]=0;
		for(i=2;i*i<3000;i++) {
			if(ar[i]==1) {
				for(int j = i*i;j<3000;j+=i) {
					ar[j]=0;
				}
			}
		}
		for(i=0;i<3000;i++)
			if(ar[i]==1&&ar[i]>1500)
				System.out.print(i+" ");
		
//		6,10,12,14,15,18,20,21
//		1511
		
		int[] t =  new int[3001];
		t[0]=t[1]=0;
		for(i=2;i<3001;i++) {
			int j=2;
			int c=0;
			for(j=2;j*2<=i;j++) {
//				System.out.println();
				if(i%j==0&&ar[j]==1) {
					c++;
				}
			}
			if(c==2) {
				t[i]=1;
			}
		}
		int con = 0;
		for(i=2;i<=n;i++) {
			con+=t[i];
		}
		System.out.println(con);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}