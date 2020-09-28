import java.util.Scanner;

public class div663a {

	static void merge(int[] a,int l,int m,int u) {
		int n1= m-l+1;
		int n2 = u-m;
		
		int i,j;
		int[] left = new int[n1];
		int[] ri = new int[n2];
		
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(i=0;i<n2;i++)
			ri[i]=a[i+m+1];
		
		i=0;
		j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(left[i]<ri[j]) {
				a[k]=left[i];
				i++;
			}else {
				a[k]=ri[j];
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
			a[k]=ri[j];
			j++;k++;
		}
		
		
	}

	
	static void sort(int[] a,int l,int u) {
		if(l<u) {
			int m  = u+l;
			m/=2;
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
		}
	}
	
	
	public static void main(String args[]) {
		Scanner in = new  Scanner(System.in);

		int t = in .nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int x  = in.nextInt();
			
			
			if(n<3)
				System.out.println(1);
			else {
				int d = n-2;
				int cd =d;
				d/=x;
				if(cd%x==0)
					d++;
				else
					d+=2;
				System.out.println(d);
			}
			
			
		}
		
	}
	
}