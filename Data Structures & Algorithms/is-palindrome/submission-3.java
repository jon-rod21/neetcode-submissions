class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();

        int mid = s.length() / 2;

        if (s.length() % 2 == 0)
        {
            int left = mid - 1;
            int right = mid;

            while (left >= 0 && right < s.length())
            {
                if (s.charAt(left) != s.charAt(right))
                {
                    return false;
                }
                left--;
                right++;
            }
        }
        else
        {
            int left = mid - 1;
            int right = mid + 1;

            while (left >= 0 && right < s.length())
            {
                if (s.charAt(left) != s.charAt(right))
                {
                    return false;
                }
                left--;
                right++;
            }

        }
        return true;
    }
}
