import java.util.Scanner;

public class TheWaytoHome {

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int d = in.nextInt();
		
		in.nextLine();
		String s = in.nextLine();
		
		int i;
		int[] one  = new int[n];
		int k=0;
		for(i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='1') {		//use less than k
				one[k]=i;
				k++;
			}
		}
		
//		System.out.println(one[k-2]+" "+k);
		int minusone=0;
		for(i=0;i<k-1;i++) {
//			System.out.println(one[i]+" "+i);
			if(one[i+1]-one[i]>d) {
				minusone=1;
				break;
			}
		}
		if(minusone==1) {
			System.out.println("-1");
		}else {
			int c=0;
//			System.out.println();
			for(i=0;i<s.length();i++) {
				int j=i+d;
				boolean run=true;
				if(j>=s.length()&&i!=s.length()-1) {
//					System.out.println(c+"DES");
					c++;
					break;
				}else {
					if(j<s.length()-1) {
					 while(run){
//						 System.out.println(j);
						if(s.charAt(j)=='1') {
//							System.out.println(c+"INC");
							i=j-1;
							run=false;
							c++;
						}else {
							j--;
						}
					 }
					}
					
				}
			}
			if(d==1)
				c++;
			
			System.out.println(c);
				
			//			int cp=one[0];
//			int res=0;
//			int j;
////			
////			for(j=0;j<k;j++)
////				System.out.println(one[j]);
////			System.out.println(k);
//			
//			for(j=1;j<k;j++) {
////				System.out.println("ASDF"+j);
//				int a = one[j];
//				int b = -1;
//				if(j+1<k) {
//					b=one[j+1];
//				}else {
//					res++;
//					break;
//				}
////				System.out.println(a+" "+b+" "+cp);
//				if(a-cp>d) {
//					System.out.println("ONE"+a+" "+cp);
//					cp=one[j-1];
//					res++;
//					j--;
//					System.out.println(cp);
//				}else {
//					if(b-cp>d) {
//						System.out.println("TWO"+b+" "+cp);
//						cp=a;
//						res++;
//					}else {
//						int c = -1;
//						if(j+2<k) {
//							c=one[j+2];
//						}else {
//							res++;
//						System.out.println(res+"i was here ");
//							break;
//						}
//
//						System.out.println(c+"ASDFasdfasdf");
//						if(c-cp>d) {
//							System.out.println("THRE"+c+" "+cp);
//							cp=b;
//							res++;
//							j++;
//						}else if(c==one[k-1]) {
////							res++;
//							System.out.println(c+" "+one[k-1]+" the last of one");
//						}
//						else {
//							j=j+2;
//						}
//						
//					}
//				}
//			}
//			System.out.println(res);
			
		}
		
		
	}

}