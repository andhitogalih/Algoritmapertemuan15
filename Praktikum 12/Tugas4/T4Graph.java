package Tugas4;

public class T4Graph {
    int vertex;
    LinkedLists list[];

    public T4Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for(int i=0; i<vertex; i++){
            list[i] = new LinkedLists();
        }
    }

    public void addEdge(int source, int destination){
        //add Edge
        list[source].addFirst(destination);
        //add back edge (for undirected)
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception{
        //degree undirected graph
        System.out.println("degree vertex " + source + " : " + list[source].size());

        //degree directed graph
        //inDegree
        int k, totalIn = 0, totalOut = 0;
        for(int i=0; i<vertex; i++){
            for(int j=0; j<list[i].size(); j++){
                if(list[i].get(j) == source){
                    ++totalIn;
                }
            }
            //outDegree
            for(k=0; k<list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn+totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception{
        for(int i=0; i<vertex; i++){
            if(i == destination){
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges(){
        for(int i=0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    
    public void printGraph() throws Exception{
        String kota = "";
        for(int i=0; i<vertex; i++){
            if(list[i].size() > 0){
                if ( i == 0){
                    kota = "Gresik";
                } else if (i == 1){
                    kota = "Bandung";
                } else if (i == 2){
                    kota = "Yogyakarta";
                } else if (i == 3){
                    kota = "Malang";
                } else if (i == 4){
                    kota = "Surabaya";
                } else {
                    kota = "Denpasar";
                }
                System.out.print("Vertex " + kota + " terhubung dengan: ");
                for(int j=0; j<list[i].size(); j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }


        // for(int i=0; i<vertex; i++){
        //     if(list[i].size() > 0){
        //         System.out.print("Vertex " + i + " terhubung dengan: ");
        //         for(int j=0; j<list[i].size(); j++){
        //             System.out.print(list[i].get(j) + " ");
        //         }
        //         System.out.println("");
        //     }
        // }
        // System.out.println(" ");
        }
    }

    // Tugas Nomor 2
    public boolean graphType(boolean pilih){
        return pilih;
    }
}