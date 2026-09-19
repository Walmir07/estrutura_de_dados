public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println(lista.size()); // 3

        System.out.println(lista.get(0).valor); // 10
        System.out.println(lista.get(1).valor); // 20
        System.out.println(lista.get(2).valor); // 30

        lista.add(1, 15);

        System.out.println(lista.get(1).valor); // 15

        lista.remove(2);

        System.out.println(lista.get(2).valor); // 30
        System.out.println(lista.size());       // 3
    }
}