package atividades.ListaEncadeadaCircular;

public class ListaEncadeadaCircular {
    private Nodo primeiro;
    private int tamanho;

    public int size(){
        return tamanho;
    }

    public void add(int valor){
        Nodo novo = new Nodo(valor);

        if(tamanho == 0){
            primeiro = novo;
            primeiro.prox = primeiro;
        } else {
            Nodo atual = primeiro;

            while(atual.prox != primeiro){
                atual.prox = atual;
            }

            novo.prox = primeiro;
            atual.prox = novo;
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
        if(index < 0 || index >= tamanho){
            return;
        }

        Nodo novo = new Nodo(valor);

        if(index == 0){
            if(primeiro == null){
                primeiro = novo;
                primeiro.prox = primeiro;
            } else {
                Nodo ultimo = primeiro;

                while(ultimo.prox != primeiro){
                    ultimo = ultimo.prox;
                }

                novo.prox = primeiro;
                primeiro = novo;
                ultimo.prox = primeiro;
            }  
        } else {
            Nodo anterior = primeiro;

            for(int i = 0; i < index -1; i++){
                anterior = anterior.prox;
            }

            novo.prox = anterior.prox;
            anterior.prox = novo;
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

        else if(index == 0){
            if(primeiro == null){
                return;
            } else {
                Nodo ultimo = primeiro;

                while(ultimo.prox != primeiro){
                    ultimo = ultimo.prox;
                }

                primeiro = primeiro.prox;
                ultimo.prox = primeiro;
            }
        } 
        
        else {
            Nodo anterior = primeiro;

            for(int i = 0; i < index -1; i++){
                anterior = anterior.prox;
            }

            anterior.prox = anterior.prox.prox;
        }

        tamanho--;
    }
}
