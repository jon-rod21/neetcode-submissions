class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] ret = new int[n];

        for (int i = 0; i < n; i++)
        {
            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()])
            {
                int popped = stack.pop();
                ret[popped] = i - popped;
            }
            stack.push(i);
        }
        return ret;
    }
}
