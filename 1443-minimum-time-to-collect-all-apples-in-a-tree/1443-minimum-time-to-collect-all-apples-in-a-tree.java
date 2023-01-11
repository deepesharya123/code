class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int answer = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[n];

        for(int[] arr : edges){
            int a = arr[0]; 
            int b = arr[1];
            
            map.computeIfAbsent(a, x -> new ArrayList<Integer>()).add(b);
            map.computeIfAbsent(b, x -> new ArrayList<Integer>()).add(a);

        }

        answer = dfs(visited, 0, map, hasApple);
        return answer > 0 ? answer : 0;
    }

    int dfs(boolean[] visited, int source, HashMap<Integer,List<Integer>> map,  
        List<Boolean> hasApple){

        visited[source] = true;    
    
        List<Integer> list = map.get(source);
        if(list == null || list.size() == 0) {
            return hasApple.get(source) ? 0 : -1;
        }

        int sum = 0;

        for(int i=0; i<list.size(); i++){
            int e = list.get(i);
            if(!visited[e]) {
            int temp = dfs(visited, e, map, hasApple);
            if(temp != -1) {
                sum += temp + 2;
            }
            }
        }

        return sum > 0 || hasApple.get(source) ? sum : -1;

    }
}
