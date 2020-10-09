import java.util.Scanner;

public class BowWowandtheTimetable {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
//		1 -> 1 -> 0
//		2 -> 10 -> 1
//		3 -> 11  -> 1
//		4 -> 100  -> 1
//		5 -> 101 -> 2
//		6 -> 110 ->2 
//		7 -> 111 -> 2
//		8 -> 1000 -> 2
//		9 -> 1001 -> 2
//		:
//		:
//		14 -> 1110 -> 2
//		15 -> 1111 -> 2
//		16 -> 10000 ->2
//		17 -> 10001 ->3
//		:
//		:
//		63 -> 
		
		String s = in.nextLine();
//		System.out.println(s);
		int l = s.length();
		int a=0;
		if(s.equals("0")) {
			System.out.println(0);
		}else {
			if(l%2==0) {
				System.out.println(l/2);
			}else {
				int one = 0;
				for(int i=0;i<l;i++) {
					if(s.charAt(i)=='1')
						one++;
				}
				if(one==1&&s.charAt(0)=='1') {
					System.out.println(l/2);
				}else {
					int ans = l/2;
					ans++;
					System.out.println(ans);
				}
				
			}
		
		}
	}
	
}
