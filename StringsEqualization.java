import java.util.Scanner;

public class StringsEqualization {

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
	
		int q = in.nextInt();
		in.nextLine();
		for(int i=0;i<q;i++) {
			String s = in.nextLine();
			String t = in.nextLine();
			
			int  l=s.length();
			int[] ar = new int[26+1];
			for(int j=0;j<l;j++) {
				char c = s.charAt(j);
				int nu =(c-97);
				ar[nu]++;
			}
			boolean yes=false;
			l=s.length();
			for(int j=0;j<l;j++) {
//				System.out.println(j);
				char c= t.charAt(j);
				int nu = (c-97);
				if(ar[nu]>0) {
					yes=true;
					break;
				}
			}
			
			if(yes)
				System.out.println("Yes");
			else 
				System.out.println("no");
			
		}
	
		
	}
	
}
