//O(n),O(n+n)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words=s.split(" ");
        
        if(pattern.length()!=words.length)
            return false;
        
        HashMap<Character,String> charToWord=new HashMap<>();
        HashMap<String,Character> wordToChar=new HashMap<>();

        for(int i=0;i<words.length;i++)
        {
            char ch=pattern.charAt(i);
            String word=words[i];
            if(charToWord.containsKey(ch) && !charToWord.get(ch).equals(word))
            return false;

            if(wordToChar.containsKey(words[i]) && !wordToChar.get(word) .equals(ch))
            return false;

            charToWord.put(ch,word);
            wordToChar.put(word,ch);
        }

    return true;
    }
}
