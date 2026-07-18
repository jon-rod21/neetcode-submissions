class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(); int n2 = s2.length();
        if (n1 > n2) return false;

        

        int[] need = new int[26];
        int[] window = new int[26];
        for (int i = 0; i < n1; i++)
        {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }
        
        if (matches(need, window)) return true;

        for (int r = n1; r < n2; r++)
        {
            window[s2.charAt(r) - 'a']++;
            window[s2.charAt(r - n1) - 'a']--;
            if(matches(need, window)) return true;
        }
        return false;
    }


    public boolean matches(int[] need, int[] window)
    {
        for (int i = 0; i < 26; i++)
        {
            if (need[i] != window[i]) return false;
        }
        return true;
    }
}
