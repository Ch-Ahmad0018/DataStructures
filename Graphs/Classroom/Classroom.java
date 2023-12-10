import java.util.ArrayList;

public class Classroom{
    //Graph ke liye Edge class 
    //Edge mera kaise dikhna chahiye
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void CreateGraph(ArrayList<Edge>graph[]){//ArrayList of Edge type
     for (int i=0;i<graph.length;i++){                  //is graph mein loop lage gi kyun ke array ke index pe null hai usko hum empty array list
                               //mein convert krein gay
      graph[i]=new ArrayList<Edge>();
     }
     graph[0].add(new Edge(0, 2));
     graph[1].add(new Edge(1,2 ));
     graph[1].add(new Edge(1, 3));
     graph[2].add(new Edge(2,0 ));
     graph[2].add(new Edge(2, 1));
     graph[2].add(new Edge(2,3 ));
     graph[3].add(new Edge(3,1 ));
     graph[3].add(new Edge(3,2 ));
     
    }
    public static void main(String[] args) {
        int V=4;
       // Jis graph ko hum ne create krna hai
       ArrayList<Edge> graph[]=new ArrayList[V];//Array List of Edge Array List bnai gay Edge ki
       //In sab ArrayList<Edge> graph[];
       //Array list ka array bnai gay
     //  Aik Array bnai hai Graph k naam se jis mein ArrayList hai aur har arraylist mein edges hai
     CreateGraph(graph);
     System.out.println("Edges of 0 are");
     for (int i=0;i<graph[0].size();i++){
        Edge e=graph[0].get(i);
        System.out.println(" "+e.dest);
     }
     System.out.println("Edges of 1 are");
     for (int i=0;i<graph[1].size();i++){
        Edge e=graph[1].get(i);
        System.out.println(" "+e.dest);
     }
     System.out.println("Edges of 2 are");
     for (int i=0;i<graph[2].size();i++){
        Edge e=graph[2].get(i);
        System.out.println(" "+e.dest);
     }
     System.out.println("Edges of 3 are");
     for (int i=0;i<graph[3].size();i++){
        Edge e=graph[3].get(i);
        System.out.println(" "+e.dest);
     }
    }
}