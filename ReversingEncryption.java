import java.util.Scanner;

public class ReversingEncryption {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int  n =in.nextInt();
		
		in.nextLine();
		String s= in.nextLine();
		char[] c = new char[n];
		c=s.toCharArray();
		
		int[] ar = new int[n];
		int i;
		i=1;
		int k =0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				ar[k]=i;
				k++;
			}
		}
		int sar = k--;
//		System.out.println(sar);
//		System.out.println(k);
		k=1;
		while(k<sar) {
			int nu = ar[k];
			k++;
			int h=nu/2;
			if(nu%2==0)
				h--;
			int j=0;
			nu--;
			while(j<=h) {
//				System.out.println(c[j]);
//				System.out.println(c[nu-j]);
				char a=(char) c[j];
				c[j]=c[nu-j];
				c[nu-j]=a;
				//				char b = c[nu-j];
//				c[j]=b;
//				c[nu-j]=a;
				j++;
			}
			
		}
		
		for(i=0;i<n;i++)
			System.out.print(c[i]);
		
		
		
		
	}
	
}
