import java.util.*;

public class CormenTheBestFriendOfaMan {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		long c= 0;
		int i;
		int[] ar= new int[n];
		
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			int add=0;

			if(i>0) {
				int nu = ar[i];
				int p = ar[i-1];
				int sk= ar[i]+ar[i-1];
				if(sk<k)	{
					add=k-sk;
				}
			}
			c+=add;
			ar[i]=ar[i]+add;
		}
		System.out.println(c);
		for(i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	
}
