//O(n),O(n)
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
       Map<String,Integer> map=new HashMap<>();
       List<String> res=new ArrayList<>();

        int n=s.length();

        for(int i=0;i<n-9;i++)
        {
            String dna=s.substring(i, i+10);
            //already present , so 2 times repeated
            if(map.containsKey(dna))
            {
                map.put(dna, map.get(dna)+1);
            }
            else
            {
                map.put(dna, 1);
            }
            if(map.get(dna)==2)
                res.add(dna);

        }

        return res;

    }
}
