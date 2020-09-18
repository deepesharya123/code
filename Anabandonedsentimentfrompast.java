import java.util.Scanner;

public class Anabandonedsentimentfrompast {

	public static void main(String args[]) {
		Scanner in  = new Scanner(System.in);
		
		int n =in.nextInt();
		int k = in.nextInt();
		
		int[] ar = new int[n];
		int[] b = new int[k];
		
		int i;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		
		for(i=0;i<k;i++){
			b[i]=in.nextInt();
		}
					
		if(k>1) {
			System.out.println("Yes");
		}else {
			int z=-1;
			for(i=0;i<n;i++) {
				if(ar[i]==0) {
					ar[i]=b[0];
				}
			}
			
			boolean yes=false;
			for(i=0;i<n-1;i++) {
				if(ar[i]>ar[i+1]) {
					yes=true;
					break;
				}
			}
			if(yes==false)
				System.out.println("No");
			else 
				System.out.println("Yes");
			
		}
		
		
	}
	
}
