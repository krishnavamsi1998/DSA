//O(N+2E),O(N)
class Solution {
    // Function to return Breadth First Traversal of given graph.
    
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        //create result and visited matrix
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] vis=new boolean[V+1];
        //visit each and evry vertex and call bfs
            //create queue
            
            Queue<Integer> queue=new LinkedList<>();
            queue.add(0);
            vis[0]=true;
            while(!queue.isEmpty())
            {
                Integer node=queue.poll();
                res.add(node);
                
                //get all adjacent nodes of node and add to queue
                
                for(Integer adjNode:adj.get(node))
                {
                    if(vis[adjNode]==false){
                        vis[adjNode]=true;
                    queue.add(adjNode);
                    
                    }
                }
                
            }
        return res;
        
    }
   
}
