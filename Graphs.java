// Adjacency List naigbor
// import java.util.*;

// public class Graphs{
//   static class Edge{
//     int src;
//     int dest;

    
//   public Edge(int s, int d){
//     this.src = s;
//     this.dest = d;
//   }
//   }

//   public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//       graph[i] = new ArrayList<Edge>();

//     }

//     graph[0].add(new Edge(0, 2));
//     graph[1].add(new Edge(1, 2));
//     graph[1].add(new Edge(1, 3));
//     graph[2].add(new Edge(2, 0));
//     graph[2].add(new Edge(2, 1));
//     graph[2].add(new Edge(2, 3));
//     graph[3].add(new Edge(3, 1));
//     graph[3].add(new Edge(3, 2));



//   }

//   public static void main(String[] args) {
//       int V = 4;

//       ArrayList<Edge> graph[] = new ArrayList[V];


//       //print 2's neighbours
//       createGraph(graph);
       
//       for(int i=0; i<graph[2].size(); i++){
//         Edge e = graph[2].get(i);
//         System.out.print(e.dest+" ");
//       }
//   }
// }




// Adjacency List naigbor


// import java.util.*;

// public class Graphs{
//   static class Edge{
//     int src;
//     int dest;
//     int wt;

    
//   public Edge(int s, int d, int w){
//     this.src = s;
//     this.dest = d;
//     this.wt = w;
//   }
//   }

//   public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//       graph[i] = new ArrayList<Edge>();

//     }

//     graph[0].add(new Edge(0, 2, 2));
//     graph[1].add(new Edge(1, 2, 10));
//     graph[1].add(new Edge(1, 3, 0));
//     graph[2].add(new Edge(2, 0, 2));
//     graph[2].add(new Edge(2, 1, 10));
//     graph[2].add(new Edge(2, 3, -1));
//     graph[3].add(new Edge(3, 1, 0));
//     graph[3].add(new Edge(3, 2, -1));



//   }

//   public static void main(String[] args) {
//       int V = 4;

//       ArrayList<Edge> graph[] = new ArrayList[V];


//       //print 2's neighbours
//       createGraph(graph);
       
//       for(int i=0; i<graph[2].size(); i++){
//         Edge e = graph[2].get(i);
//         System.out.println(e.dest+" , "+e.wt);
//       }
//   }
// }







// BFS 




// import java.lang.reflect.Array;
// import java.util.*;

// public class Graphs{
//   static class Edge{
//     int src;
//     int dest;
  

    
//   public Edge(int s, int d){
//     this.src = s;
//     this.dest = d;

//   }
//   }

//   public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//       graph[i] = new ArrayList<Edge>();

//     }

//     graph[0].add(new Edge(0, 1));
//     graph[1].add(new Edge(0, 2));
//     graph[1].add(new Edge(1, 0));
//     graph[2].add(new Edge(1, 3));
//     graph[2].add(new Edge(2, 0));
//     graph[2].add(new Edge(2, 4));
//     graph[3].add(new Edge(3, 1));
//     graph[3].add(new Edge(3, 4));
//     graph[3].add(new Edge(3, 5));
//     graph[3].add(new Edge(4, 2));
//     graph[3].add(new Edge(4, 3));
//     graph[3].add(new Edge(4, 5));
//     graph[3].add(new Edge(5, 3));
//     graph[3].add(new Edge(5, 4));
//     graph[3].add(new Edge(5, 6));
//     graph[3].add(new Edge(6, 5));



//   }

//   public static void bfs (ArrayList<Edge> graph[], int V){
//     Queue<Integer> q = new LinkedList<>();
//     boolean vis[] = new boolean[V];
//     q.add(0);

//     while(!q.isEmpty()){
//       int curr = q.remove();
//       if(vis[curr] == false){
//         System.out.print(curr+" ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//           Edge e = graph[curr].get(i);
//           q.add(e.dest);
//         }
//       }
//     }
//   }
//   public static void main(String[] args) {
//       int V = 7;

//       /*


//       1 --- 3 
//     /       |\    
//    /        |  \
//   0         |   5 -- 6  
//    \        |  /
//     \       | /
//      2 ---  4
//        */

//       ArrayList<Edge> graph[] = new ArrayList[V];
//       createGraph(graph);

//       bfs(graph, V);
       
    
//   }
// }














// import java.lang.reflect.Array;
// import java.util.*;

// public class Graphs{
//   static class Edge{
//     int src;
//     int dest;
  

    
//   public Edge(int s, int d){
//     this.src = s;
//     this.dest = d;

//   }
//   }

//   public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//       graph[i] = new ArrayList<Edge>();

//     }

//     graph[0].add(new Edge(0, 1));
//     graph[1].add(new Edge(0, 2));
//     graph[1].add(new Edge(1, 0));
//     graph[2].add(new Edge(1, 3));
//     graph[2].add(new Edge(2, 0));
//     graph[2].add(new Edge(2, 4));
//     graph[3].add(new Edge(3, 1));
//     graph[3].add(new Edge(3, 4));
//     graph[3].add(new Edge(3, 5));
//     graph[3].add(new Edge(4, 2));
//     graph[3].add(new Edge(4, 3));
//     graph[3].add(new Edge(4, 5));
//     graph[3].add(new Edge(5, 3));
//     graph[3].add(new Edge(5, 4));
//     graph[3].add(new Edge(5, 6));
//     graph[3].add(new Edge(6, 5));



//   }

//   public static void bfs (ArrayList<Edge> graph[], int V, boolean  vis[], int start){
//     Queue<Integer> q = new LinkedList<>();
    
//     q.add(start);

//     while(!q.isEmpty()){
//       int curr = q.remove();
//       if(vis[curr] == false){
//         System.out.print(curr+" ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//           Edge e = graph[curr].get(i);
//           q.add(e.dest);
//         }
//       }
//     }
//   }
//   public static void main(String[] args) { //O(V + E)
//       int V = 7;

//       /*


//       1 --- 3 
//     /       |\    
//    /        |  \
//   0         |   5 -- 6  
//    \        |  /
//     \       | /
//      2 ---  4
//        */

//       ArrayList<Edge> graph[] = new ArrayList[V];
//       createGraph(graph);

//       boolean vis[] = new boolean[V];
//       for(int i=0; i<V; i++){
//         if(vis[i] == false){
//           bfs(graph, V, vis, i);
//         }
//       }

//   System.out.println();
       
    
//   }
// }




// DFS











// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         // 1
//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         // 2
//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         // 3
//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         // 4
//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         // 5
//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         // 6
//         graph[6].add(new Edge(6, 5));
//     }

//     // BFS Traversal
//     public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start) {

//         Queue<Integer> q = new LinkedList<>();

//         q.add(start);

//         while (!q.isEmpty()) {

//             int curr = q.remove();

//             if (!vis[curr]) {

//                 System.out.print(curr + " ");
//                 vis[curr] = true;

//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     // DFS Traversal
//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {

//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {

//             Edge e = graph[curr].get(i);

//             if (!vis[e.dest]) {
//                 dfs(graph, e.dest, vis);
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int V = 7;

//         /*
//               1 ----- 3
//             /         | \
//            /          |  \
//           0           |   5 ---- 6
//            \          |  /
//             \         | /
//              2 ------ 4
//         */

//         ArrayList<Edge> graph[] = new ArrayList[V];

//         createGraph(graph);

//         boolean vis[] = new boolean[V];
//         for(int i=0; i<V; i++){
//           if(vis[i] == false){
//             dfs(graph, i, vis);
//           }
//         }

//         // // DFS
//         // System.out.println("DFS Traversal:");
//         // boolean vis[] = new boolean[V];
//         // dfs(graph, 0, vis);

//         // BFS
//         System.out.println("\n\nBFS Traversal:");
//         vis = new boolean[V];
//         bfs(graph, V, vis, 0);
//     }
// }





// All paths from source to Target



// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         // 1
//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         // 2
//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         // 3
//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         // 4
//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         // 5
//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         // 6
//         graph[6].add(new Edge(6, 5));
//     }

//     // BFS Traversal
//     public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start) {

//         Queue<Integer> q = new LinkedList<>();

//         q.add(start);

//         while (!q.isEmpty()) {

//             int curr = q.remove();

//             if (!vis[curr]) {

//                 System.out.print(curr + " ");
//                 vis[curr] = true;

//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     // DFS Traversal
//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {

//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {

//             Edge e = graph[curr].get(i);

//             if (!vis[e.dest]) {
//                 dfs(graph, e.dest, vis);
//             }
//         }
//     }
// public static void printAllPath(ArrayList<Edge>[] graph, boolean[] vis,
//                                 int curr, String path, int tar) {

//     if (curr == tar) {
//         System.out.println(path);
//         return;
//     }

//     vis[curr] = true;

//     for (int i = 0; i < graph[curr].size(); i++) {
//         Edge e = graph[curr].get(i);

//         if (!vis[e.dest]) {
//             printAllPath(graph, vis, e.dest, path + " -> " + e.dest, tar);
//         }
//     }

//     vis[curr] = false; // Backtracking
// }

//    public static void main(String[] args) { //O(V^V)

//         int V = 7;

//         /*
//               1 ----- 3
//             /         | \
//            /          |  \
//           0           |   5 ---- 6
//            \          |  /
//             \         | /
//              2 ------ 4
//         */

//         ArrayList<Edge> graph[] = new ArrayList[V];

//         createGraph(graph);


//         int src = 0, tar = 5;
// printAllPath(graph, new boolean[V], src, "0", tar);
//     }
// }



// Cycle Detection


// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

   
//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 0));

     
//         graph[2].add(new Edge(2, 3));
//         graph[3].add(new Edge(3, 0));

       
//     }

   

//     public static boolean  isCycleDirected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean  rec[]){
//         vis [curr] =true;
//         rec[curr] =true;

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             if(rec[e.dest]){
//                 return true;
//             }else if(!vis[e.dest]){
//                if(isCycleDirected(graph, vis, e.dest, rec)) {
//                 return true;
//                }
//             }
//         }
//         rec[curr] = false;
//         return false;
//     }


//    public static void main(String[] args) { 

//         int V = 7;


//         ArrayList<Edge> graph[] = new ArrayList[V];

//         createGraph(graph);

//         boolean vis[] = new boolean[V];
//         boolean rec[] = new boolean[V];
//         for(int i=0; i<V; i++){
//             if(!vis[i]){
//                boolean isCycle = isCycleDirected(graph, vis, 0, rec);
//                if(isCycle){
//                 System.out.println(isCycle);
//                 break;
//                }
//             }
//         }
//  //  System.out.println(isCycleDirected(graph, new boolean[V], 0, new boolean[V]));


//     }
// }




// Topological Sorting





// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

   
//         graph[2].add(new Edge(2, 3));
//         graph[3].add(new Edge(3, 1));

     
//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));

//          graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));


       
//     }

   
// public static void toSortUtil(ArrayList<Edge> graph[], int curr, boolean  vis[], Stack<Integer> stack){

//   vis[curr] = true;

//   for(int i=0; i<graph[curr].size(); i++){
//     Edge e = graph[curr].get(i);

//     if(!vis[e.dest]){
//       toSortUtil(graph, e.dest, vis, stack);
//     }
//   }
//   stack.push(curr);
// }

// public static void topSort(ArrayList<Edge> graph[], int V){
//   boolean vis[] = new boolean[V];
//   Stack<Integer> stack = new Stack<>();

//   for(int i=0; i<V; i++){
//     if(!vis[i]){
//         toSortUtil(graph, i, vis, stack);
      
//     }
//   }
//   while(!stack.isEmpty()){
//     System.out.print(stack.pop()+" ");
//   }
  
// }
 
//    public static void main(String[] args) { 

//         int V = 6;

//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//     topSort(graph, V);

//     }
// }




// Cycle in Graphs





// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

   
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 4));

     
//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));
//         graph[1].add(new Edge(1, 4));


//          graph[2].add(new Edge(2, 1));
//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 2));


//         graph[4].add(new Edge(4, 0));
//        graph[4].add(new Edge(4, 1));
//         graph[4].add(new Edge(4, 5));


//         graph[5].add(new Edge(5, 4));
        




       
//     }

//    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
    
//     vis[curr] =true;

//     for(int i=0; i<graph[curr].size(); i++){
//       Edge e = graph[curr].get(i);
//       if(vis[e.dest] && e.dest != par){
//         return true;
//       }
//       else if(!vis[e.dest]){
//         if(isCycleUndirected(graph, vis, e.dest, curr)){
//           return true;
//         }
//       }
//     }

//     return false;
//    }

//    public static void main(String[] args) { 

//         int V = 6;

//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//   System.out.println(isCycleUndirected(graph, new  boolean[V], 0, V)); 

//     }
// }






// Dijkstra's Algorithm

// O (E + ElogV)

// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

   
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

     
//         graph[1].add(new Edge(1, 3, 7));
//         graph[1].add(new Edge(1, 2, 1));
        


//          graph[2].add(new Edge(2, 4, 3));
       


//         graph[3].add(new Edge(3, 5, 1));
//        graph[4].add(new Edge(4, 3, 2));
//         graph[4].add(new Edge(4, 5, 5));


        




       
//     }
// public static class Pair implements Comparable<Pair>{
//   int node;
//   int dist;

//   public Pair(int n, int d){
//     this.node = n;
//     this.dist = d;
//   }

//   @Override 
//   public int compareTo(Pair p2){
//     return this.dist - p2.dist; // ascending
//     // return p2.dist - this.dist 
//   }
// }
// public static void dijkstra(ArrayList<Edge> graph[], int src, int V) {

//     PriorityQueue<Pair> pq = new PriorityQueue<>();

//     int dist[] = new int[V];

//     for (int i = 0; i < V; i++) {
//         if (i != src) {
//             dist[i] = Integer.MAX_VALUE;
//         }
//     }

//     boolean vis[] = new boolean[V];

//     pq.add(new Pair(src, 0));

//     while (!pq.isEmpty()) {

//         Pair curr = pq.remove();

//         if (!vis[curr.node]) {

//             vis[curr.node] = true;

//             for (int i = 0; i < graph[curr.node].size(); i++) {

//                 Edge e = graph[curr.node].get(i);

//                 int u = e.src;
//                 int v = e.dest;

//                 if (dist[u] != Integer.MAX_VALUE &&
//                         dist[u] + e.wt < dist[v]) {

//                     dist[v] = dist[u] + e.wt;

//                     pq.add(new Pair(v, dist[v]));
//                 }
//             }
//         }
//     }

//     for (int i = 0; i < V; i++) {
//         System.out.print(dist[i] + " ");
//     }
//     System.out.println();
// }
//    public static void main(String[] args) { 

//         int V = 6;

//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//     dijkstra(graph, 0, V);
//     }
// }



// Bellman Ford Algorithm


// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

   
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

     
//         graph[1].add(new Edge(1, 2, -4));
      
        


//          graph[2].add(new Edge(2, 3, 2));
       


//         graph[3].add(new Edge(3, 4, 4));
//        graph[4].add(new Edge(4, 1, -1));
        

        




       
//     }

//     public static void bellmanFord(ArrayList<Edge> graph[], int src, int V){
//         int dist[] = new int [V];
//         for(int i=0; i<V; i++){
//             if(i!=src){
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }

//         for(int k=0; k<V-1; k++){ // O(V)
//             //O(E)
//             for(int i=0; i<V; i++){
//                 for(int j=0; j<graph[i].size(); j++){
//                     Edge e = graph[i].get(j);
//                     int u = e.src;
//                     int v = e.dest;

//                 if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
//                     dist[v] = dist[u] + e.wt;
//                 }
//                 }
//             }
//         }

//         for(int i=0; i<dist.length; i++){
//             System.out.print(dist[i]+ " ");
//         }

//         System.out.println();
//     }

//    public static void main(String[] args) { 

//         int V = 6;

//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         bellmanFord(graph, 0, V);
//     }
// }







// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

   
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

     
//         graph[1].add(new Edge(1, 2, -4));
      
        


//          graph[2].add(new Edge(2, 3, 2));
       


//         graph[3].add(new Edge(3, 4, 4));
//        graph[4].add(new Edge(4, 1, -10));
        

        




       
//     }

//     public static void bellmanFord(ArrayList<Edge> graph[], int src, int V){
//         int dist[] = new int [V];
//         for(int i=0; i<V; i++){
//             if(i!=src){
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }

//         for(int k=0; k<V-1; k++){ // O(V)
//             //O(E)
//             for(int i=0; i<V; i++){
//                 for(int j=0; j<graph[i].size(); j++){
//                     Edge e = graph[i].get(j);
//                     int u = e.src;
//                     int v = e.dest;

//                 if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
//                     dist[v] = dist[u] + e.wt;
//                 }
//                 }
//             }
//         }

// // detect -ve wt cycles
//   for(int i=0; i<V; i++){
//                 for(int j=0; j<graph[i].size(); j++){
//                     Edge e = graph[i].get(j);
//                     int u = e.src;
//                     int v = e.dest;

//                 if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
//                    System.out.println("negative wt cycle");
//                 }
//                 }
//             }











//         for(int i=0; i<dist.length; i++){
//             System.out.print(dist[i]+ " ");
//         }

//         System.out.println();
//     }

//    public static void main(String[] args) { 

//         int V = 6;

//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         bellmanFord(graph, 0, V);
//     }
// }






// Minimum spanning Tree Prim's Algorithm





// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

   
//         graph[0].add(new Edge(0, 1, 10));
//         graph[0].add(new Edge(0, 2, 15));
//         graph[0].add(new Edge(0, 3, 30));

     
//         graph[1].add(new Edge(1, 0, 10));
//         graph[1].add(new Edge(1, 3, 40));
      
        


//          graph[2].add(new Edge(2, 0, 15));
//          graph[2].add(new Edge(2, 3, 50));
       


//         graph[3].add(new Edge(3, 2, 40));
//        graph[3].add(new Edge(3, 2, 50));
        

        




       
//     }

//     public static class Pair implements Comparable<Pair>{
//       int node;
//       int cost;

//       public Pair(int n, int c){
//         this.node = n;
//         this.cost = c;
//       }

//       @Override 
//       public int compareTo(Pair p2){
//         return this.cost - p2.cost; //ascending
//       }
//     }

//     public static void primsAlgo(ArrayList<Edge> graph[], int V){
//       PriorityQueue<Pair> pq = new PriorityQueue<>(); 
//       boolean vis[] = new boolean[V];
//       pq.add(new Pair(0, 0));

//       int mstCost = 0;

//       while(!pq.isEmpty()){
//         Pair curr = pq.remove();
//         if(!vis[curr.node]){
//           vis[curr.node] = true;
//           mstCost += curr.cost;

//           for(int i=0; i<graph[curr.node].size(); i++){
//               Edge e = graph[curr.node].get(i);
//               if(!vis[e.dest]){
//                 pq.add(new Pair(e.dest, e.wt));
//               }
//           }
//         }
//       }

//       System.out.println("min cost of mst = "+ mstCost);


//     }
//    public static void main(String[] args) { 

//         int V = 6;

//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
  
//         primsAlgo(graph, V);
     
//     }
// }



// Strongly Connected Component

// Kosaraju's Alogorithm




// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;
    

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
     
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge> graph[]) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

   
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));
//         graph[1].add(new Edge(1, 0));
//          graph[2].add(new Edge(2, 1));
//        graph[3].add(new Edge(3, 4));
       
//     }


//      public static void toSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
//       vis[curr] = true;

//       for(int i=0; i<graph[curr].size(); i++){
//         Edge e = graph[curr].get(i);
//         if(!vis[e.dest]){
//           toSort(graph, e.dest, vis, s);
//         }
//       }
//       s.push(curr);
//      }

//      public static void dfs(ArrayList<Edge> graph[], int curr, boolean  vis[]){
//       vis[curr] = true;
//       System.out.print(curr+" ");

//       for(int i=0; i<graph[curr].size(); i++){
//         Edge e = graph[curr].get(i);
//         if(!vis[e.dest]){
//           dfs(graph, e.dest, vis);
//         }
//       }
//      }
//      public static void KosarajuAlgo(ArrayList<Edge> graph[],  int V){
//       // step 1 
//       Stack<Integer> s = new Stack<>();
//       boolean vis[] = new boolean[V];

//       for(int i=0; i<V; i++){
//         if(!vis[i]){
//           toSort(graph, i, vis, s);
//         }
//       }

//       // step 2

//       ArrayList<Edge> transpose[] = new ArrayList[V];
//       for(int i=0; i<graph.length; i++){
//         vis[i] =false;
//         transpose[i] = new ArrayList<Edge>();

//       }
//       for(int i=0; i<V; i++){
//         for(int j=0; j<graph[i].size(); j++){
//           Edge e = graph[i].get(j);
//           transpose[e.dest].add(new Edge(e.dest, e.src));

//         }
//       }

//       //step3

//   while(!s.isEmpty()){
//     int curr = s.pop();
//     if(!vis[curr]){
//       dfs(transpose, curr, vis);
//       System.out.println();
//     }
    
//   }


//      }
//    public static void main(String[] args) { 

//         int V = 6;

//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//      KosarajuAlgo(graph, V);
//     }
// }


// Bridge in Graphs Tarjan's Algorithms



// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge>[] graph) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//     }

//     static int time = 0;

//     // DFS for Bridge Detection
//     public static void dfs(ArrayList<Edge>[] graph, int curr, int par,
//                            boolean[] vis, int[] dt, int[] low) {

//         vis[curr] = true;
//         dt[curr] = low[curr] = ++time;

//         for (int i = 0; i < graph[curr].size(); i++) {

//             Edge e = graph[curr].get(i);

//             // Ignore parent
//             if (e.dest == par) {
//                 continue;
//             }

//             // Back Edge
//             if (vis[e.dest]) {
//                 low[curr] = Math.min(low[curr], dt[e.dest]);
//             }

//             // DFS
//             else {
//                 dfs(graph, e.dest, curr, vis, dt, low);

//                 low[curr] = Math.min(low[curr], low[e.dest]);

//                 // Bridge Condition
//                 if (dt[curr] < low[e.dest]) {
//                     System.out.println("BRIDGE : " + curr + " --- " + e.dest);
//                 }
//             }
//         }
//     }

//     // Find Bridges
//     public static void getBridge(ArrayList<Edge>[] graph, int V) {

//         int[] dt = new int[V];
//         int[] low = new int[V];
//         boolean[] vis = new boolean[V];

//         time = 0;

//         for (int i = 0; i < V; i++) {
//             if (!vis[i]) {
//                 dfs(graph, i, -1, vis, dt, low);
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int V = 6;

//         ArrayList<Edge>[] graph = new ArrayList[V];

//         createGraph(graph);

//         getBridge(graph, V);
//     }
// }









// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     // Create Graph
//     public static void createGraph(ArrayList<Edge>[] graph) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));
//        // graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 3));
//       //  graph[4].add(new Edge(4, 5));

//       //  graph[5].add(new Edge(5, 3));
//      //   graph[5].add(new Edge(5, 4));
//     }

//     static int time = 0;

//     // DFS for Bridge Detection
//     public static void dfs(ArrayList<Edge>[] graph, int curr, int par,
//                            boolean[] vis, int[] dt, int[] low) {

//         vis[curr] = true;
//         dt[curr] = low[curr] = ++time;

//         for (int i = 0; i < graph[curr].size(); i++) {

//             Edge e = graph[curr].get(i);

//             // Ignore parent
//             if (e.dest == par) {
//                 continue;
//             }

//             // Back Edge
//             if (vis[e.dest]) {
//                 low[curr] = Math.min(low[curr], dt[e.dest]);
//             }

//             // DFS
//             else {
//                 dfs(graph, e.dest, curr, vis, dt, low);

//                 low[curr] = Math.min(low[curr], low[e.dest]);

//                 // Bridge Condition
//                 if (dt[curr] < low[e.dest]) {
//                     System.out.println("BRIDGE : " + curr + " --- " + e.dest);
//                 }
//             }
//         }
//     }

//     // Find Bridges
//     public static void getBridge(ArrayList<Edge>[] graph, int V) {

//         int[] dt = new int[V];
//         int[] low = new int[V];
//         boolean[] vis = new boolean[V];

//         time = 0;

//         for (int i = 0; i < V; i++) {
//             if (!vis[i]) {
//                 dfs(graph, i, -1, vis, dt, low);
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int V = 6;

//         ArrayList<Edge>[] graph = new ArrayList[V];

//         createGraph(graph);

//         getBridge(graph, V);
//     }
// }



// Articulation Point

// import java.util.*;

// public class Graphs {

//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             src = s;
//             dest = d;
//         }
//     }

//     static int time = 0;

//     // Create Graph
//     public static void createGraph(ArrayList<Edge>[] graph) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));

//         graph[4].add(new Edge(4, 3));
//     }

//     public static void dfs(ArrayList<Edge>[] graph, int curr, int par,
//             boolean vis[], int dt[], int low[],
//             boolean isArticulation[]) {

//         vis[curr] = true;
//         dt[curr] = low[curr] = ++time;
//         int child = 0;

//         for (int i = 0; i < graph[curr].size(); i++) {

//             Edge e = graph[curr].get(i);

//             if (e.dest == par)
//                 continue;

//             if (vis[e.dest]) {
//                 low[curr] = Math.min(low[curr], dt[e.dest]);
//             } else {

//                 dfs(graph, e.dest, curr, vis, dt, low, isArticulation);

//                 low[curr] = Math.min(low[curr], low[e.dest]);

//                 if (par != -1 && dt[curr] <= low[e.dest]) {
//                     isArticulation[curr] = true;
//                 }

//                 child++;
//             }
//         }

//         if (par == -1 && child > 1) {
//             isArticulation[curr] = true;
//         }
//     }

//     public static void getArticulation(ArrayList<Edge>[] graph, int V) {

//         int dt[] = new int[V];
//         int low[] = new int[V];
//         boolean vis[] = new boolean[V];
//         boolean isArticulation[] = new boolean[V];

//         time = 0;

//         for (int i = 0; i < V; i++) {
//             if (!vis[i]) {
//                 dfs(graph, i, -1, vis, dt, low, isArticulation);
//             }
//         }

//         System.out.println("Articulation Points:");

//         for (int i = 0; i < V; i++) {
//             if (isArticulation[i]) {
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int V = 5;

//         ArrayList<Edge>[] graph = new ArrayList[V];

//         createGraph(graph);

//         getArticulation(graph, V);
//     }
// }