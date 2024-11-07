package org.example;

public class Main {
    public static void main(String[] args) {

        // Crear nodos
        Nodo raiz = new Nodo(1);
        raiz.izquierdo = new Nodo(2);
        raiz.derecho = new Nodo(3);
        raiz.izquierdo.izquierdo = new Nodo(4);
        raiz.izquierdo.derecho = new Nodo(5);
        raiz.derecho.izquierdo = new Nodo(6);
        raiz.derecho.derecho = new Nodo(7);

        // Crear el árbol binario y buscar el nivel de un nodo
        ArbolBinario arbol = new ArbolBinario();
        Nodo nodoBuscado = raiz.izquierdo.derecho; // Nodo con valor 5
        int nivel = arbol.encontrarNivel(raiz, nodoBuscado, 0);

        System.out.println("El nivel del nodo buscado es: " + nivel);
    }
}