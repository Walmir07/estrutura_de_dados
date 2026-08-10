package exercicios_aula01;

import exercicios_aula01.SomaValoresVetor;

import java.util.ArrayList;
import java.util.List;

public class SomaValoresVetorTeste {

    public static void main(String[] args) {

        List<Integer> vetor = new ArrayList<>(List.of(1, 2, 3));

        int resultado = SomaValoresVetor.somaValoresVetor(vetor, 0);

        System.out.println(resultado);

    }

}
