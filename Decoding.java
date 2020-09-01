import java.util.Scanner;

public class Decoding {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();

		char[] c = new char[n];
		if(n<=2)
			System.out.println(s);
		else {
//			int k = n/2;
			if(n%2==0) {
				int mid = n/2;
				mid--;
				int right = n/2;
				int left = mid-1;
				for(int j =0;j<n;j++) {
					if(j==0) {
						c[mid]=s.charAt(j);
					}else {
						if(j%2!=0) {
							c[right]=s.charAt(j);
							right++;
						}else {
							c[left]=s.charAt(j);
							left--;
						}
					}
				}
				
			}else {
				int mid = n/2;
				int left=mid-1;
				int right = mid+1;
				for(int j=0;j<n;j++) {
					if(j==0) {
						c[mid]=s.charAt(j);
					}else {
						if(j%2!=0) {
							c[left]=s.charAt(j);
							left--;
						}else {
							c[right]=s.charAt(j);
							right++;
						}
					}
				}
			}
		
		int i;
		for(i=0;i<n;i++)
			System.out.print(c[i]);
		}
		
		
	}
	
}
