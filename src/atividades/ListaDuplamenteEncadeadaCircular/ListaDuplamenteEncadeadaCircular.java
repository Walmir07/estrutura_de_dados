package atividades.ListaDuplamenteEncadeadaCircular;

public class ListaDuplamenteEncadeadaCircular {
    public Nodo primeiro;
    public int tamanho;

    public int size(){
        return tamanho;
    }

    public void add(int valor){
        Nodo novo = new Nodo(valor);

        if(primeiro == null){
            primeiro = novo;
            primeiro.prox = primeiro;
            primeiro.ant = primeiro;
        } else {
            Nodo ultimo = primeiro.ant;

            novo.prox = primeiro;
            novo.ant = ultimo;
            
            ultimo.prox = novo;
            primeiro.ant = novo;
        }

        tamanho++;
    }

    public Nodo get(int index){
        if(index < 0 || index >= tamanho){
            return null;
        }

        Nodo atual = primeiro;
        for(int i = 0; i < index; i++){
            atual = atual.prox;
        }

        return atual;
    }

    public void add(int index, int valor){
        if(index < 0 || index > tamanho){            return ;
        }

        Nodo novo = new Nodo(valor);

        if(index == 0) {
            if(primeiro == null){
                primeiro = novo;
                primeiro.prox = primeiro;
                primeiro.ant = primeiro;
            } else {
                Nodo ultimo = primeiro.ant;

                novo.prox = primeiro;
                novo.ant = ultimo;
                
                primeiro.ant = novo;
                ultimo.prox = novo;

                primeiro = novo;
            }
        } else {
            Nodo anterior = primeiro;

            for(int i = 0; i < index-1; i++){
                anterior = anterior.prox;
            }

            Nodo posterior = anterior.prox;

            novo.prox = posterior;
            novo.ant = anterior;

            anterior.prox = novo;
            posterior.ant = novo;
        }

        tamanho++;
    }

    public void remove(int index){
        if(index < 0 || index >= tamanho){
            return;
        }

        if(tamanho == 1){
            primeiro = null;
        }
        else if(index == 0) {
            Nodo removido = primeiro;
            Nodo ultimo = primeiro.ant;

            primeiro = primeiro.prox;

            primeiro.ant = ultimo;
            ultimo.prox = primeiro;

            removido.prox = null;
            removido.ant = null;
        } else {
            Nodo alvo = primeiro;

            for(int i = 0; i < index; i++){
                alvo = alvo.prox;
            }

            Nodo anterior = alvo.ant;
            Nodo posterior = alvo.prox;

            anterior.prox = posterior;
            posterior.ant = anterior;
        }

        tamanho--;
    }

}
