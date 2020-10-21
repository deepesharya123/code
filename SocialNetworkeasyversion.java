import java.util.*;

public class SocialNetworkeasyversion {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		int k = in.nextInt();
		int i;
		int[] ar = new int[n];
		
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		int min = (int) Math.min(n, k);
		Vector<Integer> v = new Vector<>();
		
		for(i=0;i<n;i++) {
			int nu = ar[i];
			if(v.size()<k) {
				if((!v.contains(nu)))
				v.insertElementAt(nu, 0);
			}else if(v.size()==k){
				if(!v.contains(nu)) {
					v.insertElementAt(nu, 0);
					v.removeElementAt(k);
				}
			}
		}
		
		System.out.println(v.size());
		int l = v.size();
		for(i=0;i<l;i++) {
			System.out.print(v.get(i)+" ");
		}
	}
	
	
}
