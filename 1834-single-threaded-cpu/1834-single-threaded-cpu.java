// class Solution {
//     public int[] getOrder(int[][] tasks) {
//         // arrival_time, processing_time, index
//         PriorityQueue<int[]> taskQ = new PriorityQueue<int[]>
//         ((task1,task2)-> task1[0]-task2[0]);

//         // arrival_time, processing_time, index
//         PriorityQueue<int[]> available = new PriorityQueue<int[]>(
//             (a, b) -> ( a[1] != b[1] ? (a[1] - b[1]) :  (a[2] - b[2]) ));

//         int i = 0,n = tasks.length;
//         for(i=0;i<n;i++)
//             taskQ.add(new int[]{tasks[i][0],tasks[i][1],i});
        
//         i=0;
//         int starttime = taskQ.peek()[0];
//         while(taskQ.size()>0 && starttime == taskQ.peek()[0]){
//             available.add(taskQ.remove());
//         }
        
//         int[] ans=  new int[n];
//         int time = available.peek()[0];
//         while(!available.isEmpty() || !taskQ.isEmpty()){
//             if(available.isEmpty()){
//                 starttime = taskQ.peek()[0];
//                 while(taskQ.size()>0 && starttime == taskQ.peek()[0]){
//                     available.add(taskQ.remove());
//                 }        
//             }

//             int[] ar = available.remove();
//             time+=ar[1];
//             ans[i++] = ar[2];

//             while(!taskQ.isEmpty() && time>=taskQ.peek()[0]){
//                 available.add(taskQ.remove());
//             }

//         }
//         return ans;

        
//     }
// }
class Solution {
    public int[] getOrder(int[][] tasks) {
      
      
        int[][] allTasks = new int[tasks.length][3]; 
        
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2] == 0 ? a[0] - b[0] : a[2] - b[2]);
        for (int i = 0; i < tasks.length; i++) {
            allTasks[i][0] = i;
            allTasks[i][1] = tasks[i][0];
            allTasks[i][2] = tasks[i][1];
        }
        Arrays.sort(allTasks, (a, b) -> a[1] - b[1]);
        
        int i = 0, index = 0, curTime = 0;
        int[] result = new int[tasks.length];
        
        while (i < tasks.length) {
           
            while (i < tasks.length && curTime >= allTasks[i][1]) {
                minHeap.add(allTasks[i++]);
            }
            if (minHeap.isEmpty()) {
                curTime = allTasks[i][1];
            }
            if (minHeap.isEmpty() == false) {
                int[] curTask = minHeap.remove();
                result[index++] = curTask[0];
                curTime += curTask[2];
            }
        }
        while (minHeap.isEmpty() == false) {
            int[] curTask = minHeap.remove();
            result[index++] = curTask[0];
        }
        return result;
    }
}