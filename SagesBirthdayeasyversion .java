import java.util.Scanner;

public class SagesBirthdayeasyversion {
	static void merge(int a[],int l,int mid,int r) {
		int n1 = mid-l+1;
		int n2 = r-(mid+1)+1;		// r-mid;
//		System.out.println();
		
		int i;
		int[] left = new int[n1];
		for(i=0;i<n1;i++) {
			left[i]=a[l+i];
//			System.out.println(left[i]+"left");
		}
		int[] right = new int[n2];
		for(i=0;i<n2;i++) {
			right[i]=a[i+mid+1];
//			System.out.println(right[i]+"right");
		}
		int k=l,j=0;
		i=0;
//		System.out.print("ASDF");
//		int[] res= new int[n1+n2];
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				i++;
			}
			else {
				a[k]=right[j];
				j++;
			}
			k++;
		}
//		if(i+1<n1) {
		while(i<n1) {
			a[k]=left[i];
			i++;
			k++;
//		} 
		}
//		if(j+1<n2){
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
//		}
	}
		
	}
//	18002089898
	
//	void reverseArray(int a[]) {
//		int i;
//		int l = a.length;
//		if(l%2==0) {
//			l = l/2;
//			l--;			// if l== 6 then l will become 2
//		}
//		else {
//			l=l/2;
//		}
//		int n = a.length;
//		for(i=0;i<l+1;i++) {
//			int temp = a[i];
//			a[i] = a[n-1-i];
//			a[n-i-1] = temp;
//		}
//	}
//	
	static void sort(int a[],int l,int r) {
		if(l<r) {
			int mid = (l+r)/2;
//			System.out.println(mid+"  mid is good");
			sort(a,l,mid);
			sort(a,mid+1,r);
			merge(a,l,mid,r);
//			System.out.println("I am here");
		}
	}
	
	public static void main(String artg[]) {
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		int i;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		
//		if(n<=2)
//			System.out.println(0);
//		else {
			sort(ar,0,n-1);
//			if(n%2!=0) {
//				System.out.println(n/2);
//			}else {
//				System.out.println((n-2)/2);
//			}
			int c=0;
			int s=0;
			int e=n-1;
			int[] b = new int[n];
			for(int j=0;j<n;j++) {
				if(j%2==0) {
					b[j]=ar[e];
//				System.out.print(ar[e]+" ");
				e--;
				}else {
					b[j]=ar[s];
//					System.out.print(ar[s]+" ");
					s++;
				}
			}
			
			for(int j=1;j<n-1;j++) {
				if(b[j]<b[j+1]&&b[j]<b[j-1])
					c++;
			}
			System.out.println(c);
			for(int j=0;j<n;j++)
				System.out.print(b[j]+" ");
			
//		}
		
	}
	
}
