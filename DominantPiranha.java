import java.util.Scanner;

public class YetAnotherBookshelf {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
			
		int t= in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			
			int n = in.nextInt();
			int []ar = new int[n];
			int j;
			int c=0;
			int max=-1,max2=-1;
			int ind=-1;
			int ind2=-1;
			for(j=0;j<n;j++) {
				ar[j]=in.nextInt();
				if(j>0&&ar[j]==ar[j-1])
					c++;
				if(max<ar[j]) {
					max=ar[j];
				}
				
				
				
			}
			if(c==n-1) {
				System.out.println(-1);
			}else {
				for(j=0;j<n;j++) {
					if(ar[j]==max&&j-1>=0&&((ar[j]>ar[j-1]))) {
						ind=j;
						break;
					}
					if(ar[j]==max&&j+1<n&&(ar[j]>ar[j+1])) {
						ind=j;
						break;
					}
				}
				
				System.out.println(ind+1);
				
			}
			
			
		}
		
	
	}
	
}
