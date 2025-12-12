public class ListaLigada {

    private Elemento inicioDaLista;

    public ListaLigada() {
        this.inicioDaLista = null;
    }

    public void add(int valor) {

        Elemento novoValor = new Elemento(valor);

        if (inicioDaLista == null) {
            inicioDaLista = novoValor;
            return;
        }

        // Lista com os elementos
        Elemento atualValor = inicioDaLista;

        while (atualValor.getElementoNaLista() != null) {
            atualValor = atualValor.getElementoNaLista();
        }

        atualValor.setElementoNaLista(novoValor);

    }

    public void posAtual(int pos, int valor) {

        if (pos < 0) {
            throw new IllegalArgumentException("Posção Invalida");
        }

        Elemento novoValor = new Elemento(valor);

        if (pos == 0){
            novoValor.setElementoNaLista(inicioDaLista);
            inicioDaLista = novoValor;
            return;
        }

        Elemento atualValor = inicioDaLista;
        int index = 0;

    while (atualValor != null && index < pos - 1) {
        atualValor = atualValor.getElementoNaLista();
        index++;
    }

    if (atualValor == null) {
        throw new IllegalArgumentException("Posição maior que o tamanho da lista");
    }

    novoValor.setElementoNaLista(atualValor.getElementoNaLista());
    atualValor.setElementoNaLista(novoValor);
    }

    public void listar() {
        if (inicioDaLista == null) {
            System.out.println("Lista vazia");
            return;
        }

        Elemento atual = inicioDaLista;

        while (atual != null) {
            System.out.println(atual.getValorNaLista());
            atual = atual.getElementoNaLista();
        }
    }
}
