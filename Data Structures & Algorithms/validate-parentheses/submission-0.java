class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> chars = new HashMap<>();
        chars.put(')', '(');
        chars.put('}', '{');
        chars.put(']', '[');
        for (char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == chars.get(c)){
                stack.pop();
            } else {
                stack.push(c);
            } 

        }
        if(stack.size() == 0){
            return true;
        } else {
            return false;
        }

    }
}
