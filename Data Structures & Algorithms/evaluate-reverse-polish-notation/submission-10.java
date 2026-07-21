class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String c : tokens)
        {
            if (c.matches("-?[0-9]+"))
            {
                stack.push(c);
            }
            else
            {
                if (stack.empty()) return -1;
                int two = Integer.parseInt(stack.pop());
                int one = Integer.parseInt(stack.pop());

                switch(c)
                {
                    
                    case "+":
                        stack.push("" + (one + two));
                        break;
                    case "-":
                        stack.push("" + (one - two));
                        break;
                    case "*":
                        stack.push("" + (one * two));
                        break;
                    case "/":
                        stack.push("" + (one / two));
                        break;    
                }
            }

        }
        return Integer.parseInt(stack.pop());
    }
}
