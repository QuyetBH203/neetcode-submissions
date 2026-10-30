class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n;i++){
            if(tokens[i].matches("-?\\d+")){
                stack.push(Integer.valueOf(tokens[i]));
            }else{
                int b = stack.pop();
                int a = stack.pop();

                if (tokens[i].equals("+")) {
                    stack.push(a + b);
                } else if (tokens[i].equals("-")) {
                    stack.push(a - b);
                } else if (tokens[i].equals("*")) {
                    stack.push(a * b);
                } else {
                    stack.push(a / b);
                }
            }
        }
        return stack.peek();
    }
}
