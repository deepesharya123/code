import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class BearandFindingCriminals
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
		int a = in.nextInt();
		
		String s = in.nextLine();
		s=s.replaceAll(" ", "");

		int s1=s.indexOf('1');
		int sl = s.lastIndexOf('1');

		int dis = Math.max(Math.abs(s1-a),Math.abs(sl-a));
		dis--;
//		System.out.println(dis);
		Vector<Integer> v = new Vector<Integer>();
		if(s.charAt(a-1)=='1') {
			v.add(1);
		}
		else
			v.add(0);
		
		int cd = 1;
		while(cd<=s.length()) {
			if((a-1-cd>=0&&s.charAt(a-1-cd)=='1')&&(a-1+cd<s.length()&&s.charAt(a-1+cd)=='1')) {				
				v.add(2);
			}
			else if((a-1-cd<0)&&(a-1+cd<s.length()&&s.charAt(a-1+cd)=='1')||(a-1+cd>=s.length())&&(a-1-cd>=0&&s.charAt(a-1-cd)=='1')) {
				v.add(1);
			}else {
				v.add(0);
			}
			cd++;
		}
		int i;
		long sum = 0;
		for(i=0;i<v.size();i++) {

			sum+=v.get(i);
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}