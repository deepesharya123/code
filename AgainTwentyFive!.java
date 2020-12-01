
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class AgainTwentyFive!
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

//		int t = in.nextInt();
		String s = in.nextLine();
		System.out.println(25);
//		int[] isSum = new int[1000433];
//		long s = 0;
//		for(int i=1;i<=1000001;i++) {
//			s+=i;
//			if(s<=1000445) {
//				int cs =(int) s;
//				isSum[cs]=i;
////				System.out.println(isSum[cs]+" "+cs+" "+i);
//			}else {
//				break;
//			}
//			
//		}
//		
//		while(t>0) {
//			t--;
//			int x = in.nextInt();
//			if(isSum[x]>0) {
//				System.out.println(isSum[x]);
//			}else {
//				int post = 1;
//				int j;
//				int tn  = post;
//				for(j=x+1;j<1000441;j++) {
//					if(isSum[j]>0) {
//						post+=isSum[j];
//						tn = j;
//						break;
//					}
//				}
//				
//				int dif = tn-x;
//				if(dif%2==0) {
//					System.out.println(isSum[tn]);
//				}else {
//					System.out.println(post);
//				}
//				
//			}
//			
//			
//		}
//		
//		
//		System.out.println(1000000-998991);
		
		
		

        
	}
	
}