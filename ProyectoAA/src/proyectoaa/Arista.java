/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaa;

/**
 *
 * @author Alexy
 */
public class Arista {
    String Nombre;
    int Vertice1;
    int Vertice2;
    int peso;
    public Arista(String Nombre, int Vertice1, int Vertice2) {
        this.Nombre = Nombre;
        this.Vertice1 = Vertice1;
        this.Vertice2 = Vertice2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int getVertice1() {
        return Vertice1;
    }

    public void setVertice1(int Vertice1) {
        this.Vertice1 = Vertice1;
    }

    public int getVertice2() {
        return Vertice2;
    }

    public void setVertice2(int Vertice2) {
        this.Vertice2 = Vertice2;
    }

    @Override
    public String toString() {
        return "Arista{" + "Nombre=" + Nombre + ", Vertice1=" + Vertice1 + ", Vertice2=" + Vertice2 + '}';
    }
}
