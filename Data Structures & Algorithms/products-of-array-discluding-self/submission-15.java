class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;
        int[] ret = new int[nums.length];
        ret[0] = 1;

        for (int i = 1; i < nums.length; i++)
        {
            ret[i] = prefix * nums[i - 1];
            prefix *= nums[i - 1];

        }

        for (int i = nums.length - 2; i >= 0; i--)
        {
            ret[i] *= postfix * nums[i + 1];
            postfix *= nums[i + 1];
        }
        return ret;
    }
}  
