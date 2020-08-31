import java.util.Scanner;

public class Shooting {

	void merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		int i,j;
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(i=0;i<n2;i++)
			right[i]=a[m+1+i];
		
		i=0;
		j=0;
		int k=l;
		
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				a[k]=right[j];
				j++;
			}
			else {
				a[k]=left[i];
				i++;
			}
			k++;
		}
		
		while(i<n1) {
			a[k]=left[i];
			k++;
			i++;
		}
		
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
		
		
		
	}
	
	void sort(int[] a,int l,int u) {
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
		
		int  n = in.nextInt();
		int[] ar= new int[n];
		int[] a= new int[n];
		
		int i=0;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			a[i]=ar[i];
			}
		
		Shooting ob =new Shooting();
		ob.sort(ar, 0, n-1);
		
		int sum =0;
		int j;
		int hu=0;
		int[] res=new int[n];
		for(j=0;j<n;j++) {
			int cp = ar[j];
			sum+=(ar[j]*j)+1;
			
			int k=0;
			
			for(k=0;k<n;k++) {
				if(a[k]==cp) {
					a[k]=-1;
					res[hu]=k+1;
					hu++;
					break;
				}
			}
			
		}
		System.out.println(sum);
		for(j=0;j<n;j++)
			System.out.print(res[j]+" ");
		
		
	}
	
}
