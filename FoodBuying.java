import java.util.Scanner;

public class FoodBuying {

	public static void main(String arg[]) {
		Scanner  in =  new Scanner(System.in);
		
		int t = in.nextInt();
		while(t>0) {
			t--;
			long n = in.nextLong();
			long s=0;
			while(n>0) {
				long rem = n%10;	
				long dif = n-rem;
				s+=dif;
				long rt = dif/10;
				n=rem+rt;
				if(n<10) {
					s+=n;
					n=0;
				}
			}
			
			System.out.println(s);
			
			
		}
		
		
	}
	
}
