package Tugas3;

import java.util.Scanner;

public class T3GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean type;
        int pil;
        char ulang;
        do {
            System.out.println("Jenis-Jenis Graph: ");
            System.out.println("1. Directed ");
            System.out.println("2. Undirected ");
            System.out.print("Masukkan pilihan jenis graph: ");
            pil =  input.nextInt();
            do {
                switch(pil){
                    case 1:
                        System.out.println("\nDIRECTED GRAPH");
                        type = true;
                        break;
                    case 2:
                        System.out.println("\n UNDIRECTED GRAPH");
                        type = false;
                        break;
                    default:
                        System.out.println("Inputan Anda Salah!");
                        System.exit(0);
                        break;
                }
        
                System.out.println();
                System.out.print("Masukkan vertex: ");
                int vertex = input.nextInt();
                T3Graph graph = new T3Graph(vertex);
                System.out.print("Masukkan jumlah edge: ");
                int edge = input.nextInt();
                System.out.println();
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
                graph.removeEdge(3, 4);
                graph.printGraph();
            } while (pil == 1 && pil == 2);
                System.out.print("Apakah ingin kembali ke menu jenis graph (Y/N): ");
                ulang = input.next().charAt(0);
                System.out.println();

        } while (ulang == 'y' || ulang == 'Y');
          System.out.println("TERIMA KASIH...");
    //     Graph graph = new Graph(6);
    //     graph.addEdge(0, 1);
    //     graph.addEdge(0, 4);
    //     graph.addEdge(1, 2);
    //     graph.addEdge(1, 3);
    //     graph.addEdge(1, 4);
    //     graph.addEdge(2, 3);
    //     graph.addEdge(3, 4);
    //     graph.addEdge(3, 0);
    //     graph.printGraph();
    //     graph.degree(2);
        
    //     graph.removeEdge(1, 2);
    //     graph.printGraph();
    }
}
