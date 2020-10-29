import java.util.Scanner;

public class TwoTeamsComposing {

	public static void main(String arg[]) {
		Scanner in =new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int j,n;
			n=in.nextInt();
			int[] ar = new int[n];
			int la = -1;
			int[] c = new int[200001];
			int dif = 0;
			for(j=0;j<n;j++) {
				int un = in.nextInt();
				ar[j]= un;
				if(c[un]==0) dif++;
				c[un]++;

				if(la<un)
					la=un;
			}
			int max=0;
			for(j=0;j<la+1;j++){
				if(c[j]!=0&&c[j]>max) {
					max = c[j];
				}
			}
			
			if(n==1)
				System.out.println(0);
			else {
				if(dif==max)
					System.out.println(dif-1);
				else {
					System.out.println(Math.min(dif, max));
				}
			}
		}
		
	}
	
}
