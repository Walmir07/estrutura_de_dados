public class TabelaHash2 {

    private Par[] tabela;
    private int quantidade;

    private static final Par APAGADO = new Par(-1, "");

    public TabelaHash2() {
        tabela = new Par[10];
        quantidade = 0;
    }

    private int hash(int matricula) {
        return Math.floorMod(matricula, tabela.length);
    }

    public String pegarValor(int matricula) {
        int posicao = hash(matricula);

        for (int i = 0; i < tabela.length; i++) {
            int atual = (posicao + i) % tabela.length;
            Par par = tabela[atual];

            if (par == null) {
                return null;
            }

            if (par != APAGADO &&
                par.getMatricula() == matricula) {
                return par.getNome();
            }
        }

        return null;
    }

    public void inserirValor(int matricula, String nome) {
        int posicao = hash(matricula);

        for (int i = 0; i < tabela.length; i++) {
            int atual = (posicao + i) % tabela.length;
            Par par = tabela[atual];

            if (par == null) {
                break;
            }

            if (par != APAGADO &&
                par.getMatricula() == matricula) {
                tabela[atual] = new Par(matricula, nome);
                return;
            }
        }

        if (quantidade == tabela.length) {
            redimensionar();
        }

        inserirSemRedimensionar(new Par(matricula, nome));
    }

    private void inserirSemRedimensionar(Par par) {
        int posicao = hash(par.getMatricula());
        int primeiraApagada = -1;

        for (int i = 0; i < tabela.length; i++) {
            int atual = (posicao + i) % tabela.length;

            if (tabela[atual] == APAGADO) {
                if (primeiraApagada == -1) {
                    primeiraApagada = atual;
                }
            } else if (tabela[atual] == null) {
                int destino = (primeiraApagada != -1)
                    ? primeiraApagada : atual;

                tabela[destino] = par;
                quantidade++;
                return;
            }
        }

        if (primeiraApagada != -1) {
            tabela[primeiraApagada] = par;
            quantidade++;
        } else {
            redimensionar();
            inserirSemRedimensionar(par);
        }
    }

    public void removerValor(int matricula) {
        int posicao = hash(matricula);

        for (int i = 0; i < tabela.length; i++) {
            int atual = (posicao + i) % tabela.length;
            Par par = tabela[atual];

            if (par == null) {
                return;
            }

            if (par != APAGADO &&
                par.getMatricula() == matricula) {
                tabela[atual] = APAGADO;
                quantidade--;
                return;
            }
        }
    }

    private void redimensionar() {
        Par[] tabelaAntiga = tabela;

        tabela = new Par[tabelaAntiga.length * 2];
        quantidade = 0;

        for (Par par : tabelaAntiga) {
            if (par != null && par != APAGADO) {
                inserirSemRedimensionar(par);
            }
        }
    }
}
