import java.util.Scanner;

public class Pillars {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i;
		int[] ar= new int[n];
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		
		
		int d = n/2;
//		d--;
//		if(n%2!=0)
//			d++;
//		
		int c=1;
		if(n%2!=0)
			c=0;
		int as = ar[0];
		for(i=0;i<n;i++) {
			if(as<=ar[i]) {
				as=ar[i];
				d=i;
			}
		}
//		System.out.println(d);
		boolean yes = true;
		for(i=1;i<n;i++) {
			if(i<=d) {
				if(ar[i]-ar[i-1]>0) {
					c++;
				}
				else {
					yes=false;
					break;
				}
			}else {
				if(ar[i]-ar[i-1]<0) {
					c++;
				}else {
					yes=false;
					break;
				}
			}
		}
//		System.out.println(c);
		if(yes)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
	}
	
}
