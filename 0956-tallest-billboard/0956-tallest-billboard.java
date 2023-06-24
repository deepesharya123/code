class Solution {

    public void put(HashMap<Integer,Integer> hm, int key, int val){
        if(hm.containsKey(key)){
            hm.put(key, Math.max(val,hm.get(key)));
        }else
            hm.put(key, val);
    }
    
    public void solve(HashMap<Integer,Integer> hm, int ind, int e, int[] rods, int l, int r){
        if(ind > e )
            return;
        
        int num = rods[ind];
        int dif = l - r ; 
//      discarded current element to take in any rod gorup
        put(hm, dif, l);
        solve(hm, ind+1,e,rods, l,r);
//      include current rod in left group
        int nl = l + num;
        dif = nl - r;
        put(hm,dif, nl);
        solve(hm, ind+1, e, rods, nl,r);
        
//      include current rod in right group
        int nr = r + num;
        dif = l - nr;
        put(hm, dif, l);
        solve(hm, ind+1, e, rods, l, nr);
        
        return;
    }
    
    
    public int tallestBillboard(int[] rods) {
        int n = rods.length;
        int h = (n-1)/2;
        
        HashMap<Integer,Integer> left = new HashMap();
        HashMap<Integer,Integer> right = new HashMap();
        solve(left, 0,h, rods, 0,0 );
        solve(right, h+1, n-1, rods,0,0);
        
        int ans = 0;
        for(Map.Entry<Integer,Integer> me : left.entrySet()){
            if(right.containsKey(-me.getKey()))
                ans = Math.max(ans, me.getValue() + right.get(-me.getKey()));
        }
        
        
        return ans;
    }
}