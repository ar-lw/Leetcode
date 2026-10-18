class MinStack {
    Stack<Integer>s=new Stack<>();
    int min;
    public MinStack() {
        
    }
    
    public void push(int value) {
        
        if(s.isEmpty()){
            min=value;
        }
        else{
            min=Math.min(min,value);
        }
        s.push(value);
    }
    
    public void pop() {
        int popped=s.pop();
        if(popped==min && !s.isEmpty()){
            min=top();
            for(int el:s){
                min=Math.min(min,el);
            }
        }   
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */