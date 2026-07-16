class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            int m = 1;
            for (int j = 0; j < nums.length; j++)
            {
                if (i == j) continue;
                m *= nums[j];
            }
            ret[i] = m;
        }
        return ret;
    }
}  
