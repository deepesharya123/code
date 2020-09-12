import java.util.Scanner;

public class BearandFiveCards {
	
	static void merge(int[] a,int l,int m,int u) {
		
		int n1 = m-l+1;
		int n2 = u-m;
		
		int[] le = new int[n1];
		int[] ri = new int[n2];
		int i;
		for(i=0;i<n1;i++)
			le[i]=a[l+i];
		
		for(i=0;i<n1;i++)
			ri[i]=a[m+1+i];
		i=0;
		int j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(le[i]<ri[j]) {
				a[k]=le[i];
				i++;
			}else {
				a[k]=ri[j];
				j++;
			}k++;
		}
		
		while(i<n1) {
			a[k]=le[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=ri[j];
			j++;
			k++;
		}
		
	}
	
	static void sort(int[] a ,int l,int u)
	{
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
//		int[] ar = new int[5];
//		
//		int i;
//		int ma=0;
//		for(i=0;i<5;i++) {
//			ar[i]=in.nextInt();
//			if(i>0&&ar[i]==ar[i-1])
//				ma++;
//		}
//		sort(ar,0,4);
//		int sum=0;
//		for(i=0;i<5;i++) {
////			ar[i]=in.nextInt();
//			if(i>0&&ar[i]==ar[i-1])
//				ma++;
//		}
//		int sa=0;
//		for(i=4;i>=0;i--) {
//			
//		}
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		int[] ar = new int[101];
		ar[a]++;
		ar[b]++;
		ar[c]++;
		ar[d]++;
		ar[e]++;
		int i,n =101;
		int sum = a+b+c+d+e;
		int[] min = new int[n];
		for(i=n-1;i>=0;i--) {
//			System.out.println(ar[i]+ " "+ i);
			if(ar[i]>=2) {
				if(ar[i]>=3) {
					min[i]=3*i;
//					sum=sum-3*i;
				}else {
					min[i]=2*i;
//					sum=sum-2*i;
				}
			}
		}
		int mn = 0;
		for(i=0;i<n;i++) {
			if(min[i]!=0) {
//				System.out.println(min[i]);
				if(min[i]>mn)
					mn=min[i];
			}
		}
		System.out.println(sum-mn);
		
	}
	
}
