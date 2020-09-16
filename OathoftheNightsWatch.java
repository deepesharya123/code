import java.util.Scanner;

public class OathoftheNightsWatch {

	static void merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int[] left = new int[n1];
		int[] right= new int[n2];
		
		int i;
		for(i=0;i<n1;i++)
			left[i]=a[l+i];
		
		for(i=0;i<n2;i++)
			right[i]=a[m+1+i];
		
		i=0;
		int k=l,j=0;
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
			j++;
			k++;
		}
		
		
		
		
	}
	
	static void sort(int[] a,int l,int u) {
		if(l<u) {
			int m =l+u;
			m/=2;
			
			sort(a,l,m);
			sort(a,m+1,u);
			merge(a,l,m,u);
			
		}
	}
	
	public static void main(String args[]) {
		Scanner in=  new Scanner(System.in);
		
		int n = in.nextInt();
		int[] ar = new int[n];
		int i;
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		
		
		sort(ar,0,n-1);
		
		int q  =ar[0];
		int p = ar[n-1];
		
		int ans= n;
		int c=0;
		for(i=0;i<n;i++) {
			if(ar[i]==p||ar[i]==q) {
				c++;
			}
		}
		System.out.println(ans-c);
		
		
		
		
		
		
		
		
	}
	
}
