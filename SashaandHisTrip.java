import java.util.Scanner;

public class SashaandHisTrip {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int v = in.nextInt();
		boolean run=true;
		int c=1;
		int p=0;
//		while(run) {
//			int disleft = n-c;
//			if(disleft>v) {
//				p+=(v*c);
//				c+=v;
//			}else {
//				p+=(disleft*c);
//				run=false;
//			}
//		}
		
//		System.out.println(p);
		if(v>=n)
			System.out.println(n-1);
		else {
		int dif=n-v;
		int sum=dif*(dif+1);
		sum/=2;
		sum+=v-1;
		System.out.println(sum);
		}
		
	}
	
}
