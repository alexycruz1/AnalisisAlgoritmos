/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaa;

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
    
    void addEdge(int Vertice1, int Vertice2){
        ListaAdyacencia[Vertice1].add(Vertice2);
        ListaAdyacencia[Vertice2].add(Vertice1);
    }
    
    void SetVertexAndAdjList(int Vertices){
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
}
