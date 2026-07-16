class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String a : strs)
        {
            char[] ch = a.toCharArray();
            Arrays.sort(ch);
            String a_key = new String(ch);

            if (map.get(a_key) != null){
                List<String> a_list = map.get(a_key);
                a_list.add(a);
            }
            else
            {
                List<String> cur = new ArrayList<>();
                cur.add(a);
                map.put(a_key, cur);
            }
        }
        List<List<String>> ret = new ArrayList<>();
        for (List<String> i : map.values())
        {
            ret.add(i);
        }
        return ret;
    }
}
