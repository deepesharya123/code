class MyQueue {
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> ss = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s.push(x);
        if(ss.size()==0)
            ss.push(x);
    }
    
    public int pop() {
        ss.pop();
        while(!s.isEmpty()){
            int num = (int) s.pop();
            ss.push(num);
        }
        int re = ss.pop();
        int secondTop = 0;
        boolean secondTopExists = ss.size()>=1 ? true : false;
        if(secondTopExists){
            secondTop = ss.peek();
        }
        while(!ss.isEmpty()){
            int num = (int) ss.pop();
            s.push(num);
        }
        if(secondTopExists)
            ss.push(secondTop);
        return re;
    }
    
    public int peek() {
        return (int) ss.peek();
    }
    
    public boolean empty() {
        return s.size()>0 ? false : true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */