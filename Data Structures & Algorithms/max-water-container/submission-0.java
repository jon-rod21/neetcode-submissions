class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int max = 0;


        while (left < right)
        {
            int prod = (right - left) * Math.min(heights[left], heights[right]);
            if (prod > max)
            {
                max = prod;
            }
            
            if(heights[left] < heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return max;
    }
}
