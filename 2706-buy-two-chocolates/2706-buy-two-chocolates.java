class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cost = prices[0] + prices[1];
        int rest = money - cost;
        return (rest >= 0 ? rest : money);
    }
}