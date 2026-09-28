package atividades.ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {

    private Nodo2 primeiro;
    private int tamanho;

    public int size() {
        return tamanho;
    }

    public void add(Object elemento) {
        Nodo2 novo = new Nodo2(elemento);

        if (primeiro == null) {
            primeiro = novo;
        } else {
            Nodo2 atual = primeiro;

            while (atual.prox != null) {
                atual = atual.prox;
            }

            atual.prox = novo;
            novo.ant = atual;
        }

        tamanho++;
    }

    public Nodo2 get(int index) {
        if (index < 0 || index >= tamanho) {
            return null;
        }

        Nodo2 atual = primeiro;

        for (int i = 0; i < index; i++) {
            atual = atual.prox;
        }

        return atual;
    }

    public void add(int index, Object elemento) {
        if (index < 0 || index > tamanho) {
            return;
        }

        Nodo2 novo = new Nodo2(elemento);

        if (index == 0) {
            if (primeiro != null) {
                novo.prox = primeiro;
                primeiro.ant = novo;
            }
            primeiro = novo;
            tamanho++;
            return;
        }

        // Adicionando nas demais posições
        Nodo2 anterior = primeiro;

        for (int i = 0; i < index - 1; i++) {
            anterior = anterior.prox;
        }

        Nodo2 proximo = anterior.prox;

        novo.prox = proximo;
        novo.ant = anterior;
        anterior.prox = novo;

        if (proximo != null) {
            proximo.ant = novo;
        }

        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            return;
        }

        if (index == 0) {
            primeiro = primeiro.prox;
            if (primeiro != null) {
                primeiro.ant = null;
            }
            tamanho--;
            return;
        }

        Nodo2 anterior = primeiro;

        for (int i = 0; i < index - 1; i++) {
            anterior = anterior.prox;
        }

        Nodo2 removido = anterior.prox;
        Nodo2 proximo = removido.prox;

        anterior.prox = proximo;

        if (proximo != null) {
            proximo.ant = anterior;
        }

        tamanho--;
    }
}
