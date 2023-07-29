//O(n),O(1)

class Solution {
    public int maxNumberOfBalloons(String text) {
        String balloon="balloon";
        Map<Character,Integer> balloonMap=new HashMap<Character,Integer>();

        for(Character c : balloon.toCharArray())       
           
                balloonMap.put(c, balloonMap.getOrDefault(c,0)+1 );
           
        

        Map<Character,Integer> textMap=new HashMap<>();

        for(Character c : text.toCharArray() )
        {
            //only ballon characters
            if(balloonMap.containsKey(c))
                textMap.put(c,textMap.getOrDefault(c,0)+1);
           

        }
    int res=Integer.MAX_VALUE;
        for(Character c: balloonMap.keySet())
        {
           res=Integer.min(res, textMap.getOrDefault(c,0)/ balloonMap.get(c));
        }
        return res;
    }
}
