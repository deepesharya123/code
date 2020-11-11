import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.*;

public class JAMESBONDCASINOROYALE
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

        int n = in.nextInt();
        
        int a= in.nextInt();
        Vector<Integer> ar = new Vector<Integer>();
        Vector<Integer> ca = new Vector<Integer>();
        
        int i;
        for(i=0;i<a;i++) {
            int nu = in.nextInt();
            ar.add(nu);
        ca.add(nu);
        }
        int b= in.nextInt();
        Vector<Integer> br = new Vector<Integer>();
        Vector<Integer> cb = new Vector<Integer>();
        
        for(i=0;i<b;i++) {
            int nu = in.nextInt();
            br.add(nu);
            cb.add(nu);
        }
        
//        if(ar.equals(br)) {
//            System.out.println("YES");
//        }else
//            System.out.println("NO");
//        
        boolean run = true;
        int win = 0;
        int ro=1;
        while(run) {
            int na = ar.get(0);
            int nb = br.get(0);
            if(na<nb) {
                ar.remove(0);
                br.remove(0);
                br.add(na);
                br.add(nb);
            }else {
                ar.remove(0);
                br.remove(0);
                ar.add(nb);
                ar.add(na);    
            }
            
            if(ar.size()==0) {
                win=2;
                run= false;
//                break;
            }else if(br.size()==0) {
                win=1;
                run=false;
//                break;
            }else{
                ro++;
            }
            
            if(ar.equals(ca)&&br.equals(cb)) {
            
                win=-1;
                run=false;
//                break;
            }

            
        }
        if(win>0)
            System.out.println(ro);
        System.out.println(win);
        
        
        
    }
    
}