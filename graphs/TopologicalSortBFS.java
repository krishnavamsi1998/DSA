//O(N+E),O(N)+O(N)
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
       //res array which stores topological order of vertices
       int[] res=new int[V];
       // stores the indegree of each and evry vertex
       int[] inDegree=new int[V];
       
       //finding indegree
       for(int i=0;i<V;i++)
       {
           for(Integer adjNode:adj.get(i))
            inDegree[adjNode]++;
       }
       
       Queue<Integer> q=new LinkedList<>();
       
       //first push the vertices which has indegree 0
       
       for(int i=0;i<V;i++)
       {
           if(inDegree[i]==0)
           q.add(i);
       }
       
       //next for each vertex in queue take it out 
       // and find the adjNode and decrease its inDegree by 1
       // and if inDegree becomes 0 then push to queue
       int i=0;
       while(!q.isEmpty())
        {
            Integer node=q.poll();
            res[i++]=node;
            
            for(Integer adjNode:adj.get(node))
            {
                inDegree[adjNode]--;
                if(inDegree[adjNode]==0)
                q.add(adjNode);
            }
        }
        
        return res;
        
    }
    
}
