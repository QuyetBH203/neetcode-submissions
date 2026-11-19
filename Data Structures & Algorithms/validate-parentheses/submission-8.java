class Solution {
    public boolean isValid(String s) {
       Deque<Character> stack = new ArrayDeque<>();
       int n = s.length();
       for(int i=0; i<n;i++){
        if(s.charAt(i) =='(' || s.charAt(i) == '{' || s.charAt(i) =='['){
            stack.push(s.charAt(i));
        }else{
            if(stack.isEmpty()){
                return false;
            }
            Character tmp = stack.peek();
            if(s.charAt(i)==')' && tmp !='(' || s.charAt(i) =='}' && tmp !='{' ||
              s.charAt(i) ==']' && tmp !='[' ){
                return false;
              }

              stack.pop();
        }

       }

       return stack.isEmpty();
    }
}
