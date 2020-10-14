import java.util.Scanner;

public class FakeNewseasy {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		int l = s.length();
//		System.out.println(s);
//		heidi -> if this is present then yes or else no
		char[] ch = new char[l];
		ch = s.toCharArray();
		int h=0,e=0,iii=0,d=0;
		for(int i=0;i<l;i++) {
			char c = ch[i];
		if((c!='h')&&(c!='i')&&(c!='e')&&(c!='d')) {
				c=' ';
		}
//		else {
//				if(c=='h') {
//					h=1;
//				}else if(c=='e') {
//					e++;
//				}else if(c=='i') {
//					iii++;
//				}else {
//					d++;
//				}
//			}
			ch[i]=c;	
			s=new String(ch);
//			System.out.println(s);/
		}
//		System.out.println(s);
		s=s.replaceAll(" ", "");
//		System.out.println(s);
		int hid =0;
		int eid =0;
		int iid = 0;
		int did = 0;
		int[] ah = new int[s.length()];
		int[] ai = new int[s.length()];
		int[] ad = new int[s.length()];
		int[] ae = new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='h') {
				ah[hid]=i;
				hid++;
			}else if(s.charAt(i)=='e') {
				ae[eid]=i;
				eid++;
			}
			else if(s.charAt(i)=='i') {
				ai[iid]=i;
				iid++;
			}
			else if(s.charAt(i)=='d') {
				ad[did]=i;
				did++;
			}
		}
		
		
		int yes=0;
		int st = -1;
		if(s.contains("h")) {
			st = ah[0];
		}
		
		if(st>-1) {
//			System.out.println(s);
//			System.out.println(st+" h");
//			System.out.println(s);
//			for(int i=0;i<s.length();i++) {
				int j=0;
				int cst = st;
				for(j=0;j<eid;j++) {
					if(ae[j]>st) {
						cst = ae[j];
						break;
					}
				}
//				System.out.println(cst+" e");
				if(cst<=st) {
					yes=0;
					
				}else {
					int cal = cst;
					for(j=0;j<iid;j++) {
						if(ai[j]>cst) {
							cal=ai[j];
							break;
						}
					}
//					System.out.println(cal+" i");
					if(cal>cst) {
						int dal = cal;
						for(j=0;j<did;j++) {
							if(ad[j]>cal) {
								dal=ad[j];
								break;
							}
						}
//						System.out.println(dal+" d");
						if(dal>cal) {
							int eal = dal;
							for(j=0;j<iid;j++) {
								if(ai[j]>dal) {
									eal = ai[j];
									break;
								}
							}
//							System.out.println(eal+" i");
							if(eal>dal) {
								yes=1;
//								i=s.length();
//								break;
							}else {
								yes=0;
//								break;
							}
							
						}else {
							yes=0;
//							break;
						}
						
					}else {
						yes=0;
//						break;
					}
				}
			}
			
//		}
		
		
		
		
		
		
		
//		System.out.println(yes);
		
		
		
		if(yes==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
		
		
	}
	
}
