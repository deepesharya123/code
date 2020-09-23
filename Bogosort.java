import java.util.Scanner;

public class Bogosort {

	static void merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int[] le = new int[n1];
		int r[] = new int[n2];
		int i,j;
		for(i=0;i<n1;i++)
			le[i]=a[i+l];
		for(i=0;i<n2;i++)
			r[i]=a[i+m+1];
		
		i=0;
		j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(le[i]<r[j]) {
				a[k] =le[i];
				i++;
			}else {
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			a[k]=le[i];
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
		int m = u+l;
		m/=2;
		
		sort(a,l,m);
		sort(a,m+1,u);
		
		merge(a,l,m,u);
		}
	}
	
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] ar = new int[n];
			
			int j;
			for(j=0;j<n;j++)
				ar[j]=in.nextInt();
			
			
			sort(ar,0,n-1);
			
			for(j=n-1;j>=0;j--)
				System.out.print(ar[j]+" ");
			
			System.out.println();
			
		}
		
	}
	
}
