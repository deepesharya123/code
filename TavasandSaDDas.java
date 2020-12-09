import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class TavasandSaDDas

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
		int n = Integer.parseInt(s);
		int an=2;
		int[] ar = new int[10];
		int i=1;
		
		for(i=1;i<=9;i++) {
			ar[i]=an;
			an+= Math.pow(2,i+1);
//			System.out.println(ar[i]);
		}
//		System.out.println(an);
		String[] as = new String[1025];
		as[0]="4";
		as[1]="7";
		int ind = 0;
		int k = 2;
//		0 to 510
		for(i=2;i<=9;i++) {
			int can =(int) Math.pow(2, i);
//			System.out.println(can+" "+ar[i]);
			int ha= can/2;
			
			String f = "4";
			int con = ind;
			while(ha>0) {
				f+=as[con];
				ha--;
				as[k]=f;
				k++;
				con++;
				f="4";
			}
			con=ind;
			f="7";
			ha=can/2;
			while(ha>0) {
				f+=as[con];
				ha--;
				as[k]=f;
				k++;
				con++;
				f="7";
			}
			ind=con;
			
		}
		
		for(i=1;i<=1022;i++) {
//			System.out.println(Integer.parseInt(as[i-1]));
			if(Integer.parseInt(as[i-1])==n)
				System.out.println(i);
		}
		
		
		
		
	}
	
}