import java.util.Scanner;

public class DoubleMatrix {

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		int m = in.nextInt();
		int i,j;
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				a[i][j]=in.nextInt();
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				b[i][j]=in.nextInt();
			}
		}
		int yes=1;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				int n1 = a[i][j];
				int n2 = b[i][j];
				a[i][j]=Math.min(n1, n2);
				b[i][j]=Math.max(n1, n2);
				
				if(i==0) {
					if(j>0) {
						if(a[i][j]-a[i][j-1]<=0||b[i][j]-b[i][j-1]<=0) {
							yes=0;
							i=j=100;
							break;
						}
					}
				}else {
					if(i<n-1) {
						if(j>0) {
							if(a[i][j]-a[i][j-1]<=0||b[i][j]-b[i][j-1]<=0) {
								yes=0;
								i=j=100;
								break;
							}	
							if(a[i][j]-a[i-1][j]<=0||b[i][j]-b[i-1][j]<=0) {
								yes=0;
								i=j=100;
								break;
							}	
						}else {
//							
							if(a[i][j]-a[i-1][j]<=0||b[i][j]-b[i-1][j]<=0) {
								yes=0;
								i=j=100;
								break;
							}	
							
						}
					}else {
						if(a[i][j]-a[i-1][j]<=0||b[i][j]-b[i-1][j]<=0) {
							yes=0;
							i=j=2100;
							break;
						}else if(j>0&&(a[i][j]-a[i][j-1]<=0||b[i][j]-b[i][j-1]<=0)) {
							yes=0;
							i=j=123;
							break;
						}
					}
				}
			}
		}
		
		
		if(yes==0)
			System.out.println("Impossible");
		else
			System.out.println("Possible");
		
		
		
	}
	
	
}
