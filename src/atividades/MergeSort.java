package atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static List<Integer> mergeSort(List<Integer> a){
        if(a.size() <= 1){
            return a;
        }

        List<Integer> vetor1 = new ArrayList<>(a.subList(0, a.size()/2));
        List<Integer> vetor2 = new ArrayList<>(a.subList(a.size()/2, a.size()));

        vetor1 = mergeSort(vetor1);
        vetor2 = mergeSort(vetor2);

        return mesclar(vetor1, vetor2);
    }

    public static List<Integer> mesclar(List<Integer> a, List<Integer> b){
        List<Integer> vetorC = new ArrayList<>();

        while(!a.isEmpty() && !b.isEmpty()){
            if(a.get(0) > b.get(0)){
                vetorC.add(b.get(0));
                b.remove(0);
            } else {
                vetorC.add(a.get(0));
                a.remove(0);
            }
        }

        while(!a.isEmpty()){
            vetorC.add(a.get(0));
            a.remove(0);
        }

        while(!b.isEmpty()){
            vetorC.add(b.get(0));
            b.remove(0);
        }

        return vetorC;
    }

    public static void main(String[] args) {

        List<Integer> listaTeste = new ArrayList<>(Arrays.asList(38, 27, 43, 3, 9, 82, 10));
        List<Integer> resultado = MergeSort.mergeSort(listaTeste);
        System.out.println("Lista final: " + resultado);

    }
}
