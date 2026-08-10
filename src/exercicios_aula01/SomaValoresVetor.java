package exercicios_aula01;

import java.util.ArrayList;
import java.util.List;

public class SomaValoresVetor {

    public static int somaValoresVetor(List<Integer> vetor, int indice){
        if(vetor.size() <= indice) {
            return 0;
        }

        return vetor.get(indice) + somaValoresVetor(vetor, indice + 1);
    }

}
