import java.util.Scanner;

public class NumberofApartments{

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			
			if(n<3||n==4)
				System.out.println(-1);
			else {
				if(n%3==0) {
					System.out.println(n/3+" "+0+" "+0);
				}else if(n%5==0) {
					System.out.println(0+" "+n/5+" "+0);
				}else if(n%7==0) {
					System.out.println(0+" "+0+" "+n/7);
				}
				else {
					if(n%3==2) {
						System.out.println((n-5)/3+" "+1+" "+0);
					}else if(n%3==1) {
						System.out.println((n-10)/3+" "+2+" "+0);
					}
					
					else 
						System.out.println("-1");
				}
			}
			
			
		}
	
	}
	
}
