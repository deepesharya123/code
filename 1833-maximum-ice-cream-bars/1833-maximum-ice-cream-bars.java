class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0, ans =0;
        while(coins>0 && i<costs.length){
           if(coins<costs[i])
               break;
            ans++;
            coins-=costs[i++];
        }
        return ans;
    }
}