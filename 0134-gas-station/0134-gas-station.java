class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int st = 0,cst = st;
        int pre = 0, n = gas.length;
        int totalCost = 0, totalGas = 0;
        for(int i = 0;i<n;i++){
            totalCost+=cost[i];
            totalGas+=gas[i];
        }
        int ans = 0;
        if(totalCost>totalGas)
            return -1;
        while(cst<gas.length){
            pre = pre+gas[cst]-cost[cst];
            if(pre<0){
                ans = cst+1;
                pre = 0;
            }
            cst++;
            
        }
        return ans;
    }
}