class Solution {
    
    public static int findLargestAreaOfHistogram(int[] heights ){
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= heights.length; ++i) {
          while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()] > heights[i])) {
            final int h = heights[stack.pop()];
            final int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            ans = Math.max(ans, h * w);
          }
          stack.push(i);
        }

        return ans;
    }
    
    public int maximalRectangle(char[][] matrix) {
        int ans = 0 , n = matrix.length , m = matrix[0].length ;
        int[] ar = new int[m];
        
        for(char[] car : matrix ){
            int i = 0;
            for( char c : car ){
                ar[i] = c == '0' ? 0 : ar[i] + 1;         
                i++;
            }
            ans = Math.max(ans, findLargestAreaOfHistogram(ar) );
        }
        
        return ans;
    }
}