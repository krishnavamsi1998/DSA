//O(n),O(1)
class Solution {

    public char convertToLowerCase(char ch)
    {
        int asc=(int)ch;
        if(asc>=65 && asc<=90)
            return Character.toLowerCase(ch);
        return ch;
    }

    public boolean isChInRange(char ch)
    {
        int asc=(int)ch;
        if((asc>=65 && asc<=90) || (asc>=97 && asc<=122) || (asc>=48 && asc<=57))
            return true;
        return false;
    }

    public boolean isPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<j)
        {
            while(i<s.length() && !isChInRange(s.charAt(i)))
                i++;

            while(j>=0 && !isChInRange(s.charAt(j)))
                j--;

            if(i<s.length() && j>=0 && convertToLowerCase( s.charAt(i))!=convertToLowerCase( s.charAt(j)))
                return false;

            i++;
            j--;
            
        }
        return true;        
    }
}
