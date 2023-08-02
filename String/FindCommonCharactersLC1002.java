//O(n),O(1)
class Solution {
    public List<String> commonChars(String[] words) {
        
       List<String> res=new ArrayList<>();

    for(char c='a' ; c<='z' ;c++)
    {
            int min=Integer.MAX_VALUE;

            for(String s : words){
                int wordCount=0;
                for(char curr_char:s.toCharArray())
                {
                    if(curr_char==c)
                        wordCount++;
                }

                min=Math.min(min,wordCount);
            }

            for(int i=0;i<min;i++)
            {
                res.add(""+c);
            }
    }
    return res;
    
    }
}
