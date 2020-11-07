import java.util.Scanner;

public class AddingDigits {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int na = in.nextInt();
		String a = Integer.toString(na);
		
		int b = in.nextInt();
		int n = in.nextInt();
		
		int c = 0;
	
		int i = 0;
		for(i=0;i<10;i++) {
			int nu =i;
			String sa = a;
			sa+=i;
			nu= Integer.parseInt(sa);
			if(nu%b==0) {
				a=sa;
				break;
			}
		}
		n--;
		if(Integer.parseInt(a)%b!=0) {
			System.out.println(-1);
		}else {
			String[] z = new String[1001];
			int il;
			z[0]=" ";
			for(il=1;il<1001;il++) {
//				z[il]="";
				if(il==1)
					z[il]="0";
				else
					z[il]=z[il-1]+"0";
			}
			
			int cn = n;
			int loop = cn/1000;
				int div = cn%1000;
				while(loop>0||div>0) {
					if(loop>0) {
						a+=z[1000];
						loop--;
					}
					if(div>0) {
//						div--;
						a+=z[div];
						div=0;
					}
				
			}
			
			System.out.println(a);
		
//			System.out.println(a.length());
			
			
		}
		
	}
	
}
