import java.util.Scanner;

public class PashaandHamsters {

	public static void main(String args[]) {
		Scanner in=  new Scanner(System.in);
		
		
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int[] res= new int[n+1];
		int[] ar= new int[a];
		int[] br = new int[b];
		int i;
		for(i=0;i<a;i++) {
			ar[i]=in.nextInt();
			res[ar[i]]=1;
		}
		for(i=0;i<b;i++) {
			br[i]=in.nextInt();
			res[br[i]]=2;
		}
		for(i=1;i<n+1;i++) {
			System.out.print(res[i]+" ");
		}
		
		
		
		
		
	}
	
}
