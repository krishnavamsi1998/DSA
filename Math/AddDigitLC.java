/O(1),O(1)
//https://leetcode.com/problems/add-digits/discuss/1754098/Simple-Math's-Approach-oror-Easy-Solution
class Solution {
    public int addDigits(int num) {
        
        if(num==0)
            return 0;
        else if(num%9==0)
            return 9;
        else 
            return num%9;
        
    }
}
