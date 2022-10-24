//O(n),O(2n)
class Solution {
    public boolean isIsomorphic(String s, String t) {       
        
        
        Map<Character,Character> smap=new HashMap<>();
		Map<Character,Character> tmap=new HashMap<>();
		
        //given both strings lengths same 
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
            char c2=t.charAt(i);
            //if already mapped by different char
            if((smap.containsKey(c1) && smap.get(c1)!=c2) || (tmap.containsKey(c2) 
               && tmap.get(c2)!=c1))            
           return false;
			
            //conversion
			smap.put(c1,c2);
            tmap.put(c2,c1);			
			
		}
        
        return true;
		
		
    }
}
