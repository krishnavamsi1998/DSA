//O(n),O(N)
//N-No of parts divided
//n- string length
public class DIvideNEqualParts
{
	public static void main(String[] args) {
	    String str="abcdef";
	    int len=str.length();
	    int n=2;
	    int strPartLen=len/n;
	    String[] strParts=new String[n];
	    int ind=0;
	    for(int i=0;i<len;i+=strPartLen)
	    {
	        String part=str.substring(i,i+strPartLen);
	        strParts[ind++]=part;
	    }
	    for(int i=0;i<n;i++)
	        System.out.println(strParts[i]);
	}
}
