class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        int l = 0;
        int r = 0;

        HashSet<Character> set = new HashSet<>();
        while (r < s.length())
        {
            
            char cur = s.charAt(r);
            if (set.contains(cur))
            {
                set.remove(s.charAt(l));
                l++;
                            
            }
            else
            {
                set.add(cur);
                r++;
            }

            if (r - l > ret)
            {
                ret = r - l;
            }
        }
        return ret;
    }
}
