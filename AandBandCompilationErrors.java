import java.util.Scanner;

public class AandBandCompilationErrors {

	public static void merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int[] left = new int[n1];
		int r []= new int[n2];
		
		int i;
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(i=0;i<n2;i++)
			r[i]=a[i+m+1];
		
		i=0;
		int j=0,k=l;
		while(i<n1&j<n2) {
			if(left[i]<r[j]) {
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
	
	
	public static void sort(int[] a,int l,int u) {
		if(l<u) {
			int m =l+u;
			m/=2;
			
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
			
		}
	}
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] a  =  new int[n];
		int[] b = new int[n-1];
		int[] c = new int[n-2];
		
		int i;
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		
		for(i=0;i<n-1;i++)
			b[i]=in.nextInt();
		
		for(i=0;i<n-2;i++)
			c[i]=in.nextInt();
		
		
		sort(a,0,n-1);
		sort(b,0,n-2);
		sort(c,0,n-3);
		
		int p = -1;
		int q = -1;
		for(i=0;i<n-1;i++) {
			if(a[i]!=b[i]) {
				p=a[i];
				break;
			}
			
		}
		if(p==-1) {
			p=a[n-1];
		}
		for(i=0;i<n-2;i++) {
			if(c[i]!=b[i]) {
					q=b[i];
				break;
			}
		}
		if(q==-1) {
			q=b[n-2];
		}
		
		System.out.println(p);
		System.out.println(q);
		
	}
	
}
