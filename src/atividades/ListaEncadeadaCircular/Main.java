package atividades.ListaEncadeadaCircular;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaCircular listaCircular = new ListaEncadeadaCircular();

        listaCircular.add(7);
        listaCircular.add(15);
        listaCircular.add(17);
             
        System.out.println(listaCircular.get(0));
        
        listaCircular.remove(1);
        listaCircular.add(2, 6);
        System.out.println(listaCircular.size());


    }
}
