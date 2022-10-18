class MyStack {
    
    Queue<Integer> q;
    
    public MyStack() {
        
        this.q=new LinkedList<>();        
            
    }
    
    public void push(int x) {
        
        //logic
        q.add(x);
        //pop n-1 elements and push 
        
        for(int i=0;i<q.size()-1;i++)
        q.add(q.poll());
        
        
        
    }
    
    public int pop() {
        return q.poll();
        
    }
    
    public int top() {
        return q.peek();
            
    }
    
    public boolean empty() {
        
        return q.size()==0;
        
    }
}
