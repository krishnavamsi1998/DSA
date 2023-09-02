
//O(?),O(n)
// neetcode
class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res=new ArrayList<>();

        backtrack(res,"",0,0,n);

        return res;
    }

    public void backtrack(List<String> res,String s,int open , int close,int n)
    {
        //base
        if(s.length()==n*2)
        {
            res.add(s);
            return;
        }

        if(open < n)
            backtrack(res, s+"(", open+1, close,n);
        // only valid if no of close paran is less than open paran
        if(close < open)
            backtrack(res, s+")" , open , close+1, n);

    }
}
