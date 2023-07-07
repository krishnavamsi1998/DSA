//i.like.this.program.very.much
//much.very.program.this.like.i
//O(n),O(n)
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] sarr=S.split("[.]",0);
        
        int n=sarr.length;
        String res="";
        
        for(int i=n-1;i>=0;i--)
        {
            if(i==0)
                res=res+sarr[i];
            else
                res=res+sarr[i]+".";
                
        }
        
        return res;
    }
}
