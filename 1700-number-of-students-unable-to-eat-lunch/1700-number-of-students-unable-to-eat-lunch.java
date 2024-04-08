class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwich = new Stack<>();
        Deque<Integer> student = new ArrayDeque<>();
        
        for(int stu : students )
            student.addLast(stu);
        
        for(int i = sandwiches.length -1 ; i >= 0 ; i-- ){
            int sandw = sandwiches[i];
            sandwich.add(sandw);
        }
        
        int rev = 0;
        
        while( sandwich.size() > 0 ){
            int sand = sandwich.peek() , stud = student.getFirst();
            if( sand == stud ){
                sandwich.pop();
                student.pollFirst();
                rev = 0;
            }else{
                student.pollFirst();
                student.addLast(stud);
                if( rev != sandwich.size() ){
                    rev++;
                }else {
                    break;
                }
            }
        }
        
        return sandwich.size();
    }
}