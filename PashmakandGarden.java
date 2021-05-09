//PashmakandGarden

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
//	import java.
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
				int m = l+u-1;
				m/=2;
				
				sort(a,l,m);
				sort(a,m+1,u);
				
				merge(a,l,m,u);
			}
		}
	
		
	public static void main(String[] args){
		FastReader in=new FastReader();

		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int cg = 0;
		int[] ar = new int[4];
		ar[0]=x1;ar[1]=x2;ar[2]=y1;ar[3]=y2;
		sort(ar,0,3);
		for(int i=1;i<4;i++) {
			if(ar[i]==ar[i-1])
				cg++;
		}
		if(x1==x2||y1==y2) {
			double po = 1;
			po/=2;
			int x3,x4,y3,y4;
			int d = (int) Math.pow(( ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)) ),po);
			if(y1==y2) {
				x3 = x1;
				y3 = y1+d;
				x4 = x2;
				y4 = y2+d;
			}else {
				x3 = x1+d;
				y3 = y1;
				x4 = x2+d;
				y4 = y2;	
			}
			System.out.println(x3+" "+y3+" "+x4+" "+y4);
		}else {
			double po = 1;
			po/=2;
			int x3,x4,y3,y4;
			int mnx = Math.min(x1, x2);
			int mxx = Math.max(x1, x2);
			int mny = Math.min(y1, y2);
			int mxy = Math.max(y1, y2);
			int cx1=x1,cx2=x2,cy1=y1,cy2=y2;
			x1=mnx;
			x2=mxx;
			if(x1!=cx1)	{
				y1=cy2;
				y2=cy1;
			}
			
			int diasq = ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
//			double ds = Math.pow(( ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)) ),po);
//			int dia = (int) Math.pow(ds, po);
			diasq/=2;
			int psq= (int) Math.pow(diasq, po);
			if(psq*psq==diasq) {
				boolean right = false;
//				System.out.println(x1+" "+x2+" "+y1+" "+y2+" "+psq+" "+diasq);
				if((x1>x2&&y1>y2)||(x2>x1&&y2>y1)) {
					right=true;
				}
//				System.out.println(right+" "+ psq);
				if(right) {
					x3 = x1;
					x4 = x2;
					y3 = y1+psq;
					y4 = y2-psq;
				}else {
					x3 = x1;
					x4 = x2;
					y3 = y1-psq;
					y4 = y2+psq;
				}
				boolean para =false;
				int co = 0;
				ar[0]=x3;ar[1]=x4;ar[2]=y3;ar[3]=y4;
				sort(ar,0,3);
				for(int i=1;i<4;i++) {
					if(ar[i]==ar[i-1])
						co++;
				}
//				System.out.println(co+" "+cg);
				if(co==cg) para=true;
				if(para)
					System.out.println(x3+" "+y3+" "+x4+" "+y4);
				else
					System.out.println(-1);
				
			}else {
				System.out.println(-1);
			}	
		}
		
		
		
		
	}
}