class Solution {
    public static boolean isPalindrome(String s, int i, int j){
        
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void solve(String s, int st,int e,List<List<String>> ans,List temp){
        if(st==s.length()){
            // System.out.println(temp);
            ans.add(new ArrayList(temp));
            return;
        }

        for(int i =st;i<=e;i++){
            String sub = s.substring(st,i+1);
            if(isPalindrome(sub,0,sub.length()-1)){
                temp.add(sub);
                solve(s,i+1,e,ans,temp);
                temp.remove(temp.lastIndexOf(sub));
            }
            // System.out.println("tmep "+temp);
        }

    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList();
        List temp = new ArrayList();
        solve(s,0,s.length()-1,ans,temp);
        return ans;
    }
}