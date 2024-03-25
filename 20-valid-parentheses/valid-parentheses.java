class Solution 
{
    public boolean isValid(String s) 
    {
        while(true)
        {
            if (s.contains("()"))
            s = s.replace("()", "");

            else if (s.contains("{}"))
            s = s.replace("{}", "");

            else if (s.contains("[]"))
            s = s.replace("[]", "");

            else
            return s.isEmpty();

        }

        //Using Stack:
        /*
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : s.toCharArray())
        {
            if(c == '(')
            stack.push(')');

            else if(c == '{')
            stack.push('}');

            else if(c == '[')
            stack.push(']');

            else if(stack.isEmpty() || stack.pop() != c)
            return false;
        }

        return stack.isEmpty();*/
    }
}