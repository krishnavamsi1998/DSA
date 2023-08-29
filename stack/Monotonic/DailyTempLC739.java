//O(n),O(n)
// monotonic dec stack
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n=temperatures.length;

        int[] res=new int[n];

        Stack<int[]> stack=new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && stack.peek()[0]<temperatures[i])
            {
               int index=stack.peek()[1];               
               res[index]=i-index;
               stack.pop();

            }
            stack.push(new int[]{temperatures[i],i});
           
        }

    return res;
    }
}
