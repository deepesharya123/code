class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        int totalFruits =0 ,i = 0, j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<fruits.length){
            int type = fruits[j++];
            if(map.size()<2){
                int val = map.getOrDefault(type,0);
                totalFruits++;
                ans = Math.max(ans,totalFruits);
                map.put(type,val+1);
            }else{
                if(map.containsKey(type)){
                    int val = map.get(type);
                    totalFruits++;
                    map.put(type,val+1);
                    ans = Math.max(ans,totalFruits);
                }else{
                    while(map.size()==2){
                        int removeType = fruits[i++];
                        int val = map.get(removeType);
                        map.put(removeType,val-1);
                        if(val==1)
                            map.remove(removeType);
                        totalFruits--;
                    }
                    map.put(type,1);
                    totalFruits++;
                    ans = Math.max(ans,totalFruits);
                }
            }
        }
        
        return ans;
    }
}

