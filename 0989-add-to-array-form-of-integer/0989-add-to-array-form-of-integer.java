class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l = new ArrayList<>();
        int carry = 0, i = num.length-1;
        
        while(k>0 || carry>0 || i>=0){
            int n = i>=0 ? num[i--]:0;
            int add = k%10;
            add+=n+carry;
            carry = add/10;
            l.add(add%10);
            k/=10;
            
        }
        Collections.reverse(l);
        return l;
    }
}