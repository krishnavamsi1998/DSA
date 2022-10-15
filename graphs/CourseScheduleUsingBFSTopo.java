//O(N+E),O(N)+O(N)

class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        //first lets create adjacency list
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());

        for(ArrayList<Integer> arr:prerequisites)
        {
            int course=arr.get(0);
            int pre=arr.get(1);
            
            adj.get(pre).add(course);
            
            
        }
        //now find topo using bfs
        int[] indegree=new int[n];
      for(int i=0;i<n;i++){
          for(Integer it:adj.get(i)){
              indegree[it]++;
          }
      }
      Queue<Integer> q=new LinkedList<>();
      for(int i=0;i<n;i++){
          if(indegree[i]==0) q.offer(i);
      }
      int[] topo=new int[n];
      int index=0;
      while(!q.isEmpty()){
          int curr=q.poll();
          topo[index++]=curr;
          
          for(Integer it:adj.get(curr)){
              indegree[it]--;
              if(indegree[it]==0){
                  q.offer(it);
              }
          }
      }
      
      //if found return topo else return empty
      if(index==n)
      return topo;
      else
      return new int[]{};
       
    }
}
