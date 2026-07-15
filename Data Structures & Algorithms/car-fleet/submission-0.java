class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> pair = new ArrayList<>();
        for(int i = 0; i < speed.length; i++) {
            pair.add(new int[] {position[i], speed[i]});
        }

        pair.sort((a, b) -> b[0] - a[0]);

        Stack<Double> stack = new Stack<>();

        for(int[] p : pair) {
            stack.push((double) (target - p[0]) / p[1]);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            } 
        }
        return stack.size();
    }
}
