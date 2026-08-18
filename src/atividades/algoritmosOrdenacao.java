package atividades;

public class algoritmosOrdenacao {
    public static void bubbleSort(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length - 1 - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    int aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
      
        int[] listinha = {6, 3, 1, 4, 5, 2};

        bubbleSort(listinha);

        for (int n : listinha) {
            System.out.print(n + " ");
        }
      
    }

}
