public class Ranking {

    private Score[] tabela;

    public Ranking(int qntdJogadores) {
        this.tabela = new Score[qntdJogadores];
    }

    public Score[] getTabela() {
        return tabela;
    }

    public void setTabela(Score[] tabela) {
        this.tabela = tabela;
    }

    public void add(int pos, Score score) {
        tabela[pos] = score;
    }


    public void maiorPontuacao() {
        if (tabela.length == 0) {
            System.out.println("Tabela vazia.");
            return;
        }

        int maior = tabela[0].getPontos();
        String jogador = tabela[0].getJogador();

        for (int i = 1; i < tabela.length; i++) {
            if (tabela[i].getPontos() > maior) {
                maior = tabela[i].getPontos();
                jogador = tabela[i].getJogador();
            }
        }
        System.out.println("Maior pontuação: " + maior + " (Jogador: " + jogador + ")");

}

    public void listar() {
        for (int i = 0; i < tabela.length; i++) {
            Score s = tabela[i];
            System.out.println(
                    "Posição " + i + ": " + s.getJogador() + " - " + s.getPontos()
                    + " pontos"
            );
        }
    }
}
