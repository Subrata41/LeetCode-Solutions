class MyStack {
    ArrayList<Integer> stack;

    public MyStack() {
        stack=new ArrayList<>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        return stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public boolean empty() {
        return stack.size()==0;
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
