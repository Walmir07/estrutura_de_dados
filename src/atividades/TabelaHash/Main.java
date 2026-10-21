public class Main {

    public static void main(String[] args) {

        TabelaHash2 tabela = new TabelaHash2();

        tabela.inserirValor(10, "Ana");
        tabela.inserirValor(20, "Bruno");
        tabela.inserirValor(15, "Carlos");

        System.out.println(tabela.pegarValor(10));
        System.out.println(tabela.pegarValor(20));
        System.out.println(tabela.pegarValor(15));

        tabela.removerValor(10);

        System.out.println(tabela.pegarValor(10));
        System.out.println(tabela.pegarValor(20));
        
    }

}
