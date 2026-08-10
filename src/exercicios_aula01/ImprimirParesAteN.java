package exercicios_aula01;

public class ImprimirParesAteN {

    public static void imprimirPares(int valor){

        if(valor == 0) {
            System.out.println(0);
        } else if(valor % 2 == 0) {
            System.out.println(valor + " ");
            imprimirPares(valor - 2);
        } else {
            imprimirPares(valor - 1);
        }

    }

}
