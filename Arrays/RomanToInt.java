//O(n),O(n)

class Solution {
    public int romanToInt(String s) {
        
        //create map
        Map<Character,Integer> map=new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res=0;
        
        for(int i=0;i<s.length();i++)
        {
            
            
            //check for special cases i,e IV , IX etc
            if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                
                char currChar=s.charAt(i);
                char nextChar=s.charAt(i+1);
                
                res+=map.get(nextChar)-map.get(currChar);
                // increment , since we already considered next char
                i++;
            }
            else
            {
                char currChar=s.charAt(i);
                res+=map.get(currChar);
            }
        }
        
        return res;
        
    }
}
