class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int largest = 0;
        int result = 0;

        for (int r = 0; r < s.length(); r++)
        {
            char cur = s.charAt(r);
            freq[cur - 'A']++;

            largest = Math.max(largest, freq[cur - 'A']);

            while ((r - l + 1) - largest > k)
            {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
