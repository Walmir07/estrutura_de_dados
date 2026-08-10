package exercicios_aula01;

public class AcharMenorValor {

    public static int acharMenorValor(int[] lista, int posicao){
        if(posicao == lista.length - 1) {
            return lista[posicao];
        }

        if(lista[posicao] < acharMenorValor(lista, posicao + 1)){
            return lista[posicao];
        } else {
            return acharMenorValor(lista, posicao + 1);
        }
    }

}
