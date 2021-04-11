//ABPalindrome

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
		
		public static void mul(int a,int b,int re) {
			if(b>0) {
				re+=a;
			b--;
			if(b==0)
				System.out.println(re);
			mul(a,b,re);
		}
	}
		
		public void merge(int[] a,int l,int m,int u) {
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
		
		public void sort(int[] a,int l,int u) {
			if(l<u) {
				int m = l+u-1;
				m/=2;
				
				sort(a,l,m);
				sort(a,m+1,u);
				
				merge(a,l,m,u);
			}
		}
		
	public static void main(String[] args){
		FastReader in=new FastReader();
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			int a = in.nextInt();
			int b = in.nextInt();
			int ca=a;
			int cb = b;
			String s = in.nextLine();
			char[] css = s.toCharArray();
			int re1 = 0,re0=0;
			int pre1 = 0,pre0=0;

			if(a%2!=0) {
				char[] cc = css;
				int mid = a+b;
				mid/=2;
				if(cc[mid]=='?')
				cc[mid]='0';
				pre0++;
			}
			if(b%2!=0) {
				char[] cc = css;
				int mid = a+b;
				mid/=2;
				if(cc[mid]=='?')
				cc[mid]='1';
				pre1++;
//				s=String.valueOf(cc);
			}
			
			for(int i=0;i<s.length();i++) {
				int last = ca+cb-i-1;
				int check = 0;
				if((last<s.length())&&css[i]!='?'&&css[a+b-i-1]=='?')
					check++;
				
				if((last<s.length())&&(css[i]=='?'&&css[last]!='?'))
					check++;
//				System.out.println(check);
				if(check>0) {
					char[] ch = css;
					char aa = ch[i];
					char bb = ch[last];
					if(aa!='?') {
						ch[last]=aa;
						if(aa=='1')
							re1--;
						else
							re0--;
					}else {
						ch[i]=bb;
						if(bb=='1')
							re1--;
						else
							re0--;
					}
//					s=String.valueOf(ch);
				}
				
				if(css[i]=='0')
					pre0++;
				else if(css[i]=='1')
					pre1++;
				
			}
			re0=a-pre0;
			re1=b-pre1;
			int lim= a+b;
			if(lim%2==0) {
				lim/=2;
			}else {
				lim/=2;
				lim++;
			}
			int pal=1,con1=0,con0=0;
			for(int i=0;i<s.length();i++) {
				if(css[i]=='?'&&css[a+b-i-1]=='?') {
					if(re0>0) {
						char[] cs = css;
						cs[i]='0';
						cs[a+b-i-1]='0';
						re0-=2;
//						s=String.valueOf(cs);
					}else {
						char[] cs = css;
						cs[i]='1';
						cs[a+b-i-1]='1';
						re1-=2;
//						s=String.valueOf(cs);
					}
				}else if((css[i]=='?'&&css[a+b-i-1]!='?')||(css[i]!='?'&&css[a+b-i-1]=='?')){
						
					char c = css[i];
					char cc= css[a+b-i-1];
					char[] cs = css;
					if(c!='?') {
						cs[a+b-i-1]=c;
						if(c=='0')
							re0--;
						else
							re1--;
					}else {
						cs[i]=cc;
						if(cc=='0')
							re0--;
						else
							re1--;
					}
//					s=String.valueOf(cs);
					
				}
				
				if(i<lim) {
					if(css[i]!=css[a+b-i-1]) {
						pal=0;
						break;
					}else {
						if(css[i]=='1') {
							con1++;
							if(i!=a+b-i-1)
								con1++;
//							else
//								con1+=2;
						}
						else {
							con0++;
							if(i!=a+b-i-1)
								con0++;
//							else
//								con0+=2;
						}
					}
				}
			}
			s=String.valueOf(css);
//			System.out.println(s);
			if(a%2!=0&&b%2!=0)
				pal=0;
//			System.out.println("-1 "+pal+" "+con0+" "+con1+" "+s);
			if(pal==0||con0!=ca||con1!=cb)
				System.out.println("-1");
//				System.out.println("-1 "+pal+" "+con0+" "+con1+" "+s);
			else
				System.out.println(s);
			
			
			
			
		}
		
		
		
	}
		
}