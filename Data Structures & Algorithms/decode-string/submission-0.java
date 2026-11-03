class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ']') {
                stack.push(String.valueOf(c));
            } else {
                // Lấy chuỗi bên trong []
                StringBuilder str = new StringBuilder();

                while (!stack.peek().equals("[")) {
                    str.insert(0, stack.pop());
                }

                stack.pop(); // bỏ [

                // Lấy số lần lặp
                StringBuilder num = new StringBuilder();

                while (!stack.isEmpty() &&
                    stack.peek().matches("\\d")) {
                    num.insert(0, stack.pop());
                }

                int k = Integer.parseInt(num.toString());

                // Decode
                String decoded = str.toString().repeat(k);

                stack.push(decoded);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
        }
}