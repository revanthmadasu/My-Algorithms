/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class MaximumSpanningTree {
   static class NodePair implements Comparable<NodePair>{
      int nodeNum1;
      int nodeNum2;
      int cost;
      NodePair(int n1,int n2,int cost)
      {
         nodeNum1=n1;
         nodeNum2=n2;
         this.cost=cost;
      }
      public int compareTo(NodePair n)
      {
          return n.cost-this.cost;
      }
	@Override
	public String toString() {
		return "NodePair [nodeNum1=" + nodeNum1 + ", nodeNum2=" + nodeNum2 + ", cost=" + cost + "]";
	}
      
   }
   static class UnionFind
   {
	   int id[];
	   int size[];
	   int numOfSets;
	   UnionFind(int size)
	   {
		   id=new int[size];
		   this.size=new int[size];
		   for(int i=0;i<size;++i)
		   {
			   id[i]=i+1;
			   this.size[i]=1;
		   }
		   numOfSets=size;
	   }
	   
	   public int find(int v)
	   {
		   int root=v;
		   while(root!=id[root-1])root=id[root-1];
		   while(v!=root)
		   {
			   int next=id[v-1];
			   id[v-1]=root;
			   v=next;
		   }
		   return root;
	   }
	   public int size(int v)
	   {
		   return size[v-1];
	   }
	   public boolean union(int v1,int v2)
	   {
		   int root1=find(v1);
		   int root2=find(v2);
		   if(root1==root2) return false;
		   if(size[root1-1]>size[root2-1])//merge group2 into group1
		   {
			   size[root1-1]+=size[root2-1];
			   id[root2-1]=root1;
		   }
		   else
		   {
			   size[root2-1]+=size[root1-1];
			   id[root1-1]=root2;
		   }
		   --numOfSets;
		   return true;
	   }

	@Override
	public String toString() {
		return "UnionFind [id=" + Arrays.toString(id) + ", size=" + Arrays.toString(size) + "]";
	}
	   
   }
   public static void main(String args[] ) throws Exception {

	//Write code here
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    for(int t_i=0;t_i<t;++t_i)
    {
        int nodesSize=s.nextInt();
        int edgesSize=s.nextInt();
        UnionFind uf=new UnionFind(nodesSize);
        boolean visited[]=new boolean[nodesSize];
        for(int i=0;i<nodesSize;++i)
            visited[i]=false;
        ArrayList<NodePair> nodes=new ArrayList();
        for(int i=0;i<edgesSize;++i)
        {
            int node1=s.nextInt();
            int node2=s.nextInt();
            int cost=s.nextInt();
            nodes.add(new NodePair(node1,node2,cost));
        }
        //System.out.println(nodes);
        Collections.sort(nodes);
        int totalCost=0;
        for(NodePair node:nodes)
        {
        	if(uf.numOfSets==1)break;
        	if(uf.union(node.nodeNum1, node.nodeNum2))
        		totalCost+=node.cost;
        }
        System.out.println(totalCost);
    }
   }
}
