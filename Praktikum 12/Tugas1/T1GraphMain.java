package Tugas1;

import java.util.Scanner;

public class T1GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan vertex: ");
        int vertex = input.nextInt();
        T1Graph graph = new T1Graph(vertex);

        System.out.print("Masukkan jumlah edges: ");
        int edge = input.nextInt();

        for(int i=0; i<edge; i++){
            System.out.print("Masukkan Source Ke-" + (i+1) + " : ");
            int source = input.nextInt();
            System.out.print("Masukkan Destination Ke-" + (i+1) + " : ");
            int dest = input.nextInt();
            
            graph.addEdge(source, dest);
        }
        System.out.println();
        graph.printGraph();

        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 4);
        // graph.addEdge(1, 2);
        // graph.addEdge(1, 3);
        // graph.addEdge(1, 4);
        // graph.addEdge(2, 3);
        // graph.addEdge(3, 4);
        // graph.addEdge(3, 0);
        // graph.printGraph();
        // graph.degree(2);
        
        // graph.removeEdge(1, 2);
        // graph.printGraph();
    }
}
