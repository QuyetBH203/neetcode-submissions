class MyStack {

    private Deque<Integer> stack;

    public MyStack() {
        this.stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack.addFirst(x);
    }
    
    public int pop() {
        if(!stack.isEmpty()){
            return stack.removeFirst();
        }
        return -1;
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peekFirst();
        }
        return -1;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */