//O(n),O(n)
class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        String reverse = "";
        StringBuilder res=new StringBuilder("");
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                res = res.insert(0,s.charAt(i));
            } else {
                if (res.length() != 0) {
                    if(reverse.length()==0)
                        reverse =res.toString();
                    else
                        reverse = reverse + " " + res.toString();                   
                    res.setLength(0);
                }
            }
            i--;
        }
        if (res.length() != 0){
            if(reverse.length()==0)
                reverse =res.toString();
            else
                reverse = reverse + " " + res.toString();
        }
        return reverse;
    }
}
