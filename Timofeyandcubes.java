import java.util.Scanner;

public class Timofeyandcubes {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n =in.nextInt();
		int[] ar= new int[n];
		int i;
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		
		int k=n-1;
		int comp = n/2;
//		System.out.println(comp);
		for(i=0;i<n;i++) {
			if((1+i)%2!=0&&i<comp) {
//				System.out.println(i);
				int temp = ar[i];
				ar[i]=ar[k];
				ar[k]=temp;
				k-=2;
//				comp--;
				
			}
		}
		
		
		
		
		for(i=0;i<n;i++)
			System.out.print(ar[i]+" ");
		
		
		
	}
	
}
