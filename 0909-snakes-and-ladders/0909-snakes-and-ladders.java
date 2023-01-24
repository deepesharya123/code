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
            f=!f;
        }
        
        //bfs
        Queue<Integer> curCell = new LinkedList<>();
        Set<Integer> visitedCell = new HashSet<>();
        curCell.add(1);
        visitedCell.add(1);
        int step = 0;
        while(!curCell.isEmpty()){
            int size = curCell.size();
            for(int i=0; i<size; i++){
                int curr = curCell.remove();
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
                    if(!visitedCell.contains(next)){
                        curCell.add(next);
                        visitedCell.add(next);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}

