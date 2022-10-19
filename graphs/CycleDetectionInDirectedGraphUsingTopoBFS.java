
//O(N+E),O(N)

class Solution {
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        //using bfs
        //first make inDegree array
        int[] ind=new int[V+1];
        
        for(int i=0;i<V;i++)
        {
            for(int adjNode:adj.get(i))
                ind[adjNode]++;
                
        }
        
       //make queue
       Queue<Integer> q=new LinkedList<>();
       //push vertices which has indegree 0
       
       for(int i=0;i<V;i++)
       {
           if(ind[i]==0)
           q.add(i);
           
       }
       
       //make count of topo nodes
       int c=0;
       
       while(q.isEmpty()==false)
       {
           int node=q.poll();
           c++;
           
           for(int adjNode:adj.get(node))
           {
               ind[adjNode]--;
               if(ind[adjNode]==0)
                    q.add(adjNode);
           }
       }
      
        //if we get all topo nodes then no cycle
        if(c==V)
        return false;
        
        return true;
    }
}
