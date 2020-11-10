import java.util.Scanner;

public class MahmoudandaTriangle {

	static void merge(int[] a,int l,int m ,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int i;
		int[] le = new int[n1];
		int right[]=new int[n2];
		for(i=0;i<n1;i++)
			le[i]=a[i+l];
		for(i=0;i<n2;i++)
			right[i]=a[i+m+1];
		
		int j=0;
		i=0;
		int k =l;
		while(i<n1&&j<n2) {
			if(le[i]<right[j]) {
				a[k]=le[i];
				i++;
			}else {
				a[k]=right[j];
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
			a[k]=right[j];
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
		Scanner in=  new Scanner(System.in);
		
		int n = in.nextInt();
		int[] ar = new int[n];
		int i;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		
		int yes=-1;
		sort(ar,0,n-1);
//		int a= ar[n-1];
//		int b = ar[n-2];
//		int c = ar[n-3];
		
		int s=0;
		for(i=0;i<n-1;i++)
			if(ar[i]==ar[i+1]) {
				s++;
				break;
			}
		
		for(i=0;i<n-2;i++) {
			int a = ar[i];
			int b = ar[i+1];
			int c = ar[i+2];
		if(a+b>c&&a+c>b&&b+c>a) {
			yes=1;
			break;
		}
		
		}
		if(yes==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	
		
	}
	
}
