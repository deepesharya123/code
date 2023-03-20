class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0, zero = 0;
        boolean prevOne = false;
        for(int num : flowerbed){
            if(prevOne == false){
                if(num == 0){
                    zero++;
                }else{
                    count+=zero/2;
                    zero = 0 ;
                    prevOne = true;
                }
            }else{
                if(num == 0){
                    zero++;
                }else{
                    count+=(zero-1)/2;
                    zero = 0;
                }
            }
        }
        if(prevOne)
             count+=(zero)/2;
        else
            count+=(zero+1)/2;
        return count >= n;
    }
}

/*

[1,0,0,0,1]
1
[1,0,0,0,1]
2
[1,0,0,0,1]
3
[1,0,0,0,0,1,0,1,0,0,0,0]
1
[1,0,0,0,0,1,0,1,0,0,0,0]
2
[1,0,0,0,0,1,0,1,0,0,0,0]
3
[1,0,0,0,0,1,0,1,0,0,0,0]
4
[1,0,0,0,0,1,0,1,0,0,0,0]
5
[1,0,0,0,0,1,0,1,0,0,0,0]
6
[1,0,0,0,0,1,0,1,0,0,0,0]
7
[1,0,0,0,0,1,0,1,0,0,0,0]
8


*/