class Solution {
    
    public boolean match(String s, String target, int ind){
        // int tar = 
        if(ind == 0)
            for(int i = ind ; i < s.length() && i<target.length() ; i++)
                if(s.charAt(i) != target.charAt(i))
                    return false;
        int last = s.length()-1;
        if(ind == target.length()-1)
            for(int i = ind ; last>=0 &&  i>=0 ; i--)
                if(s.charAt(last--) != target.charAt(i))
                    return false;
        return true;
        
    }
        
    public int numOfPairs(String[] nums, String target) {
        int ans = 0;
        HashMap<String,Integer> hm = new HashMap<>();
        for(String s: nums){
            boolean front = match(s, target, 0);
            boolean back = match(s, target, target.length()-1);
            if(front){
//                 s is the front of target
                String part ="";
                for(int i = s.length() ; i < target.length() ; i++)
                    part+=target.charAt(i);
                
                if(hm.containsKey(part))
                    ans+=hm.get(part);
            }
            if(back){
//                 s is the back of target
                String part ="";
                for(int i = 0 ; i < target.length()-s.length() ; i++)
                    part+=target.charAt(i);
                
                if(hm.containsKey(part))
                    ans+=hm.get(part);
            }
            hm.put(s, hm.getOrDefault(s,0)+1);
            
        }
        return ans;
    }
}