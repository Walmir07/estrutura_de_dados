package exercicios_aula01;

public class Fatorial {

    public static int fatorial(int valor){
        if(valor == 1 || valor ==0){
            return 1;
        }

        return valor * fatorial(valor - 1);
    }

    public static void main(String[] args) {
        int fatorialTeste = 5;

        System.out.println(fatorial(fatorialTeste));
    }

    public static class AcharMenorValorTeste {



    }
}
