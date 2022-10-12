//O(N+E),O(N)+O(N)
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        //make visited array
        int[] vis=new int[V];
        //stack for storing dfs called vertices
        Stack<Integer> st=new Stack<>();
        
        //call dfs
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            dfs(i,vis,adj,st);
        }
        
        //craete res array for topologocal order of vertices
        int[] res=new int[V];
        int ind=0;
      
        while(!st.isEmpty())
        { 
        res[ind++]=st.pop();
        }
        
        return res;
        
    }
    
     static void dfs(int i,int[] vis,ArrayList<ArrayList<Integer>> adj,
    Stack<Integer> st)
    {
        //mark this node as visited 
        vis[i]=1;
        //get all adj nodes and make dfs call
        for(int adjNode:adj.get(i))
        {
            if(vis[adjNode]==0)
            dfs(adjNode,vis,adj,st);
        }
        
        //push curr node to stack
        st.push(i);
        
    }
    
    
}
