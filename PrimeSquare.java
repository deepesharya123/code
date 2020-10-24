import java.util.Scanner;

public class div$2$678 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			
			int j,k;
			
			for(j=0;j<n;j++) {
				
				for(k=0;k<n;k++) {
					if(j<=n-2) {
						if(k==j||k==j+1)
							System.out.print(1+" ");
						else
							System.out.print(0+" ");
					}else {
						if(k==0||k==n-1)
							System.out.print(1+" ");
						else
							System.out.print(0+" ");
					}
				
				
				}
				System.out.println();
				
			}
			
			
		}
		
		
		
	}
	
}
	