class MyQueue {
    private Stack < Integer > input,output;

    public MyQueue() {
        input = new Stack < > ();
        output = new Stack < > ();
    }
    
    public void push(int x) {
        if(input.size()==0){
            input.push(x);
            return;
        }
        while(input.size()!=0){
            int z=input.peek();
            input.pop();
            output.push(z);
        }
        input.push(x);
        while(output.size()!=0){
            int y=output.peek();
            output.pop();
            input.push(y);
        }
    }
    
    public int pop() {
        int ans=input.peek();
        input.pop();
        return ans;
    }
    
    public int peek() {
        return input.peek();
    }
    
    public boolean empty() {
        if(input.size()==0){
            return true;
        }
        return false;
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