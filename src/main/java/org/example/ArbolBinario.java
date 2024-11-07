package org.example;

public class ArbolBinario {
    // Método para encontrar el nivel del nodo en el árbol
    public int encontrarNivel(Nodo raiz, Nodo nodo, int nivel) {
        // Si el árbol está vacío, regresamos -1
        if (raiz == null) {
            return -1;
        }

        // Si encontramos el nodo, retornamos el nivel actual
        if (raiz == nodo) {
            return nivel;
        }

        // Buscar en el subárbol izquierdo
        int nivelIzquierdo = encontrarNivel(raiz.izquierdo, nodo, nivel + 1);
        if (nivelIzquierdo != -1) {
            return nivelIzquierdo;
        }

        // Buscar en el subárbol derecho
        return encontrarNivel(raiz.derecho, nodo, nivel + 1);
    }
}