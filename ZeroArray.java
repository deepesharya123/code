import java.util.*;

public class ZeroArray {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		int i;
		int n= in.nextInt();
		long s = 0;
		for(i=0;i<n;i++){
			int nu = in.nextInt();
			v.add(nu);
			s+=nu;
		}
		Collections.sort(v);
		
		int c= 0;
		if(s%2!=0) {
			System.out.println("NO");
		}else {
			boolean p =true;
			long h = s/2;
			for(i=0;i<v.size();i++) {
				if(v.get(i)>h) {
					p=false;
				}
			}
			
			if(p)
				System.out.println("YES");
			else
				System.out.println("NO");
		
		} 
		
		
	}
	
}
