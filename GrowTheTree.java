import java.util.Scanner;

public class GrowTheTree {

	static void  merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		int i;
		int[] left= new int[n1];
		int[] r = new int[n2];
		for(i=0;i<n1;i++) {
			left[i]=a[i+l];
		}
		for(i=0;i<n2;i++) {
			r[i]=a[i+m+1];
		}
		
		int j=0;
		i=0;
		int k=l;
		
		while(i<n1&&j<n2) {
		if(left[i]<r[j])	{
			a[k]=left[i];
			i++;
		}else {
			a[k]=r[j];
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
			a[k]=r[j];
			j++;
			k++;
		}
		
		
	}
	
	static void sort(int[] a,int l,int u) {
		if(l<u) {
			int m = (u+l);
			m/=2;
			
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
		}
	}
	
	
	public static void main(String aRG[]) {
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		int[] ar= new int[n];
		int i;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		
		sort(ar,0,n-1);
		
		long b = 0;
		long  p=0;
		int h = n/2;
		for(i=0;i<h;i++) {
			p+=ar[i];
		}
		i=h;
		for(i=h;i<n;i++) {
			b+=ar[i];
		}
		
		long ans = b*b;
		ans=ans+(p*p);
		System.out.println(ans);
		
	
	}
	
}
