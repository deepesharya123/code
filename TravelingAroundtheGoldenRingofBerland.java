import java.util.*;

public class TravelingAroundtheGoldenRingofBerland {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] ar = new int[n];
		
		Vector<Integer> v = new Vector<Integer>();
		
		int i;
		for(i=0;i<n;i++) {
			int nu = in.nextInt();
			ar[i]=nu;
			v.add(nu);
//			System.out.println(nu);
		}
		
		Arrays.sort(ar);
		
		int lar = ar[n-1];
		int ind = v.lastIndexOf(lar);
		ind++;
		long la= lar;
		long visit = (n)*(la-1);
		visit+=ind;
		
		System.out.println(visit);
		
		
	}
	
	
}
