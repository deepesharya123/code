import java.util.*;

public class SettlersTraining {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n =in.nextInt();
		int k = in.nextInt();
		Vector<Integer> v = new Vector<Integer>();

		int[] ar = new int[k+1];
		int i;
		int c = 0;
		for(i=0;i<n;i++) {
			int nu = in.nextInt();
			v.add(nu);
			ar[nu]++;
		}
		
		boolean rn = true;
		while(rn) {
			int r = 0;
//			for(i=1;i<k;i++){
//				if(ar[i]!=0) {
//					ar[i]--;
//					ar[i+1]++;
//					r=-1;
//				}
//			}
			for(i=0;i<n;i++) {
				int  nu = v.get(i);
				int p = v.get(i);
				if(i-1>=0) {
					p=v.get(i-1);
				}
				if(p<nu&&p!=k) {
					int pn = p+1;
					v.remove(i-1);
					v.insertElementAt(pn, i-1);
					r=-1;
				}
				if(i==n-1&&v.get(i)!=k) {
					int pn= v.get(i);
					pn++;
					v.remove(i);
					v.insertElementAt(pn, i);	
					r=-1;
				}
				
			}
//			System.out.println(v+" "+c);
//			c++;
//			System.out.print/ln(c);
			if(r==0) {
				rn = false;
			}else
				c++;
		}
		
		
		
		System.out.println(c);
		
	}
	
}
