public class ListaLigada {

    private Elemento inicio;

    public ListaLigada() {
        this.inicio = null;
        // marca que o inicio está
        // disponivel para add um valor
    }

    public void add(int valor) {

        Elemento novo = new Elemento(valor);

        // Lista vazia
        if (inicio == null) {
            inicio = novo;
            return;
        }

        // lista com elementos
        Elemento atual = inicio;

        // caminha na lista até o final
        while (atual.getElemento() != null) {
            atual = atual.getElemento();
        }

        // anexa no final
        atual.setElemento(novo);
    }

    public boolean contains(int valor) {
        Elemento atual = inicio;
        while (atual != null) {
            if (atual.getValor() == valor) { // encontrou
                return true;
            }
            atual = atual.getElemento(); // avança pro proximo elemento
        }
        return false; // terminou a lista sem encontrar
    }

    public void listar() {

        if (inicio == null) {
            System.out.println("Lista Vazia");
            return;
        }

        Elemento atual = inicio;

        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getElemento();
        }
    }



}
