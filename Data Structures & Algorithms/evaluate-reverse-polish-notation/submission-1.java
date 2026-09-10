class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =  new Stack<>();
        for(String c : tokens){
            if(c.equals("+")){
                int sum = stack.pop() + stack.pop();
                stack.push(sum);
            } else if(c.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if(c.equals("*")){
                stack.push(stack.pop() * stack.pop());
            } else if(c.equals("/")){
                int denom = stack.pop();
                int num = stack.pop();
                stack.push(num / denom);
            } else {
                stack.push(Integer.parseInt(c));
            }

        }
        return stack.pop();
    }
}
