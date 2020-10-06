import java.util.Scanner;

public class PolycarpTraining {

	static void merge(int[] a,int l,int m,int u) {
		int n1= m-l+1;
		int n2 = u-m;
		int[] left = new int[n1];
		int [] r = new int[n2];
		
		int i;
		
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(i=0;i<n2;i++)
			r[i]=a[i+m+1];
		
		i=0;
		int k=l,j=0;
		while(i<n1&&j<n2) {
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
			k++;
			j++;
		}
		
		
	}
	
	static void sort(int[] a,int l,int u) {
		if(l<u) {
			int m = l+u;
			m/=2;
			
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
			
		}
	}
	
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i;
		int[] ar = new int[n];
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		
		
		sort(ar,0,n-1);
		
		int j=0;
		int sm=ar[0];
		int[] d = new int[ar[n-1]+1];
		int c=0;
		
		for(i=0;i<n;i++) {
			if(ar[i]==sm)
				j=i;
			else
				break;
		}
		
		int s=1;
		for(i=0;i<n;i++) {
			if(ar[i]>=s) {
				c++;
				s++;
			}
		}
		
		
		
		System.out.println(c);
		
	}
	
}
