class Solution {
    public String decodeString(String s) {
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        for(int i=0; i< s.length();i++){
            Character x = s.charAt(i);
            if( x ==']'){
                StringBuilder tmp = new StringBuilder();
                while(!stack.peek().equals("[")){
                    tmp.insert(0, stack.pop());
                }
                stack.pop();
                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && stack.peek().matches("\\d+")){
                    num.insert(0, stack.pop());
                }
                stack.push(tmp.toString().repeat(Integer.valueOf(num.toString())));
            }else{
                stack.push(String.valueOf(x));
            }
        }
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }

        return result.toString();
    }
}