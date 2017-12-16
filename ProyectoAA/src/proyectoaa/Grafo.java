/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaa;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Alexy
 */
public class Grafo {

    int Vertices;
    LinkedList<Integer> ListaAdyacencia[];

    public Grafo(int Vertices) {
        this.Vertices = Vertices;
    }

    void addEdge(int Vertice1, int Vertice2) {
        ListaAdyacencia[Vertice1].add(Vertice2);
        ListaAdyacencia[Vertice2].add(Vertice1);
    }

    void SetVertexAndAdjList(int Vertices) {
        this.Vertices = Vertices;
        ListaAdyacencia = new LinkedList[Vertices];

        for (int i = 0; i < Vertices; i++) {
            ListaAdyacencia[i] = new LinkedList();
        }
    }

    public void setVertices(int Vertices) {
        this.Vertices = Vertices;
    }

    public int getVertices() {
        return Vertices;
    }

    public LinkedList<Integer>[] getListaAdyacencia() {
        return ListaAdyacencia;
    }

    int[] greedyColoring() {
        int result[] = new int[Vertices];

        // Assign the first color to first vertex
        result[0] = 0;

        // Initialize remaining V-1 vertices as unassigned
        for (int u = 1; u < Vertices; u++) {
            result[u] = -1;  // no color is assigned to u
        }
        // A temporary array to store the available colors. True
        // value of available[cr] would mean that the color cr is
        // assigned to one of its adjacent vertices
        boolean available[] = new boolean[Vertices];
        for (int cr = 0; cr < Vertices; cr++) {
            available[cr] = false;
        }

        // Assign colors to remaining V-1 vertices
        for (int u = 1; u < Vertices; u++) {
            // Process all adjacent vertices and flag their colors
            // as unavailable
            Iterator<Integer> it = ListaAdyacencia[u].iterator();
            while (it.hasNext()) {
                int i = it.next();
                if (result[i] != -1) {
                    available[result[i]] = true;
                }
            }

            // Find the first available color
            int cr;
            for (cr = 0; cr < Vertices; cr++) {
                if (available[cr] == false) {
                    break;
                }
            }

            result[u] = cr; // Assign the found color

            // Reset the values back to false for the next iteration
            it = ListaAdyacencia[u].iterator();
            while (it.hasNext()) {
                int i = it.next();
                if (result[i] != -1) {
                    available[result[i]] = false;
                }
            }
        }

        // print the result
        for (int u = 0; u < Vertices; u++) {
            System.out.println("Vertex " + u + " --->  Color "
                    + result[u]);
        }
        return result;
    }
}
