import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public static void main(String[] args) throws IOException, InterruptedException {
    Graph graph = new Graph();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    new Random();

    while(graph.isGameIsRunning()) {
        System.out.println(" Type u, d, r, l for direction.");
        System.out.println(" Type  b to build a wall.");
        System.out.println(" Type  s to perform a special move.");
        String accStr = br.readLine();
        if (accStr.equals("b")) {
            graph.addEdge();
        } else {
            graph.move(accStr);
        }
    }

}
