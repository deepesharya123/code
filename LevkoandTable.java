import java.util.Scanner;

public class LevkoandTable{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print(k+" ");
				}else
					System.out.print(0+" ");
			}
			System.out.println();
		}
		
		
	}
}