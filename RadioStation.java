import java.util.Scanner;

public class RadioStation {

	public static void main(String[] args) {
		Scanner in = new  Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		String[] ns=  new String[2*n];
		String[] ms=  new String[2*m];
		int i;
		in.nextLine();
		for(i=0;i<n;i++) {
			String s =in.nextLine();
			String s1 = s;
			int l = s.length();
			int k=0;
			int si=-1;
			for(k=1;k<l;k++) {
				if(s.charAt(k-1)==' ') {
					si=k;
					break;
				}
			}
			
			s1 = s.substring(si);
			s=s.substring(0, si-1);
			ns[2*i]=s;
			ns[(2*i)+1]=s1;
		}
		for(i=0;i<m;i++) {
			String s =in.nextLine();
			String s1 = s;
			int l = s.length();
			int k=0;
			int si=-1;
			for(k=1;k<l;k++) {
				if(s.charAt(k-1)==' ') {
					si=k;
					break;
				}
			}
			
			s1 = s.substring(si,l-1);
			s=s.substring(0, si-1);
			ms[2*i]=s;
			ms[(2*i)+1]=s1;
		}

//		for(i=0;i<2*n;i++)
//			System.out.println(ns[i]+" "+i);
//		for(i=0;i<2*m;i++)
//			System.out.println(ms[i]+" "+i);
		
		
		for(i=1;i<2*m;i+=2) {
			String c1= ms[i];
			int h;
			for(h=1;h<2*n;h+=2) {
				String c2 = ns[h];
				
				if(c1.equals(c2)) {
					System.out.println(ms[i-1]+" "+c1+"; #"+ns[h-1]);
				}
				
			}
			
		}
		
		
	}
	
}
