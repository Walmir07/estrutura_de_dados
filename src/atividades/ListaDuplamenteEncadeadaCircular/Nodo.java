package atividades.ListaDuplamenteEncadeadaCircular;

public class Nodo {
    public int valor;
    public Nodo ant;
    public Nodo prox;

    public Nodo(int valor){
        this.valor = valor;
        this.ant = null;
        this.prox = null;
    }
}
