class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            Character tmp = s.charAt(i);
            if(tmp=='(' || tmp == '{' || tmp == '['){
                stack.push(tmp);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top= stack.peek();
                if(tmp ==')' && top != '(' || tmp =='}' 
                && top !='{' || tmp == ']' && top != '['){
                        return false;       
                }
                stack.pop();
                
            }
        }
        return stack.isEmpty();
    }
}
