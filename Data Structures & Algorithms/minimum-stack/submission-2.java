class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int popped = stack.pop();
        if(popped == minStack.peek()){
            minStack.pop();
        }

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        // if(minStack.isEmpty()){
        //     return null;
        // }
        return minStack.peek();
    }
}
