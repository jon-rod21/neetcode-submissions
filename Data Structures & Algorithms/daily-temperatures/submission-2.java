class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] ret = new int[size];

        for (int i = 0; i < size; i++)
        {
            int cur = temperatures[i];
            
            for (int j = i; j < size; j++)
            {
                if (temperatures[j] > cur)
                {
                    ret[i] = j - i;
                    break;
                }
            }
            

        }
        return ret;
    }
}
