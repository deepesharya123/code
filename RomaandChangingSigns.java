
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class RomaandChangingSigns
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
        int c = 0;
        int t = in.nextInt();
        
        Vector<Integer> vp= new Vector<Integer>();
        Vector<Integer> v= new Vector<Integer>();
        
        int i,ans=0;
        long sum = 0;
        int nn = 0,p=0,z=0;
        long sp = 0,so=0,spp=0;
        for(i=0;i<n;i++) {
        	v.add(in.nextInt());
        	if(v.get(i)>0)
        		p++;
        	else if(v.get(i)<0)
        		nn++;
        	else
        		z++;
        	so+=v.get(i);
        	vp.add(Math.abs(v.get(i)));
        	sp+=vp.get(i);
        	if(v.get(i)>0)
        		spp+=v.get(i);
        }
        Collections.sort(vp);
        Collections.sort(v);
        int dif=0;
        if(t>nn)
        	dif=t-nn;
        if(dif%2==0)
        	dif=0;
        if(nn==0) {
        	if(z>0||t%2==0) {
        		System.out.println(sp);
        	}else {
        		long nu = v.get(0);
//        		System.out.println(so+" "+nu);
        		so-=nu;
        		so-=nu;
        		System.out.println(so);
        	}
        }else {
        	long gs=0;
        	int ind = 0;
        	i=0;
        	while(nn>0&&t>0) {
        		long nu = v.get(i);
        		gs+=Math.abs(nu);
        		nn--;
        		t--;
        		i++;
        	}
//        	System.out.println(gs);
        	int left=t;
//        	left+=dif;/
//        	if(left%2==0)
        	so+=gs+gs;
//        	System.out.println(so);
//        	System.out.println(left+" "+t);
        	if(left==0)
        		System.out.println(so);
        	else if(left%2==0)
        		System.out.println(so);
        	else {
        		long nua = vp.get(0);
//        		System.out.println(nua);
        		so-=nua;
        		so-=nua;
        		System.out.println(so);
        	}
        	
        	
        	
        	
        	
        }
        
        
        
        
	}
	
}