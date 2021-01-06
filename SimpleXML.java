
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.util.Scanner;
	import java.util.*;
	
	public  class SimpleXML
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
			
			String s = in.nextLine();
			String cs=  "  ";
			String cc = s;
			cc=cc.replaceAll("<", "");
			cc=cc.replaceAll(">", "");
			cc=cc.replaceAll("/", "");
			int len =cc.length();
//			System.out.println(len);
			int c = 0;
			Vector<Character> ch = new Vector<Character>();
			int i;
			int[][] ar =new int[len][3];
			int op = 0,cl=0;
			ar[0][0]=0;
			ar[0][1]=0;		// 0 is for open , 1 is for close
			for(i=0;i<s.length();i++) {
				if(s.charAt(i)!='>'&&s.charAt(i)!='<') {
					ch.add(s.charAt(i));	
				}
			}
			int id = 1;
//			System.out.println(ch);
			Vector<Integer> close = new Vector<Integer>();
			int h=  0;
			for(i=0;i<ch.size();i++) {
				char chh = ch.get(i);
				if(chh!='/') {
					int con = 0;
					op=0;cl=0;
					int j;
					int lm = i-1;
					if(i-1>=0&&ch.get(i-1)=='/') {
						lm--;
					}
//					System.out.println(lm);
					for(j=0;j<lm+1;j++) {
						if(ch.get(j)=='/') {
							cl++;
							j+=1;
						}else {
							op++;
						}
					}
					ar[h][1]=cl;
					ar[h][0]=op;
					h++;
					if(i-1>=0&&ch.get(i-1)=='/') {
						ar[h-1][2]=1;
					}
				}
			}
			cs="  ";
			int k = 0;
			for(i=0;i<ch.size();i++) {
				if(ch.get(i)!='/') {
					int nu = ar[k][0]-ar[k][1]-ar[k][2];
					String ccs= "";
					while(nu!=0) {
						ccs+="  ";
						nu--;
					}
					if(ar[k][2]==1) {
						System.out.println(ccs+"</"+ch.get(i)+">");
					}else {
						System.out.println(ccs+"<"+ch.get(i)+">");
					}
					k++;
					
					
					
				}
			}
			
			
			
			

				
		}
		
	}