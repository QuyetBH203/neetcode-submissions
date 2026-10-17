class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String x: operations){
            if(x.matches("-?[0-9]+")){
                stack.push(Integer.valueOf(x));
                //  System.out.println(stack.peek());
            }else if(x.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
                // System.out.println(stack.peek());
            }else if(x.equals("D")){
                int c = stack.peek();
                stack.push(c*2);
                //  System.out.println(stack.peek());
            }else {
                stack.pop();
                //  System.out.println(stack.peek());
            }
        }
        // for(Integer s: stack){
        //     System.out.print(s+" ");
        // }
        int result = stack.stream().mapToInt(Integer::intValue).sum();
        return result;
    }
}