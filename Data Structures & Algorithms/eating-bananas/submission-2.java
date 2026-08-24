class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 1;
        for (int p : piles)
        {
            max = Math.max(p, max);
        }
        int least = 1;


        while (least <= max)
        {
            int mid = least + (max - least) / 2;
            long totalTime = 0;
            for (int pile : piles)
            {
                totalTime += (pile + mid - 1) / mid;
            }

            if (totalTime <= h)
            {
                max = mid - 1;
            }
            else
            {
                least = mid + 1;
            }

            
            
        }
        return least;

    }
}
