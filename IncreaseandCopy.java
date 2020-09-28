import java.util.Scanner;

public class IncreaseandCopy {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t =in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			
			int s=0;
			int j=1;
			boolean r= true;
			int[] ar =new int[10];
			int sd = (int) Math.sqrt(n);
			j=sd-5;
			int k=0;
			if(n<9) {
				if(n==1)
					System.out.println(0);
				else if(n==2)
					System.out.println(1);
				else if(n>2&&n<5)
					System.out.println(2);
				else if(n>4&&n<7)
					System.out.println(3);
				else 
					System.out.println(4);
			}else {
			while(r) {
				int d = (int) Math.pow(j, 2);
			
				if(d>=n) {
					r=false;
					int cd = n-j;
					if(cd%j==0) cd/=j;
					else {cd/=j;
					cd++;
					}
					ar[k]=j-1+cd;
				k++;
				}else 
					j++;
				
				if(j==sd+5) r=false;
				
			}
			k--;
			int min=ar[0];
			while(k>=0&&ar[k]>0) {
				if(min<ar[k])
					min=ar[k];
				k--;
			}
			System.out.println(min);
			}
		}
		
	}
	
}
