class Solution {
    public int snakesAndLadders(int[][] board) {
        int len = board.length;
        Map<Integer, Integer> hm = new HashMap<>();
        int ind = len*len;
        boolean f = true;
        if(len % 2 != 0){
            f = false;
        }
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(f){
                    hm.put(ind, board[i][j]);
                }else{
                    hm.put(ind, board[i][len-j-1]);
                }
                ind--;
            }
            if(f){
                f = false;
            }else{
                f = true;
            }
        }
        
        //bfs
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> hs = new HashSet<>();
        q.add(1);
        hs.add(1);
        int step = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int curr = q.remove();
                if(curr == len*len){
                    return step;
                }
                //for dice
                for(int j=1; j<7; j++){
                    int next = curr+j;
                    if(next > len*len){
                        continue;
                    }
                    if(hm.get(next) != -1){
                        next = hm.get(next);
                    }
                    if(!hs.contains(next)){
                        q.add(next);
                        hs.add(next);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}

