class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[k];

        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int key : map.keySet())
        {
            heap.offer(key);
            if (heap.size() > k)
            {
                heap.poll(); // remove smallest
            }
        }

        for (int i = k - 1; i >= 0; i--)
        {
            ret[i] = heap.poll();
        }
        
        return ret;
    }
}
