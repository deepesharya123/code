import java.util.Scanner;

public class DifferentisGood {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		if(s.length()>26) {
			System.out.println(-1);
		}else {
			int sum=0;
			int[] ar = new int[26];
			int i;
			for(i=0;i<n;i++) {
				char c = s.charAt(i);
				int nu = c-97;
				ar[nu]++;
			}
			for(i=0;i<26;i++) {
				if(ar[i]>1)sum+=ar[i]-1;
			}
			
			System.out.println(sum);
		}
		
	}
	
}
