class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && !stack.isEmpty()
                    && stack.peek() > 0 && asteroid < 0) {

                if (stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                } else if (stack.peek() == Math.abs(asteroid)) {
                    stack.pop();
                    alive = false;
                } else {
                    alive = false;
                }
            }

            if (alive) {
                stack.push(asteroid);
            }
        }

        return stack.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}