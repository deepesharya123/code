

import java.util.*;
import java.io.*;

public class ReverseBinaryStrings{

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int l = in.nextInt();
			in.nextLine();
			
			String s = in.nextLine();
			
			int j,c=0;
			int so = s.indexOf("1");
			int lo= s.lastIndexOf('1');
			so++;
			for(j=so;j<=lo;j++) {
				if(s.charAt(j)=='1'&&s.charAt(j-1)=='1')
					c++;
			}
			int co = 0;
			int sz = s.indexOf('0');
			int lz = s.lastIndexOf('0');
			so=sz;
			lo=lz;
			so++;
			for(j=so;j<=lo;j++) {
				if(s.charAt(j)=='0'&&s.charAt(j-1)=='0')
					co++;
			}
			
			int res = Math.max(c,co);
			System.out.println(res);
			
			
		}
		
		
	}
	
}
