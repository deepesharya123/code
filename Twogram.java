import java.util.Scanner;


public class Twogram {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int l = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		int[][] ar = new int[26][26];
		
		int i;
		int sum=0;
		int c1=-1,c2=-1;
		for(i=0;i<l-1;i++) {
			char c = s.charAt(i);
			char d = s.charAt(i+1);
			
			int a = c;
			int b=d;
			a-=65;
			b-=65;
			ar[a][b]++;
			int fs = ar[a][b];
			if(sum<fs){
				c1=a;
				c2=b;
				sum=Math.max(sum, fs);
			}
		
		}
		c1+=65;
		c2+=65;
		char as =(char) c1;
		char sa =(char) c2;
		System.out.println(as+""+sa);
		
		
	}
	
}
