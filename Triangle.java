import java.util.Scanner;
public class Triangle {

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
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
//		int min = Math.min(a, b)
		
		int[] ar = {a,b,c,d};
		
		sort(ar,0,3);
		
		int min =ar[0];
		int max=ar[3];
		int s0=1;
		if(ar[0]==ar[1])s0++;
		if(ar[0]==ar[2])s0++;
		if(ar[0]==ar[3])s0++;
		
		int s1=1;
		if(ar[1]==ar[2])s1++;
		if(ar[1]==ar[3])s1++;
		
		if(ar[1]+ar[2]>ar[3]||ar[0]+ar[1]>ar[2]||s0>2||s1>2) {
			System.out.println("TRIANGLE");
		}else if(ar[0]+ar[1]==ar[2]||ar[0]+ar[1]==ar[3]||ar[1]+ar[2]==ar[3]) {
			System.out.println("SEGMENT");
		}else {
			System.out.println("IMPOSSIBLE");
		}
		
		
		
		
		
		
	}
	
}
