import java.util.Scanner;

public class kstring {

	public static void main(String[] args) {
		Scanner in=  new Scanner(System.in);
		
		int  k = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		int[] ar = new int[26];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int nu = c-97;
			ar[nu]++;
		}
		int min=0;
		for(int i=0;i<26;i++) {
			int nu = ar[i];
			if(nu%k!=0) {
				min=1;
				break;
			}
			//			for(int j=0;j<26;j++) {
//				int nua = ar[j];
//				if(nua!=nu) {
//					min=1;
//					break;
//				}
//			}
		}
		
//		int m = -1;
//		for(int i=0;i<26;i++) {
//			
//		}
		
		
		if(min==1)
			System.out.println("-1");
		else {
			String p="";
			
			for(int i=0;i<26;i++) {
				int nu =ar[i];
				int cn = nu/k;
				while(cn>0) {
					int nl = i+97;
					char c = (char) nl;
					p=p.replaceFirst(p, p+c);
					cn--;
				}
			}
			for(int j=0;j<k;j++)
			System.out.print(p);
		}
		
	}
	
}
