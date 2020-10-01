import java.util.Scanner;

public class LunarNewYearandNumberDivision {

	static void merge(int[] a,int l,int m,int u) {
		int n1= m-l+1;
		int n2 = u-m;
		
		int i;
		int[] left  = new int[n1];
		int[] r = new int[n2];
		
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		
		for(i=0;i<n2;i++)
			r[i]=a[i+m+1];
		
		int j=0;
		i=0;
		int k=l;
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
		int n = in.nextInt();
		int i;
		int[] a= new int[n];
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		sort(a,0,n-1);
		
		long s=0;
		for(i=0;i<n/2;i++) {
			long su = 0;
			su+=a[i];
			su+=a[n-i-1];
			
			s+=Math.pow(su, 2);
		}
		
		System.out.println(s);
	}
	
}
