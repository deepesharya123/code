import java.util.Scanner;

public class PresentfromLena {

	public static void main(String argsd[]) {
		
		Scanner in = new Scanner(System.in);
		int  t = in.nextInt();
		
		String[] s = new String[10];
		int i;
		s[0]="0";
//		System.out.println(s[0]);/
		for(i=1;i<10;i++) {
		 
			String sc =s[i-1];

			String sea = "";
			int ind = i-1;
			sea+=ind;
			
			int im = s[i-1].indexOf(sea);
			String c = sc.substring(0, im+1);
			s[i]= c+" "+i;
			String ne = sc.substring(im);
			s[i]+=" "+ne;
			
//			System.out.println(s[i]);
		}
		
//        0					6
//      0 1 0				4
//    0 1 2 1 0				2
//  0 1 2 3 2 1 0			0
//    0 1 2 1 0				2
//      0 1 0				4
//        0					6
		
			int loop = 2*t+1;

			String sg = " ";
			for(i=0;i<loop;i++) {
				int j=i;
				if(j>t) {
					int dif = i-t;
					j=t-dif;
				}
				if(j<=t) {
					String ns = "";
					int ct = 0;
					while(ct!=(2*(t-j))){
						ns+=" ";
						ct++;
					}
					System.out.println(ns+s[j]);
					
					
				}
				
			}
		
//	      0
//	    0 1 0
//	  0 1 2 1 0
//	    0 1 0
//	      0

		
		
		
		
	}
	
}
