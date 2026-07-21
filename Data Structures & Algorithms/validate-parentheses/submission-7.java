class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() < 2) return false;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
            {
                st.push(c);
            }
            else
            {
                if ((c == ')' || c == ']' || c == '}') && st.empty()) return false;
                

                
                if (c == ')')
                {
                    if (st.pop() != '(')
                    {
                        return false;
                    }
                
                }
                if (c == ']')
                {
                    if (st.pop() != '[')
                    {
                        return false;
                    }
                
                }
                if (c == '}')
                {
                    if (st.pop() != '{')
                    {
                        return false;
                    }
                
                }
            }
        }
        if (!st.empty()) return false;

        return true;
    }
}
