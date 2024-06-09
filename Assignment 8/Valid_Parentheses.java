//Valid Parentheses

class Valid_Parentheses

{
    public boolean isValid(String s) 
    {
       char chars[]=s.toCharArray();
       Stack<Character> stack = new Stack<>();
       for(char i : chars)
      {
          if(i=='(' || i=='[' || i=='{')
          {
              stack.push(i);
              continue;
          }
          else if(stack.empty())
          {
              return false;
          }
          char top=stack.pop();
          if(top=='(' && i!=')')
          return false;
          else if(top=='[' && i!=']')
          return false;
          else if(top=='{' && i!='}')
          return false;
      }
      return stack.empty();
    }
}

