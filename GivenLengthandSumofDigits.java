//GivenLengthandSumofDigits


		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		//import java.util.Scanner;
		import java.util.*;
		
		public  class t
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
			

			
	public static void merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
				
		int[] left = new int[n1];
		int []right = new int[n2];
				
		int i,j,k;
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(i=0;i<n2;i++)
			right[i]=a[i+m+1];
				
			i=0;
			j=0;
			k=l;
			while(i<n1&&j<n2) {
				if(left[i]<right[j]) {
					a[k]=left[i];
					i++;
				}else {
					a[k]=right[j];
					j++;
				}
					k++;
			}
				
			while(i<n1) {
				a[k]=left[i];
				i++;
				k++;
			}
				
			while(j<n2) {
				a[k]=right[j];
				k++;
				j++;
			}
	}
			
	public static void sort(int[] a,int l,int u) {
		if(l<u) {
			int m = l+((u-l)/2);
//				m/=2;
					
			sort(a,l,m);
			sort(a,m+1,u);
				
			merge(a,l,m,u);
		}
	}
	
			
	public static void main(String[] args){
		FastReader in=new FastReader();
		
//		int t = in.nextInt();
//		while(t>0) {
//			t--;
			int m = in.nextInt(),s=in.nextInt();
			String l= "",ss="";
			int cm = m,cs=s;
			int maxPoss = m*9;
//			System.out.println(maxPoss);
			if(m==1&&s==0) {
				System.out.println(0+" "+0);
			}else {
				if(maxPoss>0&&maxPoss<s) {
					l="";
					ss="";
					l+="-1";
					ss+="-1";
				}else {	// if maxposs >=s
					if(s>0) {
						cm=m;
						cs=s;
						while(cm>0) {
							if(cs>=9) {
								l+="9";
								cs-=9;
							}else {
								l+=cs;
								cs-=cs;
							}
							cm--;
//							System.out.println(l);
						}
					}
				}
				int minPoss=1;
				if(!ss.contains("-1")) {
					if(minPoss>s) {
						l="";
						ss="";
						ss+="-1";
						l+="-1";
					}else {
						cm=m;
						cs=s;
						int pn=0;
						while(cs>9) {
							ss+=9;
							pn++;
							cs-=9;
						}
						int add = s-(pn*9);						
						if(m-pn==1) {
							ss=add+ss;
						}else {
//							System.out.println(cm-pn+" "+add);
							if(add==1) {
								int loop = cm-pn;
								loop--;
								while(loop>0) {
									loop--;
									ss=0+ss;
								}
								ss=1+ss;
							}else if(add>1){
								int loop = cm-pn;
								loop-=2;
								ss=(add-1)+ss;
								while(loop>0) {
									loop--;
									ss=0+ss;
								}
								ss=1+ss;
							}
						}
//						if(cs<=9&&cm>1) {
//							ss+=1;
//							while(cm-2>0) {
//								ss+=0;
//								cm--;
//							}
//							ss+=(s-1);
//						}else {
//							int nine = (cs)/9;
//							int nonNine = cm-nine;
//							while(nine>0) {
//								ss+="9";
//								nine--;
//							}
//
//							int rem = s%9;
//							if(nonNine>1) {
//								if(rem>=1)
//								ss=(rem-1)+ss;
//								while(nonNine-2>0) {
//									nonNine--;
//									ss=0+ss;
//								}
//								ss=1+ss;
//							}else {
//								if(ss.length()!=m)
//								ss=rem+ss;
//							}
//						}
						
						
						
					}
				}
				
				System.out.println(ss+" "+l);
				

			}
			//		}
			
	}
}
		