//O(n),O(n)
//remove k consecutive duplicates
//k=3
// appqqqpa
// app(qqq)pa
// a(ppp)a
// aa -> res

class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Pair> st=new Stack<>();

        for(char c:s.toCharArray())
        {
            if(st.isEmpty() || st.peek().character!=c)
                st.push(new Pair(c,1));
            else if(st.peek().character==c)
                if(st.peek().count<k-1)
                    st.peek().count++;
                else if(st.peek().count==k-1)
                    st.pop();

        }
        StringBuilder sb=new StringBuilder();
        for(Pair p:st)
        {
            while(p.count>0)
                {
                        sb.append(p.character);
                        p.count--;
                }
        }

        return sb.toString();

    }

    class Pair{

        char character;
        int count;

        public Pair(char character,int count)
        {
            this.character=character;
            this.count= count;
        }

    }
}
