import java.util.Scanner;

public class DistrictsConnection {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] ar = new int[n];
			int j;
			int c=0;
			for(j=0;j<n;j++) {
				ar[j]=in.nextInt();
				if(j>0&&ar[j]==ar[j-1])
					c++;
			}
			
			if(c==n-1)
				System.out.println("NO");
			else{
				int h=1,k;
				System.out.println("YES");
//				for(/++) {
					for(k=h+1;k<=n;k++) {
						if(ar[h-1]!=ar[k-1]) {
							System.out.println(h+" "+k);
//							ar[k-1]=-1;
						}
					}
//				}
				
				int dif,ind =-1;;
				for(j=0;j<n;j++) {
					if(ar[j]!=ar[0]) {
						dif=ar[j];
						ind = j;
						break;
					}
				}
				ind++;
				for(j=2;j<=n;j++) {
					if(ar[j-1]==ar[0]&&j!=ind) {
						System.out.println(j+" "+ind);
					}
				}
				
				
				
				
			}
			
			
			
			
		}
		
		
		
		
		
	}
	
}
