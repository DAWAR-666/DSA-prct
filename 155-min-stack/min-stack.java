class MinStack {
    private Stack <Integer> stk1,stk2;
    public MinStack() {
        stk1=new Stack<>();
        stk2=new Stack<>();
    }
    
    public void push(int val) {
        stk1.push(val);
        
        if (stk2.isEmpty() || val <= stk2.peek()) {
            stk2.push(val);
        }
    }
    
    public void pop() {
        if (!stk1.isEmpty() && stk1.peek().equals(stk2.peek())) {
            stk2.pop();
        }
        if (!stk1.isEmpty()) { 
            stk1.pop();
        }

    }
    
    public int top() {
        return stk1.peek();
    }
    
    public int getMin() {
        return stk2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */