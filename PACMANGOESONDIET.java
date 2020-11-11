import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class t
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new
            InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    
    public static void main(String[] args){
        FastReader in=new FastReader();
        
        int r = in.nextInt();
        int c= in.nextInt();
        
        String[] s = new String [r];
        int i,j;

        for(i=0;i<r;i++) {
            s[i]=in.nextLine();
        }
        
        int con=0;
        int cn =c;
        String plus="";
        while(cn!=0) {
            cn--;
            plus+="+";
        }
//        System.out.println(plus);
        for(i=0;i<r;i++) {
            String che = s[i];
            int ind = che.indexOf('S'); 
            if(ind==-1) {
                s[i]=plus;
            }
        }
        
        String[] t= new String[c];
        for(j=0;j<c;j++) {
            String add="";
            
            for(i=0;i<r;i++) {
                add+=s[i].charAt(j);
            }
            t[j]=add;
        }
        
        int cr = r;
        plus="";
        while(cr!=0) {
            plus+="+";
            cr--;
        }
        for(i=0;i<c;i++) {
            int ind = t[i].indexOf('S');
            if(ind==-1) {
                t[i]=plus;
            }
        }
        
        for(i=0;i<c;i++) {
            for(j=0;j<r;j++) {
                if(t[i].charAt(j)=='+') {
                    con++;
                }
            }
        }
        
        System.out.println(con);
        
        
        
        
        
        
        
        

        
    }
    
}