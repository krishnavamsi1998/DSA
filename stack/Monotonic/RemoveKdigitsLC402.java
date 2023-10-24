//O(n),O(n)
//neetcode
class Solution {
    public String removeKdigits(String num, int k) {
        // monotonic inc stack
        Stack<Character> st=new Stack<>();
        
        for(Character ch: num.toCharArray())
        {
            while(!st.isEmpty() && k>0 && ch < st.peek())
            {
                st.pop();
                k--;
            }
            //avoid only leading zeros
            if(ch!='0' || !st.isEmpty() )
            {
                st.push(ch);
            }
        }

        // 1 2 3 4 , still k is left , so remove trailing chars
        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
        // they want to return 0
        if(st.isEmpty())
            return "0";


        // return ans in reverse way
        String res="";
        while(!st.isEmpty())
        {
            res=st.pop()+res;
        }
        return res;
    }
}
