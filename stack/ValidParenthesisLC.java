//O(n),O(n)
class Solution {
    public boolean isValid(String s) {
        
        //create stack of characters
        Stack<Character> st=new Stack<>();
        
        for(char ch:s.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
                continue;
            }
            //if close bracket appears first
            if(st.empty())
                return false;
            
            char top=st.pop();
            
            if(top=='(' && ch!=')')
                return false;
            if(top=='{' && ch!='}')
                return false;
            if(top=='[' && ch!=']')
                return false;
            
        }
        
        return st.empty();        
        
    }
}
