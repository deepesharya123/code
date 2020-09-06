import java.util.Scanner;

public class ParityAlternatedDeletions {

	static void merge(int[] a ,int l, int m,int u) {
		int n1 = m-l+1;
		int n2= u-m;
		int[] left= new int[n1];
		int[] right= new int[n2];
		
		int i,j;
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(i=0;i<n2;i++)
			right[i]=a[i+m+1];
		i=0;
		j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				a[k]=right[j];
				j++;
			}else {
				a[k]=left[i];
				i++;
			}
			k++;
		}
		
		while(i<n1) {
			a[k]=left[i];
			i++;k++;
		}
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
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
		int[] ar = new int[n];
		int os=0,es=0;
		for(int i=0;i<n;i++) {
			ar[i]=in.nextInt();
			if(ar[i]%2==0) es++;
			else os++;
		}
		int[] e = new int[es];
		int[] o = new int[os];
		int ev=0;
		int ov=0;
		
		for(int i=0;i<n;i++) {
			int nu =ar[i];
			if(nu%2==0) {
				e[ev]=nu;
				ev++;
			}else {
				o[ov]=nu;
				ov++;
			}
		}
		
		sort(e,0,es-1);
		sort(o,0,os-1);
		
		int min = Math.min(es, os);
		if(es==0||os==0) {
			int sum=es+os;
			min=sum;
		}
			if(es>0) {
				if(os>0) {
					for(int i=0;i<min+1;i++) {
//						System.out.println(e[i]+" e");
						if(i<=es-1) {
							e[i]=0;
						}else{
//							System.out.println(i);
							break;
						}
					}
				}else {
					e[0]=0;
				}
			}
		if(os>0) {
			if(es>0) {
				for(int i=0;i<min+1;i++) {
//					System.out.println(o[i]+" o");
					if(i<=os-1) {
						o[i]=0;
					}else {
//						System.out.println(i);
						break;
					}
				}
			}else {
				o[0]=0;
			}
		}
		long ans=0;
		for(int i=0;i<es;i++) {
			ans = ans+e[i];
		}
		for(int i=0;i<os;i++) {
			ans = ans+o[i];
		}
		
		System.out.println(ans);
		
		
	}
	
}
