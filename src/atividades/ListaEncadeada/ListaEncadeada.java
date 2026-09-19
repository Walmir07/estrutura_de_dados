public class ListaEncadeada {

    private Nodo primeiro;
    private int tamanho;

    public int size() {
        return tamanho;
    }

    public void add(Object elemento) {
        Nodo novo = new Nodo(elemento);

        if (primeiro == null) {
            primeiro = novo;
        } else {
            Nodo atual = primeiro;

            while (atual.prox != null) {
                atual = atual.prox;
            }

            atual.prox = novo;
        }

        tamanho++;
    }

    public Nodo get(int index) {

        if (index < 0 || index >= tamanho) {
            return null;
        }

        Nodo atual = primeiro;

        for (int i = 0; i < index; i++) {
            atual = atual.prox;
        }

        return atual;
    }

    public void add(int index, Object elemento) {

        if (index < 0 || index > tamanho) {
            return;
        }

        Nodo novo = new Nodo(elemento);

        if (index == 0) {
            novo.prox = primeiro;
            primeiro = novo;
            tamanho++;
            return;
        }

        Nodo anterior = primeiro;

        for (int i = 0; i < index - 1; i++) {
            anterior = anterior.prox;
        }

        novo.prox = anterior.prox;
        anterior.prox = novo;

        tamanho++;
    }

    public void remove(int index) {

        if (index < 0 || index >= tamanho) {
            return;
        }

        if (index == 0) {
            primeiro = primeiro.prox;
            tamanho--;
            return;
        }

        Nodo anterior = primeiro;

        for (int i = 0; i < index - 1; i++) {
            anterior = anterior.prox;
        }

        anterior.prox = anterior.prox.prox;
        tamanho--;
    }
    
}