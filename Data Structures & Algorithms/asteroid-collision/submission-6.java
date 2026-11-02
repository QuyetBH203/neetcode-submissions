class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> stack = new Stack<>();
         

         for(int x: asteroids){
            boolean alive = true;
            while(alive && !stack.isEmpty() && stack.peek()>0 && x <0){
                if(stack.peek() < Math.abs(x)){
                    stack.pop();
                }else if(stack.peek() == Math.abs(x)){
                    stack.pop();
                    alive = false;
                }else {
                    alive = false;
                }
            }
            if(alive){
                stack.push(x);
            }
         }

         return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}