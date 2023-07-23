//O(n) , n= len of string
class Solution {
    public void reverseString(char[] s) {
        int l,r;
        l=0;
        r=s.length-1;

        while(l<r)
        {
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;

        }

    }
}
