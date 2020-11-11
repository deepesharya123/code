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
        FastReader fs=new FastReader();

        String s = fs.nextLine();
        
        Vector<Integer> v = new Vector<Integer>();
        int l = s.length();
        for(int i=0;i<l;i++) {
            int nu = (s.charAt(i));
            v.add(nu);
            i++;
        }

        Collections.sort(v);
        l/=2;
        l++;
        for(int i=0;i<l;i++) {
            int nu = v.get(i);
            char ch =(char) nu;
            if(i<l-1)
            System.out.print(ch+"+");
            else
                System.out.print(ch);                
        }
        
    }
    
}