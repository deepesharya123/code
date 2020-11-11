import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class Functusion
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
            
        long n = in.nextLong();
        long i=1;
        long res =-1;
        for(i=1;i<1000000;i++) {
            long a = (long) Math.pow(i, 3);
//            System.out.println(a);
            a=a+(long)Math.pow(i, 2);
//            System.out.println(a);
            a=i+a;
            
            if(n==a) {
                res=(long)Math.pow(i, 2);
                break;
            }
            if(n<a) {
                res=-1;
                break;
            }
        }
        
        System.out.println(res);
        
    }
    
}