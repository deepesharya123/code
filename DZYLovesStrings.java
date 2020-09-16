import java.util.Scanner;

public class DZYLovesStrings {

	public static void main(String arg[]) {
		Scanner in= new Scanner(System.in);
		
		String s = in.nextLine();
		int k = in.nextInt();
		
		int[] ar = new int[26];
		int i;
		int lar =-1;
		
		for(i=0;i<26;i++) {
			ar[i]=in.nextInt();
			if(ar[i]>lar) lar=ar[i];
		}
		long sum=0;
		for(i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			int nu = ch-97;
			sum+=ar[nu]*(i+1);
		}
		int l =s.length();
		
		long ans = lar*((l*k)+((k*(k+1))/2));
		sum+=ans;
		
		System.out.println(sum);
		
		
	}
	
}
