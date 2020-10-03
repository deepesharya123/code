import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class GettinganA {

	static void merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int i;
		int[] lef = new int[n1];
		int[] r=new int[n2];
		
		
		for(i=0;i<n1;i++)
			lef[i]=a[i+l];
		for(i=0;i<n2;i++)
			r[i]=a[i+m+1];
		
		int j=0,k=l;
		i=0;
		while(i<n1&&j<n2) {
			if(lef[i]<r[j]) {
				a[k]=lef[i];
				i++;
			}else {
				a[k]=r[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			a[k]=lef[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			a[k]=r[j];
			k++;
			j++;
		}
		
		
		
		
	}
	
	static void sort(int[] a,int l,int u) {
		if(l<u) {
			int m = u+l;
			m/=2;
			
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
			
		}
	}
	
	public static void main(String args[]) throws Exception{
//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(is);	
		Scanner br = new Scanner(System.in);

		int n = br.nextInt();
//		int n = Integer.parseInt(br.readLine());
		int[] ar= new int[n];
		
		int i;
		int s=0;
		for(i=0;i<n;i++) {
			ar[i]=br.nextInt();
//			ar[i]=Integer.parseInt(br.readLine());
			s+=ar[i];
		}
		sort(ar,0,n-1);
		double d = (double)s;
		d=d/n;
		if(d>=4.5)
			System.out.println("0");
		else {
		
			int c=0;
			for(i=0;i<n;i++) {
				int dif= 5-ar[i];
				s+=dif;
				double cs=s;
				double ch = cs/n;
				if(ch>=4.5) {
					c++;
					break;
				}else
					c++;
			
			}
			
			System.out.println(c);
			
		}
		
		
		
	}
	
}
