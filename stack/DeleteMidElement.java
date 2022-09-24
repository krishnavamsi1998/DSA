//O(n),O(n)

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        
        Stack<Integer> stack=new Stack<>();
        int size=sizeOfStack;
        int c=0;
        //pop and push to new stack till mid element
        while(c<size/2)
        {
        stack.push(s.pop());
        c++;
        }
        //pop the mid element
        s.pop();
        //push popped element 
        while(!stack.isEmpty())
        {
            s.push(stack.pop());
        }
        
        
    } 
}
