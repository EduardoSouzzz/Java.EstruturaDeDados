public class ListaLigada {

    private Elemento inicio;

    public ListaLigada() {
        this.inicio = null;
    }

    public void add(int valor) {

        Elemento novo = new Elemento(valor);

        // Caso 1: lista vazia
        if (inicio == null) {
            inicio = novo;
            return;
        }

        // Caso 2: lista com elementos
        Elemento atual = inicio;

        // Caminha até o último
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        // Anexa no final
        atual.setProximo(novo);
    }

    public boolean remover(int valor) {

        // Caso: lista vazia
        if (inicio == null) {
            return false;
        }

        // Caso: o elemento a remover está logo no começo
        if (inicio.getValor() == valor) {
            // "Remove" avançando o ponteiro inicio para o próximo nó
            inicio = inicio.getProximo();
            return true;
        }

        // Caso geral: procurar o nó ANTERIOR ao nó que queremos remover
        Elemento atual = inicio;

        // Andamos enquanto houver próximo
        // e enquanto o próximo NÃO for o que queremos remover
        while (atual.getProximo() != null &&
                atual.getProximo().getValor() != valor) {
            atual = atual.getProximo();
        }

        // Se chegamos no final e não achamos
        if (atual.getProximo() == null) {
            return false;
        }

        // Aqui: atual.getProximo() é o nó que deve ser removido
        // Então "pulamos" ele:
        atual.setProximo(atual.getProximo().getProximo());

        return true;
    }


    public void listar() {

        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Elemento atual = inicio;

        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }
}
